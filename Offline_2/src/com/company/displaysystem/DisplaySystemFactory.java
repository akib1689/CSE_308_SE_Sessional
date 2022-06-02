package com.company.displaysystem;

public class DisplaySystemFactory {
    public static DisplaySystem createDisplaySystem(String type) {
        if (type.equals("LCD")) {
            return new LCD();
        } else if (type.equals("LED")) {
            return new LED();
        } else {
            return null;
        }
    }
}
