package com.example.controller;

import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    //创建记录日志的对象
    private static final Logger log =LoggerFactory.getLogger(BookController.class);



    @GetMapping
    public String  gerById(){

        System.out.println("springbooot is running...,id is" );

        log.info("info...");
        log.warn("warn...");
        log.error("error....");
        log.debug("debug....");

        return "springboot is running";
    }
}
