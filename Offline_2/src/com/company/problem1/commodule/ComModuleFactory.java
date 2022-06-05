/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */


package com.company.problem1.commodule;
/*
* factory class to get the communication module
* */
public class ComModuleFactory {
    public static ComModule getComModule(String comModuleType) {
        if (comModuleType == null) {
            return null;
        }
        if (comModuleType.equalsIgnoreCase("Wifi")) {
            return new WifiModule();
        } else if (comModuleType.equalsIgnoreCase("Cellular")) {
            return new CellularModule();
        }
        return null;
    }
}
