package com.company.displaysystem;

class LED extends DisplaySystem{
    public LED() {
        super("LED", "1280x720", 1200);
    }

    @Override
    public void displayInfo() {
        System.out.println("LED");
        System.out.println("Resolution: " + resolution);
        System.out.println("Price: " + price);
    }
}
