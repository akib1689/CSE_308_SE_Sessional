/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem1.management;

/*
* builder class for creating the management systems
* */

import com.company.problem1.commodule.ComModule;
import com.company.problem1.commodule.ComModuleFactory;
import com.company.problem1.displayunit.DisplayUnit;
import com.company.problem1.displayunit.DisplayUnitFactory;
import com.company.problem1.driverapp.DriverFactory;

public class ManagementSystemBuilder implements SystemBuilder {
    private final ManagementSystem system;

    public ManagementSystemBuilder() {
        system = new ManagementSystem();
    }

    @Override
    public void buildDisplay(String displayType, int numberOfDisplay) {
        for (int i = 0; i < numberOfDisplay; i++) {
            DisplayUnit displayUnit = DisplayUnitFactory.getDisplayUnit(displayType);
            system.addDisplayUnit(displayUnit);
        }
    }

    @Override
    public void buildComModule(String comModuleType) {
        ComModule comModule = ComModuleFactory.getComModule(comModuleType);
        system.setComModule(comModule);
    }

    @Override
    public void buildDriverApp() {
        system.setDriverApplication(DriverFactory.getDriverApp());
    }

    @Override
    public ManagementSystem getManagementSystem() {
        return system;
    }
}
