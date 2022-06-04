package com.company.classes.vehicles.classes;

import com.company.classes.drives.CombustionEngine;
import com.company.classes.model.Colour;
import com.company.classes.model.CombustionEngineVehicle;
import com.company.classes.model.FlyingVehicle;
import com.company.classes.model.vehicleTypes.Aerial;

public class Helicopter extends FlyingVehicle implements Aerial {
    private int maxHeight;

    public Helicopter(Integer price, Colour colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity, maxHeight);
    }

    @Override
    public void fly(int velocity, int height) {
        System.out.println("Flying with velocity equal to " + velocity + " and at " + height + " metres");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }
}
