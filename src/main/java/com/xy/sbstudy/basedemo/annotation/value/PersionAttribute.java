package com.xy.sbstudy.basedemo.annotation.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-03-28
 * ConfigurationProperties 支持数据校验 复杂形式封装 一次性配置文件指定
 * Value 不支持校验，一个一个自定  ，支持 Spel表达式 ，不支持复杂类型
 */
@Component
//@Validated  数据校验感觉有点鸡肋。 用于提供 starter 的场景?
@ConfigurationProperties(prefix = "persion")
public class PersionAttribute {
     @Autowired
     private Environment env;
    private String name;

    private Integer age;

    private List<String> subPersion;
    /**
     * Map 只支持 String 为key 的情况
     */
    private Map<String,Integer> key;
    @Value("${other}")
//    @Value("${other:nihao}") // 默认值形式
    private String other;

    private String other2;

    public String getOther2() {
        return env.getProperty("other2");
    }

    public void setOther2(String other2) {

        this.other2 = other2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getSubPersion() {
        return subPersion;
    }

    public void setSubPersion(List<String> subPersion) {
        this.subPersion = subPersion;
    }

    public Map<String, Integer> getKey() {
        return key;
    }

    public void setKey(Map<String, Integer> key) {
        this.key = key;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersionAttribute{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", subPersion=").append(subPersion);
        sb.append(", key=").append(key);
        sb.append(", other='").append(other).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
