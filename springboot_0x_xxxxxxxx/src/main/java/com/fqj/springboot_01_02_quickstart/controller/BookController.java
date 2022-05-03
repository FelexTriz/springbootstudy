package com.fqj.springboot_01_02_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {


    @GetMapping
    public String  gerById(){
        System.out.println("springbooot is running...2");
        return "springboot is running";
    }
}
