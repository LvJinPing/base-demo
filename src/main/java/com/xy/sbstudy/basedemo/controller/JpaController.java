package com.xy.sbstudy.basedemo.controller;

import com.xy.sbstudy.basedemo.jpa.sql.CpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-11
 */
@RestController
public class JpaController {
//    @Autowired
    private JpaRepository cpUserRepository;
    @RequestMapping("/getcpuser" )
    public CpUser getCpUser(){
        return (CpUser) cpUserRepository.getOne(Integer.valueOf(16));
    }
}
