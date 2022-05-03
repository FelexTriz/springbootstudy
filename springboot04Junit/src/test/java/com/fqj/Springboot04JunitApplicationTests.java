package com.fqj;

import com.fqj.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        bookDao.save();
    }

}
