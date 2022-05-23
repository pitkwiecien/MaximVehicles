package com.company.classes.vehicles.classes;

import com.company.classes.innerObjects.Drive;
import com.company.classes.model.Colour;
import com.company.classes.vehicles.EngineVehicle;

public class JetFighter extends EngineVehicle {
    private int maxHeight;

    public JetFighter(Integer price, Colour colour, String vehicleName, Integer maxSpeed, Drive drive, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, drive, tankCapacity);
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
