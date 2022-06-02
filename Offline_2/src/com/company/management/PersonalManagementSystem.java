/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.management;

import com.company.commodule.ComModuleFactory;
import com.company.displayunit.DisplayUnitFactory;
import com.company.driverapp.DriverFactory;

class PersonalManagementSystem extends ManagementSystem {
    public PersonalManagementSystem() {
        super(DisplayUnitFactory.getDisplayUnit("Optimal"),
                ComModuleFactory.getComModule("Wifi"),
                DriverFactory.getDriverApp(),
                1);
    }

    @Override
    public void displayInformation() {
        System.out.println("Your personal management system is ready!");
        super.displayInformation();
    }
}
