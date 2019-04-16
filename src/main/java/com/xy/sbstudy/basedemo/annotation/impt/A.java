package com.xy.sbstudy.basedemo.annotation.impt;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-14
 */
@Getter
@Setter
@ToString
public class A {
    private String name;
    private Integer age;
    private Integer version;

    public void a(){
        System.out.println("我是a");
    }
}
