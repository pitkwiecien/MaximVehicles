package com.company.classes.vehicles.classes;

import com.company.classes.drives.ElectricEngine;
import com.company.classes.model.Colour;
import com.company.classes.model.EngineVehicle;
import com.company.classes.model.Vehicle;
import com.company.classes.model.vehicleTypes.Terrestrial;

public class Tram extends EngineVehicle implements Terrestrial {
    public Tram(Integer price, Colour colour, String vehicleName, Integer maxSpeed, ElectricEngine engine) {
        super(price, colour, vehicleName, maxSpeed, engine);
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Driving with velocity equal to " + velocity);
    }
}
