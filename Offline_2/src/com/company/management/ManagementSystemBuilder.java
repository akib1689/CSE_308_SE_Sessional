/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.management;

/*
* builder class for creating the management systems
* */

import com.company.commodule.ComModule;
import com.company.commodule.ComModuleFactory;
import com.company.displayunit.DisplayUnit;
import com.company.displayunit.DisplayUnitFactory;
import com.company.driverapp.DriverApplication;
import com.company.driverapp.DriverFactory;

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
                , DriverFactory.getDriverApp()
                , numberOfDisplay);
    }
}
