package com.qa.child;

import com.qa.parent.Vehicle;

public class Aeroplane extends Vehicle {

    private int wingspan;
    private String haultype;


    public Aeroplane (int wingspan, String haultype){
        this.wingspan = wingspan;
        this.haultype = haultype;
    }
    public Aeroplane (int wingspan, String haultype, String make, String model, int miles_travelled, String colour){
        super(make, model, miles_travelled, colour);
        this.wingspan = wingspan;
        this.haultype = haultype;
    }

    @Override
    public String toString() {
        return "Aeroplane " +super.toString()+
                "wingspan=" + wingspan +
                ", haultype=" + haultype;
    }
}
