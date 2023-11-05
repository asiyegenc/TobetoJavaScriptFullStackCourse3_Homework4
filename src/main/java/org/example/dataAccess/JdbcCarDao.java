package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("The car with Id " + "Car.getId()" + "has been succesfully added to database using JDBC ");
    }

    @Override
    public void update(Car car) {
        System.out.println("The car with Id " + "Car.getId()" + "has been succesfully updated to database using JDBC ");
    }

    @Override
    public void delete(Car car) {
        System.out.println("The car with Id " + "Car.getId()" + "has been succesfully deleted from database using JDBC ");
    }
}