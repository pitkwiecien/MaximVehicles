package com.company.classes.vehicles.classes;

import com.company.classes.drives.CombustionEngine;
import com.company.classes.model.Colour;
import com.company.classes.model.CombustionEngineVehicle;
import com.company.classes.model.vehicleTypes.Aerial;
import com.company.classes.model.vehicleTypes.Aquatic;

public class FloatPlane extends CombustionEngineVehicle implements Aquatic, Aerial {
    private int maxHeight;

    public FloatPlane(Integer price, Colour colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
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
    public void swim(int velocity) {
        System.out.println("Swimming with velocity equal to " + velocity);
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
