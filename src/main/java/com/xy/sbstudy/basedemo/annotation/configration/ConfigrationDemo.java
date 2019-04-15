package com.xy.sbstudy.basedemo.annotation.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-01
 */
@Configuration
//@ImportResource
public class ConfigrationDemo {
    // 初始化方法
    @Bean(name = "piDto",initMethod = "a")
    public PIDto getPIDto(){
        PIDto piDto = new PIDto();
        return piDto;
    }
    @Bean(name = "piiDto")
    public PIIDto getPIIDto(){
        // 构造器注入  setter 注入 getPIDto() 必须是@Configration 管理起来的方法
        // todo 当创建bean 时需要依赖其他 Bean 。 spring 会先尝试创建被依赖 bean 。 故最好不要循环依赖  不知道是不是这么理解
        return new PIIDto(getPIDto());
    }
}
