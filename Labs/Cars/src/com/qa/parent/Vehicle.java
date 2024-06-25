package com.qa.parent;

public class Vehicle {
    private String make;
    private String model;
    private String fuel;


    public Vehicle (){
    }

    public Vehicle ( String make, String model, String fuel) {
        this.make = make;
        this.model = model;
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
