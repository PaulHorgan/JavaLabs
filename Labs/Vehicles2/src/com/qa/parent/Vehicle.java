package com.qa.parent;

public class Vehicle {

    private String make;
    private String model;
    private int miles_travelled;
    private String colour;

    public Vehicle () {
    }

    public Vehicle(String make, String model, int miles_travelled, String colour){
        this.make=make;
        this.model=model;
        this.miles_travelled=miles_travelled;
        this.colour=colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMiles_travelled() {
        return miles_travelled;
    }

    public void setMiles_travelled(int miles_travelled) {
        this.miles_travelled = miles_travelled;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return  "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles_travelled=" + miles_travelled +
                ", colour='" + colour ;

    }
}
