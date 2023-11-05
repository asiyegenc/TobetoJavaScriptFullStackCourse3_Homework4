package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("The car with Id " + "Car.getId()" + "has been succesfully added to database using Hibernate ");
    }

    @Override
    public void update(Car car) {
        System.out.println("The car with Id " + "Car.getId()" + "has been succesfully updated to database using Hibernate ");
    }

    @Override
    public void delete(Car car) {
        System.out.println("The car with Id " + "Car.getId()" + "has been succesfully deleted from database using Hibernate ");

    }
}
