package com.qa;

import com.qa.child.Aeroplane;
import com.qa.child.Train;
import com.qa.parent.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Skoda", "Fabia", 15237, "blue");
        Vehicle v2 = new Vehicle("Skoda", "Fabia Estate", 37852, "black");
        Vehicle v3 = new Vehicle("VW", "Polo GTi",15061, "red");
        Vehicle v4 = new Vehicle("Vauxhall", "Corsa-e",1024,"burgundy");
        Aeroplane v5 = new Aeroplane(38, "longhaul", "Boeing", "737", 124533, "red");
        Train v6 = new Train("LNER", "4472 Flying Scotsman", 315732, "Red", 0, 3 );
 //public Train (String make, String model, int miles_travelled, String colour, int numberOfCars, int capacity) {
        Vehicle[] vehicleArray = new Vehicle[6];

        vehicleArray[0] = v1;
        vehicleArray[1] = v2;
        vehicleArray[2] = v3;
        vehicleArray[3] = v4;
        vehicleArray[4] = v5;
        vehicleArray[5] = v6;


        for (int x = 0; x < vehicleArray.length; x++){
            System.out.println(vehicleArray[x]);
        }





    }


}
