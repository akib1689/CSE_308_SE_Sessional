package com.company.problem1.displayunit;
/*
* This is the factory class that will create the display unit for the client
* */
public class DisplayUnitFactory {
    public static DisplayUnit getDisplayUnit(String type) {
        if (type.equalsIgnoreCase("Deluxe")) {
            DeluxeDisplayBuilder builder = new DeluxeDisplayBuilder();
            DisplayUnitDirector.construct(builder);
            return builder.getDisplayUnit();
        } else if (type.equalsIgnoreCase("Optimal")) {
            OptimalDisplayBuilder builder = new OptimalDisplayBuilder();
            DisplayUnitDirector.construct(builder);
            return builder.getDisplayUnit();
        } else if (type.equalsIgnoreCase("General")) {
            GeneralDisplayBuilder builder = new GeneralDisplayBuilder();
            DisplayUnitDirector.construct(builder);
            return builder.getDisplayUnit();
        } else {
            return null;
        }
    }
}
