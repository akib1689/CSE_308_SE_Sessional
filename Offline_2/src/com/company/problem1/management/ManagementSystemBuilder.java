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
import com.company.problem1.driverapp.DriverApplication;
import com.company.problem1.driverapp.DriverFactory;

public class ManagementSystemBuilder {
    public static ManagementSystem getManagementSystem(String displayType, String comModuleType, int numberOfDisplay) {
        if (displayType == null || comModuleType == null) {
            return null;
        }
        DisplayUnit displayUnit = DisplayUnitFactory.getDisplayUnit(displayType);
        ComModule comModule = ComModuleFactory.getComModule(comModuleType);
        DriverApplication driverApplication = DriverFactory.getDriverApp();
        if (displayUnit == null || comModule == null) {
            return null;
        }
        return new ManagementSystem(DisplayUnitFactory.getDisplayUnit(displayType)
                , ComModuleFactory.getComModule(comModuleType)
                , driverApplication
                , numberOfDisplay);
    }
}
