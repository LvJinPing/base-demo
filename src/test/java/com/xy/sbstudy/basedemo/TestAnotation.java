package com.xy.sbstudy.basedemo;

import com.xy.sbstudy.basedemo.annotation.impt.A;
import com.xy.sbstudy.basedemo.annotation.impt.B;
import com.xy.sbstudy.basedemo.annotation.impt.C;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAnotation {
    @Autowired
    private A a;
    @Autowired
    private B b;
    @Autowired
    private C c;
    @Test
    public void test_import(){
        a.a();
        b.a();
        c.a();
    }

}
