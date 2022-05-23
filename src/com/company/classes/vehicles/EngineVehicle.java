package com.company.classes.vehicles;

import com.company.classes.innerObjects.Drive;
import com.company.classes.model.Colour;

public abstract class EngineVehicle extends Vehicle{
    private int tankCapacity;

    public EngineVehicle(Integer price, Colour colour, String vehicleName, Integer maxSpeed, Drive drive, int tankCapacity) {
        super(price, colour, vehicleName, maxSpeed, drive);
        this.tankCapacity = tankCapacity;
    }
}