/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */
package com.company.commodule;
/*
* This is the abstract class that will represent the communication module and hold the information
* about the communication module that is present in the machine
*
* -> This class will be extended by the ComModule class
* name -> name of the communication module
* price -> initial price of the communication module
* commission -> yearly cost of the communication module
* */
public abstract class ComModule {
    protected String name;
    protected double price;
    protected double yearly_cost;

    public ComModule(String name, double price, double yearly_cost) {
        this.name = name;
        this.price = price;
        this.yearly_cost = yearly_cost;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getYearlyCost() {
        return yearly_cost;
    }

    public abstract void displayInfo();

}
