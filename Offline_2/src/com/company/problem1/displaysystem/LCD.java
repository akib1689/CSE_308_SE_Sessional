package com.company.problem1.displaysystem;

class LCD extends DisplaySystem{
    public LCD() {
        super("LCD", "852x480", 1000);
    }

    @Override
    public void displayInfo() {
        System.out.print("\tLCD Display");
        System.out.print("\tResolution: " + resolution);
        System.out.println("\tPrice: " + price);
    }
}
