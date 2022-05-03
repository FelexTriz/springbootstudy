package com.fqj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {


    @GetMapping(value = "/books/{id}")
    public String  gerById(@PathVariable Integer id){
        System.out.println("springbooot is running...,id is" + id);
        return "springboot is running";
    }
}
