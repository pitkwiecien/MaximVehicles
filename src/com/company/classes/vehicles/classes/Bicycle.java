package com.company.classes.vehicles.classes;

import com.company.classes.drives.BicycleDrive;
import com.company.classes.model.Colour;
import com.company.classes.model.Vehicle;
import com.company.classes.model.vehicleTypes.Terrestrial;

public class Bicycle extends Vehicle implements Terrestrial {
    public Bicycle(Integer price, Colour colour, String vehicleName, Integer maxSpeed, BicycleDrive drive) {
        super(price, colour, vehicleName, maxSpeed, drive);
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Driving with velocity equal to " + velocity);
    }
}
