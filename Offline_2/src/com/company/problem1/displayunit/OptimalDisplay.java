package com.company.problem1.displayunit;

import com.company.problem1.displaysystem.DisplaySystemFactory;
import com.company.problem1.processor.ProcessorFactory;

class OptimalDisplay extends DisplayUnit {
    OptimalDisplay() {
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
