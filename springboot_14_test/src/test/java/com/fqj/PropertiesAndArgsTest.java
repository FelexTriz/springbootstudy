package com.fqj;

import com.fqj.domain.Bookcase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
//临时添加属性配置
@SpringBootTest(args = {"--test.prop=testValue2"},properties = {"test.prop=testValue1"})
public class PropertiesAndArgsTest {
    @Autowired
    private Bookcase bookcase;
    @Value("${test.prop}")
    private String msg;

    @Test
    void testProperties(){
        System.out.println(msg);
        System.out.println(bookcase);
    }


}
