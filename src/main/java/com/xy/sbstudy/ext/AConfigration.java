package com.xy.sbstudy.ext;

import com.xy.sbstudy.basedemo.annotation.impt.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-15
 */
@Configuration
public class AConfigration {
    @Bean(name = "a")
    public A getA(){
        return new A();
    }
}
