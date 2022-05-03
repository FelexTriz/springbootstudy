package com.fqj.controller;

import com.fqj.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public Book getById(){
        System.out.println("get2Byid is running");
        Book book = new Book();
        book.setName("da");
        book.setDescription("das");
        book.setId(1);
        book.setType("dasa");
        return book;
    }

}
