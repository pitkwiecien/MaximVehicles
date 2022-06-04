package com.company.classes.vehicles.classes;

import com.company.classes.drives.CombustionEngine;
import com.company.classes.model.Colour;
import com.company.classes.model.CombustionEngineVehicle;
import com.company.classes.model.vehicleTypes.Aerial;
import com.company.classes.model.vehicleTypes.Terrestrial;

public class JetFighter extends CombustionEngineVehicle implements Terrestrial, Aerial {
    private int maxHeight;

    public JetFighter(Integer price, Colour colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity);
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Driving with velocity equal to " + velocity);
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
