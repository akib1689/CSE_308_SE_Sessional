package com.company.processor;

class ATMega32 extends Processor {

    public ATMega32() {
        super("ATMega32", 150, 1.2);
    }

    @Override
    public void displayInfo() {
System.out.println("ATMega32");
        System.out.println("Processor name: " + name);
        System.out.println("Processor speed: " + speed + " GHz");
    }
}
