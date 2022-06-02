package com.company.processor;

class ArduinoMega extends Processor {

    public ArduinoMega() {
        super("Arduino Mega", 250, 1.5);
    }

    @Override
    public void displayInfo() {
        System.out.println("Arduino Mega");
        System.out.println("Processor name: " + name);
        System.out.println("Processor speed: " + speed + " GHz");
    }
}
