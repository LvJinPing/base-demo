package com.xy.sbstudy.ext.autoconfig;

import com.xy.sbstudy.basedemo.annotation.impt.A;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-16
 */
@Configuration
// 自动注入属性配置类
@EnableConfigurationProperties(MyConfigPropertity.class)
public class MyConfigAutoConfig {
    // 在什么情况下创建什么bean
    @ConditionalOnProperty(value = "myautoconfig.xy.name",havingValue = "xiaoyao")
    @Bean(name = "a1")
    public A getA(MyConfigPropertity myConfigPropertity){
        A a = new A();
        a.setAge(myConfigPropertity.getAge());
        a.setName(myConfigPropertity.getName());
        a.setVersion(myConfigPropertity.getVersion());
        a.toString();
        return a;
    }
}
