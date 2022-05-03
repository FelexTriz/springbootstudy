package com.fqj.springboot_08_ssmp;

import com.fqj.springboot_08_ssmp.Mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08SsmpApplicationTests {

    @Autowired
    BookMapper bookMapper;
    @Test
    void contextLoads() {
        bookMapper.getById(1);
    }

}
