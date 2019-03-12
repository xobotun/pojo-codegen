package com.xobotun.pojocodegen.internal.parser;

import com.xobotun.pojocodegen.internal.javalang.XClass;

public class JsonParser implements Parser {

    @Override
    public XClass parseFile(final String file) {
        return XClass.builder().className("Mock").build();
    }
}
