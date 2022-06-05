package com.company.problem1.displayunit;

import com.company.problem1.displaysystem.DisplaySystemFactory;
import com.company.problem1.processor.ProcessorFactory;

class GeneralDisplay extends DisplayUnit {
    GeneralDisplay() {
        super(ProcessorFactory.getProcessor("ATMega32"), DisplaySystemFactory.createDisplaySystem("LED"));
        price = processor.getPrice() + display.getPrice();
    }

    @Override
    public void display() {
        System.out.println("General Display");
        System.out.println("Processor: ");
        processor.displayInfo();
        System.out.println("Display: ");
        display.displayInfo();
    }
}
