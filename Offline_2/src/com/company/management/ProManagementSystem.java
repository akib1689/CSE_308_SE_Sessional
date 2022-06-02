/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.management;

import com.company.commodule.ComModuleFactory;
import com.company.displayunit.DisplayUnitFactory;
import com.company.driverapp.DriverFactory;

class ProManagementSystem extends ManagementSystem {
    public ProManagementSystem() {
        super(DisplayUnitFactory.getDisplayUnit("Deluxe"),
                ComModuleFactory.getComModule("Wifi"),
                DriverFactory.getDriverApp(),
                9);
    }

    @Override
    public void displayInformation() {
        System.out.println("Your pro management system is ready!");
        super.displayInformation();
    }
}
