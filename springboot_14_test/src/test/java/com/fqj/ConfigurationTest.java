package com.fqj;

import com.fqj.config.Msgconfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
//@Import({Msgconfig.class})
public class ConfigurationTest {

    @Autowired
    private String msg;

    @Test
    void testCOnfiguration(){
        System.out.println(msg);
    }
}
