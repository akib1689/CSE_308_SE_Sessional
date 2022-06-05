/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem1.management;

public interface SystemBuilder {
    void buildDisplay(String displayType, int numberOfDisplay);
    void buildComModule(String comModuleType);
    void buildDriverApp();
    ManagementSystem getManagementSystem();
}
