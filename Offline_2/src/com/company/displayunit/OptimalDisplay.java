package com.company.displayunit;

import com.company.displaysystem.DisplaySystem;
import com.company.displaysystem.DisplaySystemFactory;
import com.company.processor.ProcessorFactory;

class OptimalDisplay extends DisplayUnit {
    public OptimalDisplay() {
        super(ProcessorFactory.getProcessor("Arduino Mega"), DisplaySystemFactory.createDisplaySystem("LED"));
        price = processor.getPrice() + display.getPrice();
    }

    @Override
    public void display() {
        System.out.println("Optimal Display");
        System.out.println("Processor: ");
        processor.displayInfo();
        System.out.println("Display: ");
        display.displayInfo();
    }
}
