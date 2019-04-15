package com.xy.sbstudy.basedemo.annotation.impt;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-14
 */
public class ImportCRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // new一个RootBeanDefinition
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(C.class);
        // 注册一个名字叫rectangle的bean
        registry.registerBeanDefinition("c", rootBeanDefinition);
    }
}
