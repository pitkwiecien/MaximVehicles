package com.company.classes.model;

import com.company.classes.drives.Drive;

public class EngineVehicle extends Vehicle{
    public EngineVehicle(Integer price, com.company.classes.model.Colour colour, String vehicleName, Integer maxSpeed, Drive drive) {
        super(price, colour, vehicleName, maxSpeed, drive);
    }

    public void refuel(int fuelAmount){
        System.out.println("Refueling " + fuelAmount + " litres");
    }
}
