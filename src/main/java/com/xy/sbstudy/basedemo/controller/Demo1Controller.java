package com.xy.sbstudy.basedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-03-28
 */
@RestController
public class Demo1Controller {
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
}
