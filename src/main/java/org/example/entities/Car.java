package org.example.entities;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int yearOfProduction;
    private double km;
    private String fuelType;
    private int unitInStock;
    private double price;

    public Car() {
    }

    public Car(int id, String brand, String model, int yearOfProduction, double km, String fuelType, int unitInStock, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.km = km;
        this.fuelType = fuelType;
        this.unitInStock = unitInStock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
