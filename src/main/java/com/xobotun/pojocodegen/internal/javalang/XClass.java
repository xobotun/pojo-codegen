package com.xobotun.pojocodegen.internal.javalang;

import com.xobotun.pojocodegen.internal.ClassTemplate;
import com.xobotun.pojocodegen.internal.javalang.bricks.AccessLevel;
import com.xobotun.pojocodegen.internal.javalang.bricks.Name;
import lombok.Builder;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class XClass {
    private Name name;
    @Builder.Default private AccessLevel accessLevel = AccessLevel.PUBLIC;
    @Builder.Default private List<String> interfaces = Collections.emptyList();
    @Builder.Default private List<String> superclasses = Collections.emptyList(); // Multiple?!
    @Builder.Default private List<XAnnnotation> annnotations = Collections.emptyList();
    @Builder.Default private List<XField> fields = Collections.emptyList();
    @Builder.Default private List<ClassTemplate> templatesToImplement = Collections.emptyList();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (!annnotations.isEmpty()) result.append(annnotations.stream().map(Object::toString).collect(Collectors.joining("\n")));
        result.append(accessLevel).append(" class ").append(name);
        if (!superclasses.isEmpty()) result.append(" extends ").append(String.join(", ", superclasses));
        if (!interfaces.isEmpty()) result.append(" implements ").append(String.join(", ", interfaces));
        result.append(" {\n");
        if (!fields.isEmpty()) result.append(fields.stream().map(Object::toString).collect(Collectors.joining("\n")));
        result.append("\n}");

        return result.toString();
    }
}
