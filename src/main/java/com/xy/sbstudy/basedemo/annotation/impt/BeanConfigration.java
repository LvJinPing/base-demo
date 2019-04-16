package com.xy.sbstudy.basedemo.annotation.impt;

import com.xy.sbstudy.ext.AConfigration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-14
 */
// import 可以将 A 及 selector 合 registara 获取的类注入到容器中。动态的注入，并非容器启动就注入相关的类
// 不能单独使用。需要与其他能将bean 加入容器的注解一起使用。  (能把 bean 加入容器的接口呢?)
// import 带有@Configration 的类又是什么意思?
//@Import({CImportSelector.class,ImportCRegistrar.class, AConfigration.class})
@Import({CImportSelector.class,ImportCRegistrar.class})
@Configuration
public class BeanConfigration {

   /* public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfigration.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }*/
}
