package com.xobotun.pojocodegen.internal.javalang;

import com.xobotun.pojocodegen.internal.javalang.bricks.AccessLevel;
import com.xobotun.pojocodegen.internal.javalang.bricks.Name;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class XField {
    private Name name;
    @Builder.Default private AccessLevel accessLevel = AccessLevel.PRIVATE;

    private List<XAnnnotation> annnotations;
}
