package com.company.problem1.management;

import com.company.problem1.commodule.ComModule;
import com.company.problem1.displayunit.DisplayUnit;
import com.company.problem1.driverapp.DriverApplication;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    protected List<DisplayUnit> displayUnits;
    protected ComModule comModule;
    protected DriverApplication driverApplication;
    protected int displayUnitCount;

    public ManagementSystem() {
        displayUnits = new ArrayList<>();
        comModule = null;
        driverApplication = null;
        displayUnitCount = 0;
    }

    public void addDisplayUnit(DisplayUnit displayUnit) {
        this.displayUnits.add(displayUnit);
        displayUnitCount++;
    }


    void setComModule(ComModule comModule) {
        this.comModule = comModule;
    }

    void setDriverApplication(DriverApplication driverApplication) {
        this.driverApplication = driverApplication;
    }


    public double getTotalYearlyCost(){
        double totalYearlyCost = 0;
        for (DisplayUnit displayUnit : displayUnits) {
            totalYearlyCost += displayUnit.getPrice();
        }
        System.out.println("Total display cost: " + totalYearlyCost);
        totalYearlyCost += ((comModule.getPrice() + comModule.getYearlyCost()) * displayUnitCount);
        return totalYearlyCost + driverApplication.getCost();
    }

    public void displayInformation(){
        System.out.println("Management System Information");
        System.out.println("Display Units: " + displayUnitCount);
        for (DisplayUnit displayUnit : displayUnits) {
            displayUnit.displayInfo();
        }
        comModule.displayInfo();
        System.out.println("Driver Application Cost: " + driverApplication.getCost());
        System.out.println("Total Yearly Cost: " + getTotalYearlyCost());

        /*displayUnits.displayInfo();
        comModule.displayInfo();
        System.out.println("Number of display units: " + displayUnitCount);
        System.out.println("Driver application cost: " + driverApplication.getCost());
        String str = displayUnitCount +
                " * (" + displayUnits.getPrice() +
                " + " + comModule.getPrice() +
                " + " + comModule.getYearlyCost() +
                ") + " + driverApplication.getCost() +
                " = " + getTotalYearlyCost();
        System.out.println("Total yearly cost: " + str);*/
    }
}
