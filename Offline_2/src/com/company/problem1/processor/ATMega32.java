package com.company.problem1.processor;

class ATMega32 extends Processor {

    ATMega32() {
        super("ATMega32", 150, 1.2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Processor name: " + name);
        System.out.println("Processor speed: " + speed + " GHz");
        System.out.println("Processor price: " + price + " $");
    }
}
