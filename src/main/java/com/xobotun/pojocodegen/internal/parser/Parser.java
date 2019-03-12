package com.xobotun.pojocodegen.internal.parser;

import com.xobotun.pojocodegen.internal.javalang.XClass;

/**
 *  Classes implementing this interface are supposed to
 *  parse an input stream/string and return a XClass
 *  to further serialization.
 *
 *  All parser classes are designed that all processed
 *  classes are being put into a Map<ClassName, XCLass>
 *  for ease of coding, i.e. stateful.
 */
public interface Parser {
    XClass parseFile(String file); // TODO: think about what this method should actually receive. An InputStream<Character>, probably?
}
