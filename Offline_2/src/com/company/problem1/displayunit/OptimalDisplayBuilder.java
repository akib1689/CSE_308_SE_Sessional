/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem1.displayunit;

class OptimalDisplayBuilder implements DisplayUnitBuilder {
    private DisplayUnit displayUnit;

    @Override
    public void build() {
        displayUnit = new OptimalDisplay();
    }

    @Override
    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }
}
