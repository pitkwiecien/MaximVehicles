package com.company.classes.model;

import com.company.classes.drives.CombustionEngine;

public class FlyingVehicle extends CombustionEngineVehicle{
    private int maxHeight;

    public FlyingVehicle(Integer price, com.company.classes.model.Colour colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity);
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
