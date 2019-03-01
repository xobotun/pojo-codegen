package com.xobotun.pojocodegen.internal.javalang;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDummyXClassGen {
    private final static String EXPECTED_DUMMY_CLASS =
            "public class RandomTest {\n"
            + "\n"
            + "}";

    @Test
    public void testRandomClass() {
        XClass xClass = XClass.builder().className("Random").classNameSuffix("Test").build();
        assertEquals(EXPECTED_DUMMY_CLASS, xClass.toString());
    }
}
