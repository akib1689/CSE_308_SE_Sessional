package com.company.displayunit;
/*
* This is the factory class that will create the display unit for the client
* */
public class DisplayUnitFactory {
    public static DisplayUnit getDisplayUnit(String type) {
        if (type.equalsIgnoreCase("Deluxe")) {
            return new DeluxeDisplay();
        } else if (type.equalsIgnoreCase("Optimal")) {
            return new OptimalDisplay();
        } else if (type.equalsIgnoreCase("General")) {
            return new GeneralDisplay();
        } else {
            return null;
        }
    }
}
