package com.company.problem1.processor;

public class ProcessorFactory {
    public static Processor getProcessor(String processorType) {
        switch (processorType) {
            case "Arduino Mega":
                return new ArduinoMega();
            case "Raspberry Pi":
                return new RaspberryPi();
            case "ATMega32":
                return new ATMega32();
            default:
                return null;
        }
    }
}
