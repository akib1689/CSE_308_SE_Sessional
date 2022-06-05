package com.company.problem1.processor;

import com.company.problem1.Part;

public abstract class Processor extends Part {
    protected double speed;

    public Processor(String name, double price, double speed) {
        super(name, price);
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void displayInfo() {
        System.out.print("\tProcessor name: " + name);
        System.out.print("\tProcessor speed: " + speed + " GHz");
        System.out.println("\tProcessor price: " + price + " $");
    }

}
