package com.company.commodule;

public class WifiModule extends ComModule {
    public WifiModule() {
        super("Wifi Module", 500, 200);
    }

    @Override
    public void displayInfo() {
        System.out.println("Wifi Module");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Yearly Cost: " + yearly_cost);
    }
}
