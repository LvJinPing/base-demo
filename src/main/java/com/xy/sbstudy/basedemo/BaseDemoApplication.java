package com.xy.sbstudy.basedemo;

import com.xy.sbstudy.ext.autoconfig.MyConfigAutoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})  // 默认扫描主路径下的配置
//@Import(value = {MyConfigAutoConfig.class})
public class BaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseDemoApplication.class, args);
    }

}
