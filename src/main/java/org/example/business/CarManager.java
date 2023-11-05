package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager {
    private CarDao carDao;
    private List<Logger>loggers;


    public CarManager(CarDao carDao, List<Logger>loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }
public void add(Car car) throws Exception {
        if (car.getPrice() > 3000000){
            throw new Exception("The price of the car must be lower than 3000000!");
        }

        if (car.getPrice() < 200000) {
            throw new Exception("The price of the car must be higher than 200000!");
        }

        if (car.getKm() > 500000) {
            throw new Exception("Cars with higher 500000 cannot be listed");
        }

        if (car.getYearOfProduction() < 2010) {
            throw new Exception("Cars manufactured before the year 2010 cannot be listed");
        }
        carDao.add(car);
    for (Logger logger : loggers ) {
       logger.log(car.getBrand() + " " + car.getModel() + "car added.");
    }
}
        public void update(Car car) {
        carDao.update(car);
            for (Logger logger : loggers ) {
                logger.log(car.getBrand() + " " + car.getModel() + "car updated.");
            }
        }
        public void delete(Car car) {
        carDao.delete(car);
            for (Logger logger : loggers ) {
                logger.log(car.getBrand() + " " + car.getModel() + "car deleted.");
            }
        }
    }