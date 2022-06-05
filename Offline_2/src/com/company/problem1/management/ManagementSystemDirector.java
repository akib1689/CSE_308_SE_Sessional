/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem1.management;

public class ManagementSystemDirector {
    public static void construct(SystemBuilder systemBuilder, String displayType, String comModuleType, int numberOfDisplay) {
        systemBuilder.buildDisplay(displayType, numberOfDisplay);
        systemBuilder.buildComModule(comModuleType);
        systemBuilder.buildDriverApp();
    }
}
