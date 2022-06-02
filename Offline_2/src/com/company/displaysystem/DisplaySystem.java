package com.company.displaysystem;

public abstract class DisplaySystem {
    protected String name;
    protected String resolution;
    protected double price;

    public DisplaySystem(String name, String resolution, double price) {
        this.name = name;
        this.resolution = resolution;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }

    public abstract void displayInfo();
}
