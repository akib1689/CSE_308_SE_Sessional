package com.company.problem1.processor;

class RaspberryPi extends Processor {

    RaspberryPi() {
        super("Raspberry Pi", 350, 1.9);
    }

    @Override
    public void displayInfo() {
        System.out.println("Processor name: " + name);
        System.out.println("Processor speed: " + speed + " GHz");
        System.out.println("Processor price: " + price + " $");
    }
}
