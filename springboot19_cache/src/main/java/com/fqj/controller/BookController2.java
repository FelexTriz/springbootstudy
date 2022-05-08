package com.fqj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fqj.controller.utils.R;
import com.fqj.domain.Book;
import com.fqj.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private BookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.getAll());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        if (book.getName().equals("123"))throw new IOException();
        //如果成功返回:)
        boolean flag = bookService.save(book);
        System.out.println(1);
        return new R(flag, flag?"添加成功^_^":"添加失败TAT");
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.update(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, bookService.getById(id));
    }


//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        if ((currentPage > page.getPages()))
//            page = bookService.getPage((int)page.getPages(), pageSize);
//        return new R(true, page);
//    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book){
//
//
//        IPage<Book> page = bookService.getPage(currentPage, pageSize, book);
//        if ((currentPage > page.getPages()))
//            page = bookService.getPage((int)page.getPages(), pageSize, book);
//        return new R(true, page);
//    }

}
