package com.fqj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fqj.domain.Book;
import com.fqj.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
////@CrossOrigin
//@RestController
//@RequestMapping("/books")
public class BookController {

//    @Autowired
//    private IBookService bookService;
//
//    @GetMapping
//    public List<Book> getAll(){
//        return bookService.list();
//    }
//
//    @PostMapping
//    public Boolean save(@RequestBody Book book) throws IOException {
//       if (book.getName().equals("123"))throw new IOException();
//        return bookService.save(book);
//    }
//
//    @PutMapping
//    public Boolean update(@RequestBody Book book){
//        return bookService.updateById(book);
//    }
//
//    @DeleteMapping("{id}")
//    public Boolean delete(@PathVariable Integer id){
//        return bookService.removeById(id);
//    }
//
//    @GetMapping("{id}")
//    public Book getById(@PathVariable Integer id){
//        return bookService.getById(id);
//    }
//
//
//    @GetMapping("{currentPage}/{pageSize}")
//    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize){
//        return bookService.getPage(currentPage, pageSize, book);
//    }


}
