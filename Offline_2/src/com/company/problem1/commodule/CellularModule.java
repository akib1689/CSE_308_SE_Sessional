package com.company.problem1.commodule;
/*
* concrete communication module class
* */
class CellularModule extends ComModule {
    public CellularModule() {
        super("Cellular Module", 300, 170);
    }

    @Override
    public void displayInfo() {
        System.out.println("Cellular Module");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Yearly Cost: " + yearly_cost);
    }
}
