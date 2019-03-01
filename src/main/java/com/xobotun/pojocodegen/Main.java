package com.xobotun.pojocodegen;

import com.xobotun.pojocodegen.internal.javalang.XClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        XClass.builder();
        log.info("Hello, world!");
    }
}
