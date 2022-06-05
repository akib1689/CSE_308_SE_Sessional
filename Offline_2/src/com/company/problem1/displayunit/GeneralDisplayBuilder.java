/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem1.displayunit;

class GeneralDisplayBuilder implements DisplayUnitBuilder {
    private DisplayUnit displayUnit;

    @Override
    public void build() {
        displayUnit =  new GeneralDisplay();
    }

    @Override
    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }
}
