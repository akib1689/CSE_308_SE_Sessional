package com.company.problem1.displayunit;


import com.company.problem1.displaysystem.DisplaySystemFactory;
import com.company.problem1.processor.ProcessorFactory;

class DeluxeDisplay extends DisplayUnit {
    DeluxeDisplay() {
        super(ProcessorFactory.getProcessor("Raspberry Pi"), DisplaySystemFactory.createDisplaySystem("LCD"));
        price = processor.getPrice() + display.getPrice();
    }

    @Override
    public void display() {
        System.out.println("Deluxe Display");
        System.out.println("Processor: ");
        processor.displayInfo();
        System.out.println("Display: ");
        display.displayInfo();
    }
}
