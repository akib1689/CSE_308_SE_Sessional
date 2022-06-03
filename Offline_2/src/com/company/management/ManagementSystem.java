package com.company.management;

import com.company.commodule.ComModule;
import com.company.displaysystem.DisplaySystem;
import com.company.displayunit.DisplayUnit;
import com.company.driverapp.DriverApplication;

public class ManagementSystem {
    protected DisplayUnit displayUnit;
    protected ComModule comModule;
    protected DriverApplication driverApplication;
    protected int displayUnitCount;

    public ManagementSystem(DisplayUnit displayUnit, ComModule comModule, DriverApplication driverApplication, int displayUnitCount) {
        this.displayUnit = displayUnit;
        this.comModule = comModule;
        this.driverApplication = driverApplication;
        this.displayUnitCount = displayUnitCount;
    }

    public double getTotalYearlyCost(){
        return displayUnitCount * (displayUnit.getPrice() + comModule.getPrice() + comModule.getYearlyCost()) + driverApplication.getCost();
    }

    public void displayInformation(){
        displayUnit.display();
        comModule.displayInfo();
        System.out.println("Number of display units: " + displayUnitCount);
        System.out.println("Driver application cost: " + driverApplication.getCost());
        String str = displayUnitCount +
                " * (" +displayUnit.getPrice() +
                " + " + comModule.getPrice() +
                " + " + comModule.getYearlyCost() +
                ") + " + driverApplication.getCost() +
                " = " + getTotalYearlyCost();
        System.out.println("Total yearly cost: " + str);
    }
}
