/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2.factory;

import com.company.problem2.parser.CppParser;
import com.company.problem2.parser.Parser;

public class CppFactory implements ParserFactory {
    @Override
    public Parser getParser() {
        return new CppParser();
    }
}
