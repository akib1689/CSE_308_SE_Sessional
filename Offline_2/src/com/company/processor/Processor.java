package com.company.processor;

public abstract class Processor {
    protected String name;
    protected double price;
    protected double speed;

    public Processor(String name, double price, double speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo();
}
