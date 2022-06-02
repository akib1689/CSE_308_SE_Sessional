/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.management;

/*
* factory class for creating the management systems
* */

public class ManagementSystemFactory {
    public static ManagementSystem getManagementSystem(String type) {
        switch (type.toLowerCase()) {
            case "micro":
                return new MicroManagementSystem();
            case "nano":
                return new NanoManagementSystem();
            case "pro":
                return new ProManagementSystem();
            case "personal":
                return new PersonalManagementSystem();
            default:
                return null;
        }
    }
}
