package com.qa.child;

import com.qa.parent.Vehicle;


public class Train extends Vehicle {
    private int numberOfCars;
    private int capacity;

    public Train(int numberOfCars, int capacity) {
        this.numberOfCars = numberOfCars;
        this.capacity = capacity;
    }
    public Train (String make, String model, int miles_travelled, String colour, int numberOfCars, int capacity) {
        super(make, model, miles_travelled, colour);
        this.numberOfCars = numberOfCars;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Train " + super.toString() + " Number of cars = "+ numberOfCars + "capacity = " + capacity;
    }
}
