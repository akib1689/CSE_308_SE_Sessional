/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.management;

import com.company.commodule.ComModuleFactory;
import com.company.displayunit.DisplayUnitFactory;
import com.company.driverapp.DriverFactory;

class NanoManagementSystem extends ManagementSystem{
    public NanoManagementSystem() {
        super(DisplayUnitFactory.getDisplayUnit("General"),
                ComModuleFactory.getComModule("Cellular"),
                DriverFactory.getDriverApp(),
                1);
    }

    @Override
    public void displayInformation() {
        System.out.println("Your nano management system is ready!");
        super.displayInformation();
    }
}
