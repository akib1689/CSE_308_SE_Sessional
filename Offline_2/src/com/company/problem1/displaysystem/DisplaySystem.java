package com.company.problem1.displaysystem;

import com.company.problem1.Part;

public abstract class DisplaySystem extends Part {
    protected String resolution;

    public DisplaySystem(String name, String resolution, double price) {
        super(name, price);
        this.price = price;
    }


    public String getResolution() {
        return resolution;
    }

}
