/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */
package com.company.problem1.commodule;

import com.company.problem1.Part;

/*
* This is the abstract class that will represent the communication module and hold the information
* about the communication module that is present in the machine
*
* -> This class will be extended by the ComModule class
* name -> name of the communication module
* price -> initial price of the communication module
* commission -> yearly cost of the communication module
* */
public abstract class ComModule extends Part {
    protected double yearly_cost;

    ComModule(String name, double price, double yearly_cost) {
        super(name, price);
        this.yearly_cost = yearly_cost;
    }

    public double getYearlyCost() {
        return yearly_cost;
    }

}
