package com.company.problem1.displayunit;

import com.company.problem1.displaysystem.DisplaySystemFactory;
import com.company.problem1.processor.ProcessorFactory;

import java.util.Objects;

class GeneralDisplay extends DisplayUnit {
    GeneralDisplay() {
        super("Poor",
                Objects.requireNonNull(ProcessorFactory.getProcessor("ATMega32")),
                Objects.requireNonNull(DisplaySystemFactory.createDisplaySystem("LED")));
    }

    @Override
    public void displayInfo() {
        System.out.println("General Display");
        System.out.println("Processor: ");
        processor.displayInfo();
        System.out.println("Display: ");
        display.displayInfo();
    }
}
