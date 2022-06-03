package com.company;

import com.company.management.ManagementSystem;
import com.company.management.ManagementSystemBuilder;

/*
* Client class for the management system demo
* */
public class Main {

    public static void main(String[] args) {
	// write your code here
        // take the input
        // create the object
        ManagementSystem system = ManagementSystemBuilder.getManagementSystem("Deluxe","Wifi", 5);
        system.displayInformation();
    }
}
