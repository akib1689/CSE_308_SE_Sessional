package com.company.problem1.displayunit;

import com.company.problem1.displaysystem.DisplaySystem;
import com.company.problem1.processor.Processor;

/*
* This is the abstract class that be accessed by the client of the package
* A display unit for each booth will have the following
* one processor, options are: specified in the processor enumerator
* one display, options are: specified in the display system enumerator
* */
public abstract class DisplayUnit {
    protected Processor processor;
    protected DisplaySystem display;
    protected double price;
    DisplayUnit(Processor processor, DisplaySystem display) {
        this.processor = processor;
        this.display = display;
    }

    public double getPrice() {
        return price;
    }

    // this method will be used to display the information about the display unit
    public abstract void display();
}
