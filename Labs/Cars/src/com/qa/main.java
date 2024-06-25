package com.qa;

import com.qa.parent.Vehicle;

public class main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Skoda", "Fabia", "Diesel");
        Vehicle v2 = new Vehicle("Skoda", "Fabia Estate", "Petrol");
        Vehicle v3 = new Vehicle("VW", "Polo GTi", "Petrol");
        Vehicle v4 = new Vehicle("Vauxhall", "Corsa-e", "Electric");

        Vehicle[] vehicleArray = new Vehicle[4];

        vehicleArray[0] = v1;
        vehicleArray[1] = v2;
        vehicleArray[2] = v3;
        vehicleArray[3] = v4;


    for (int x = 0; x < vehicleArray.length; x++){
        System.out.println(vehicleArray[x]);
    }


    }

}
