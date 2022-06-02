package com.company.driverapp;

public abstract class DriverApplication {
    protected double cost;

    public DriverApplication(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
