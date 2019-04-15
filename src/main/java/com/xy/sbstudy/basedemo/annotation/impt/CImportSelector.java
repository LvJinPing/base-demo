package com.xy.sbstudy.basedemo.annotation.impt;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-14
 */
public class CImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return  new String[]{"com.xy.sbstudy.basedemo.annotation.impt.B"};
    }
}
