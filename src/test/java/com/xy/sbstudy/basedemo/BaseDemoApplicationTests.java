package com.xy.sbstudy.basedemo;

import com.xy.sbstudy.basedemo.annotation.configration.PIIDto;
import com.xy.sbstudy.basedemo.annotation.value.PersionAttribute;
import com.xy.sbstudy.basedemo.jpa.sql.CpUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseDemoApplicationTests {
    @Autowired
    private PersionAttribute persionAttribute;
    @Autowired
    private PIIDto piiDto;
    @Autowired
    private JpaRepository cpUserRepository;
    @Autowired
    @Test
    public void testJpaSelectPrim(){
        CpUser one = (CpUser) cpUserRepository.getOne(Integer.valueOf(16));
        System.out.println(one.toString());
    }
    @Test
    public void contextLoads() {
        System.out.println(persionAttribute.getOther2());
    }
    @Test
    public void testConfigration(){
        System.out.println(piiDto.toString());
    }

}
