package com.company.displaysystem;

class LCD extends DisplaySystem{
    public LCD() {
        super("LCD", "852x480", 1000);
    }

    @Override
    public void displayInfo() {
        System.out.println("LCD");
        System.out.println("Resolution: " + resolution);
        System.out.println("Price: " + price);
    }
}
