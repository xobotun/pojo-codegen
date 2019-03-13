package com.xobotun.pojocodegen.internal;

import com.xobotun.pojocodegen.internal.javalang.XClass;
import com.xobotun.pojocodegen.internal.parser.Parser;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class should handle all the inheritances and dependencies.
 */
@RequiredArgsConstructor
public class Processor {
    private final Parser parser;

    private List<XClass> classes = new ArrayList<>();

    public void process(List<String> files) {
        parse(files);
        resolveLinks();
    }

    /**
     * This method should read text things and populate collections with classes.
     */
    private void parse(List<String> files) {
        for (String file : files) {
            XClass newClass = parser.parseFile(file);
            registerNewClass(newClass);
        }
    }

    /**
     * This method should traverse over all found classes and link one to another if needed.
     */
    private void resolveLinks() {

    }

    /**
     * More implementation-specific method used to add new class to the context.
     * Possibly with validation on name uniqueness.
     */
    private void registerNewClass(XClass newClass) {
        classes.add(newClass);
    }
}
