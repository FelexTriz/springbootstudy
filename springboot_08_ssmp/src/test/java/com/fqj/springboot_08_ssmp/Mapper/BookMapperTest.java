package com.fqj.springboot_08_ssmp.Mapper;

import com.fqj.springboot_08_ssmp.Mapper.BookMapper;
import com.fqj.springboot_08_ssmp.SSMPApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SSMPApplication.class)
public class BookMapperTest{


    @Autowired
    BookMapper book;

    @Test
    void TestById(){
        book.getById(1);
        System.out.println(1);
    }
}
