package com.company;

import com.company.management.ManagementSystem;
import com.company.management.ManagementSystemFactory;

/*
* Client class for the management system demo
* */
public class Main {

    public static void main(String[] args) {
	// write your code here
        // take the input
        // create the object
        ManagementSystem managementSystem = ManagementSystemFactory.getManagementSystem("Micro");
        // call the method
        if (managementSystem != null) {
            managementSystem.displayInformation();
        }
        System.out.println("-----------------------------------------------------------------");
        managementSystem = ManagementSystemFactory.getManagementSystem("Nano");
        if (managementSystem != null) {
            managementSystem.displayInformation();
        }
        System.out.println("-----------------------------------------------------------------");
        managementSystem = ManagementSystemFactory.getManagementSystem("Pro");
        if (managementSystem != null) {
            managementSystem.displayInformation();
        }
        System.out.println("-----------------------------------------------------------------");
        managementSystem = ManagementSystemFactory.getManagementSystem("Personal");
        if (managementSystem != null) {
            managementSystem.displayInformation();
        }
    }
}
