package com.company.problem1.driverapp;

public abstract class DriverApplication {
    protected double cost;

    DriverApplication(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
