/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2.factory;

public class FactoryConfig {
    public static ParserFactory getParserFactory(String language) {
        switch (language.toLowerCase()) {
            case "python":
                return new PyFactory();
            case "c":
                return new CFactory();
            case "cpp":
                return new CppFactory();
            default:
                throw new IllegalArgumentException("Invalid language");
        }
    }
}
