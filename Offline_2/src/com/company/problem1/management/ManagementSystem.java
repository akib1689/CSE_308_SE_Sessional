package com.company.problem1.management;

import com.company.problem1.commodule.ComModule;
import com.company.problem1.displayunit.DisplayUnit;
import com.company.problem1.driverapp.DriverApplication;

public class ManagementSystem {
    protected DisplayUnit displayUnit;
    protected ComModule comModule;
    protected DriverApplication driverApplication;
    protected int displayUnitCount;

    ManagementSystem(DisplayUnit displayUnit, ComModule comModule, DriverApplication driverApplication, int displayUnitCount) {
        this.displayUnit = displayUnit;
        this.comModule = comModule;
        this.driverApplication = driverApplication;
        this.displayUnitCount = displayUnitCount;
    }

    public double getTotalYearlyCost(){
        return displayUnitCount * (displayUnit.getPrice() + comModule.getPrice() + comModule.getYearlyCost()) + driverApplication.getCost();
    }

    public void displayInformation(){
        displayUnit.displayInfo();
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
