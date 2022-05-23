package com.company.classes.vehicles.classes;

import com.company.classes.innerObjects.ElectricEngine;
import com.company.classes.model.Colour;
import com.company.classes.vehicles.Vehicle;

public class Tram extends Vehicle {
    public Tram(Integer price, Colour colour, String vehicleName, Integer maxSpeed, ElectricEngine drive) {
        super(price, colour, vehicleName, maxSpeed, drive);
    }
}
