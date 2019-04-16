package com.xy.sbstudy.ext;

import com.xy.sbstudy.basedemo.annotation.impt.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-15
 * // 测试导入的类。 {@link com.xy.sbstudy.basedemo.annotation.impt.BeanConfigration}
 */
@Configuration
public class AConfigration {
    @Bean(name = "a")
    public A getA(){
        return new A();
    }
}
