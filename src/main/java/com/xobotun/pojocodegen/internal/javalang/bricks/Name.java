package com.xobotun.pojocodegen.internal.javalang.bricks;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * This interface describes an entity with a user-defined name.
 * Currently there are only XClass and XField are available.
 */
@Data
@AllArgsConstructor
public class Name {
    private String name;
    private String nameSuffix = "";
    private String namePrefix = "";

    public Name(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return namePrefix + name + nameSuffix;
    }
}
