package com.company.problem1.displaysystem;

class LED extends DisplaySystem{
    public LED() {
        super("LED", "1280x720", 1200);
    }

    @Override
    public void displayInfo() {
        System.out.print("\tLED Display");
        System.out.print("\tResolution: " + resolution);
        System.out.println("\tPrice: " + price);
    }
}
