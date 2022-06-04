package com.company.classes.vehicles.classes;

import com.company.classes.drives.CombustionEngine;
import com.company.classes.model.Colour;
import com.company.classes.model.CombustionEngineVehicle;
import com.company.classes.model.vehicleTypes.Terrestrial;

public class DeliveryVan extends CombustionEngineVehicle implements Terrestrial {
    public DeliveryVan(Integer price, Colour colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity);
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Driving with velocity equal to " + velocity);
    }
}
