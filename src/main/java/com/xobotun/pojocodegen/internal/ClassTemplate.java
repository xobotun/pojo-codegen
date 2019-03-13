package com.xobotun.pojocodegen.internal;

import com.xobotun.pojocodegen.internal.javalang.XAnnnotation;
import com.xobotun.pojocodegen.internal.javalang.XField;
import com.xobotun.pojocodegen.internal.javalang.bricks.Name;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@Builder
public class ClassTemplate {
    private Name name;
    @Builder.Default private List<XAnnnotation> classAnnotations = Collections.emptyList();
    @Builder.Default private List<XAnnnotation> allFieldsAnnotations = Collections.emptyList();
    @Builder.Default private List<XField> fieldModifiers = Collections.emptyList();
}
