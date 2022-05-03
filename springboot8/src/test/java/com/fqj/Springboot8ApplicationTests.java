package com.fqj;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fqj.Mapper.BookMapper;
import com.fqj.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot8ApplicationTests {
    @Autowired
    BookMapper bookMapper;
    @Test
    void contextLoads() {
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据1");
        book.setName("测试数据1");
        book.setDescription("测试数据1");
        bookMapper.insert(book);
    }@Test
    void testUpdate(){

    }@Test
    void testDelete(){
        bookMapper.deleteById(2);

    }@Test
    void testGetAll(){
        System.out.println(bookMapper.selectList(null));

    }@Test
    void testGetPage(){
        IPage iPage = new Page(1, 1);
        bookMapper.selectPage(iPage, null   );
        System.out.println(iPage.getPages());
    }
    @Test
    void testGetBy(){
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(Book::getName,"ZJX");
        bookMapper.selectList(qw);
    }
}
