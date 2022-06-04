package com.company.classes.model;

import com.company.classes.drives.CombustionEngine;
import com.company.classes.model.Colour;

// dziedziczenie klasy
public abstract class CombustionEngineVehicle extends EngineVehicle{
    private int tankCapacity;

    public CombustionEngineVehicle(Integer price, Colour colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity) {
        super(price, colour, vehicleName, maxSpeed, engine);
        this.tankCapacity = tankCapacity;
    }

    public void launchEngine(){
        System.out.println("Launching engine of vehicle: " + getVehicleName());
    }

    // dynamiczny polimorfizm (nadpisywanie metody)
    @Override
    public CombustionEngine getDrive(){
        return (CombustionEngine) super.getDrive();
    }
}