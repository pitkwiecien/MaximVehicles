package com.company.classes.vehicles.classes;

import com.company.classes.innerObjects.Drive;
import com.company.classes.model.Colour;
import com.company.classes.vehicles.EngineVehicle;

public class CarAmphibia extends EngineVehicle {
    public CarAmphibia(Integer price, Colour colour, String vehicleName, Integer maxSpeed, Drive drive, int tankCapacity) {
        super(price, colour, vehicleName, maxSpeed, drive, tankCapacity);
    }
}
