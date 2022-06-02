package com.company.processor;

class RaspberryPi extends Processor {

    public RaspberryPi() {
        super("Raspberry Pi", 350, 1.9);
    }

    @Override
    public void displayInfo() {
        System.out.println("Raspberry Pi");
        System.out.println("Processor name: " + name);
        System.out.println("Processor speed: " + speed + " GHz");
    }
}
