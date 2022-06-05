/*
 * Copyright (c) 2022, Akibur Rahman
 * All rights reserved
 */

package com.company.problem2.factory;

import com.company.problem2.parser.CParser;
import com.company.problem2.parser.Parser;

public class CFactory implements ParserFactory {


    @Override
    public Parser getParser() {
        return new CParser();
    }
}
