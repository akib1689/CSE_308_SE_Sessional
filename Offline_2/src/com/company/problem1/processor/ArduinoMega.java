package com.company.problem1.processor;

class ArduinoMega extends Processor {

    ArduinoMega() {
        super("Arduino Mega", 250, 1.5);
    }

    @Override
    public void displayInfo() {
        System.out.println("Processor name: " + name);
        System.out.println("Processor speed: " + speed + " GHz");
        System.out.println("Processor price: " + price + " $");
    }
}
