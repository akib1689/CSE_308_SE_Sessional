package com.company.displayunit;


import com.company.displaysystem.DisplaySystem;
import com.company.displaysystem.DisplaySystemFactory;
import com.company.processor.ProcessorFactory;

class DeluxeDisplay extends DisplayUnit {
    public DeluxeDisplay() {
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
