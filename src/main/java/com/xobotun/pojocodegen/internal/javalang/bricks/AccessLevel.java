package com.xobotun.pojocodegen.internal.javalang.bricks;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum AccessLevel {
    PUBLIC("public"), PROTECTED("protected"), DEFAULT(""), PRIVATE("private");

    String shownName;
}
