/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.management;

import com.company.commodule.ComModuleFactory;
import com.company.displayunit.DisplayUnitFactory;
import com.company.driverapp.DriverFactory;

class MicroManagementSystem extends ManagementSystem {
    public MicroManagementSystem() {
        super(DisplayUnitFactory.getDisplayUnit("Optimal"),
                ComModuleFactory.getComModule("Cellular"),
                DriverFactory.getDriverApp(),
                5);
    }

    @Override
    public void displayInformation() {
        //prints the information related to the different parts of the system
        System.out.println("Your micro management system is ready!");
        super.displayInformation();
    }
}
