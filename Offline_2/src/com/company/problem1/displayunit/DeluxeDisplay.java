package com.company.problem1.displayunit;


import com.company.problem1.displaysystem.DisplaySystemFactory;
import com.company.problem1.processor.ProcessorFactory;

import java.util.Objects;

class DeluxeDisplay extends DisplayUnit {
    DeluxeDisplay() {
        super("Deluxe", Objects.requireNonNull(ProcessorFactory.getProcessor("Raspberry Pi")), DisplaySystemFactory.createDisplaySystem("LCD"));
    }

    @Override
    public void displayInfo() {
        System.out.println("Deluxe Display");
        System.out.println("Processor: ");
        processor.displayInfo();
        System.out.println("Display: ");
        display.displayInfo();
    }
}
