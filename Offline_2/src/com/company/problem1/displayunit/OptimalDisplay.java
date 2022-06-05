package com.company.problem1.displayunit;

import com.company.problem1.displaysystem.DisplaySystemFactory;
import com.company.problem1.processor.ProcessorFactory;

import java.util.Objects;

class OptimalDisplay extends DisplayUnit {
    OptimalDisplay() {
        super("Poor",
                Objects.requireNonNull(ProcessorFactory.getProcessor("Arduino Mega")),
                Objects.requireNonNull(DisplaySystemFactory.createDisplaySystem("LED")));

    }

    @Override
    public void displayInfo() {
        System.out.println("Optimal Display");
        System.out.println("Processor: ");
        processor.displayInfo();
        System.out.println("Display: ");
        display.displayInfo();
    }
}
