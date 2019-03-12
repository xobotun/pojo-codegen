package com.xobotun.pojocodegen.internal.parser;

import com.xobotun.pojocodegen.internal.javalang.XClass;
import com.xobotun.pojocodegen.internal.javalang.bricks.Name;

public class JsonParser implements Parser {

    @Override
    public XClass parseFile(final String file) {
        return XClass.builder().name(new Name("Mock")).build();
    }
}
