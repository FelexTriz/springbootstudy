package com.fqj;

import com.fqj.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    BookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.getById(1));
    }

    @Test
    void TestGetAll(){
        System.out.println(bookDao.selectList(null));
    }
}
