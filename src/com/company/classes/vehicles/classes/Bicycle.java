package com.company.classes.vehicles.classes;

import com.company.classes.innerObjects.BicycleDrive;
import com.company.classes.model.Colour;
import com.company.classes.vehicles.Vehicle;

public class Bicycle extends Vehicle {
    public Bicycle(Integer price, Colour colour, String vehicleName, Integer maxSpeed, BicycleDrive drive) {
        super(price, colour, vehicleName, maxSpeed, drive);
    }
}
