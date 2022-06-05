/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem1;

public abstract class Part {
    protected String name;
    protected double price;

    public Part(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}
