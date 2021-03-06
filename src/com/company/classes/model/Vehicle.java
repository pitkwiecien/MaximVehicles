package com.company.classes.model;

import com.company.classes.MyObject;
import com.company.classes.drives.Drive;
import com.company.classes.model.Colour;

public abstract class Vehicle extends MyObject {
    private Colour colour;
    private String vehicleName;
    private Integer maxSpeed;
    private Drive drive;

    public Vehicle(Integer price, Colour colour, String vehicleName, Integer maxSpeed, Drive drive) {
        super(price);
        this.colour = colour;
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
        this.drive = drive;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    @Override
    public void buy(String price){
        System.out.println("Buying " + getClassName() + " " + this.vehicleName + ", price = " + price);
    }

    @Override
    public void sell(String price){
        System.out.println("Selling " + getClassName() + " " + this.vehicleName + ", price = " + price);
    }

    public void printCarName(){
        System.out.println(vehicleName);
    }
}
