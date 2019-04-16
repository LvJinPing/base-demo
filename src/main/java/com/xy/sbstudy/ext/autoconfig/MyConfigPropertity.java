package com.xy.sbstudy.ext.autoconfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-16
 */
@Getter
@Setter
@ToString
@ConfigurationProperties("myautoconfig.xy")
public class MyConfigPropertity {
    private String name;
    private Integer age;
    private Integer version;
}
