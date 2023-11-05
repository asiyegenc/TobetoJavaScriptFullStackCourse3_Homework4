package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car(1, "volkswagen", "golf", 2013, 30000, "diesel", 240, 700000);
        Car car2 = new Car(2, "Honda", "Civic", 2021, 350000, "diesel", 4, 400000);
        Car car3 = new Car(3, "BMV", "3 Series", 2022, 10000, "petrol", 81, 900000);
        Car car4 = new Car(4, "Mercedes-Benz", "E Series", 2017, 550000, "diesel", 24, 1200000);
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        CarManager carManager = new CarManager(new HibernateCarDao(), loggers);
        //CarManager carManager1 =new CarManager(new HibernateCarDao());

        carManager.add(car1);
        carManager.update(car1);
        carManager.delete(car1);

        carManager.add(car2);
        carManager.update(car2);
        carManager.delete(car2);

        carManager.add(car3);
        carManager.update(car3);
        carManager.delete(car3);

        carManager.add(car4);
        carManager.update(car4);
        carManager.delete(car4);
    }
}