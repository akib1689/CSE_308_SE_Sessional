package com.company.displayunit;

import com.company.displaysystem.DisplaySystemFactory;
import com.company.processor.ProcessorFactory;

class GeneralDisplay extends DisplayUnit {
    public GeneralDisplay() {
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
