package com.fqj.springboot_01_02_quickstart.controller;

import com.fqj.springboot_01_02_quickstart.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    String coutry;

    @Value("${user.name}")
    String name;

    @Value("${likes[1]}")
    String likes1;

    @Value("${user[1].age}")
    String age;

    @Value("${tempDir}")
    String tempDir;

    @Autowired
    //使用自动装配将所有数据封装
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;
    @GetMapping
    public String  gerById(){
        System.out.println("springbooot is running...");
        System.out.println("country----->" + coutry);
        System.out.println("name----->" + name);
        System.out.println("likejava ------>" + likes1);
        System.out.println("age ------>" + age);
        System.out.println("tempDir" + tempDir);
        System.out.println("print env" + env.getProperty("user.name"));
        System.out.println("print env" + env.getProperty("server.port"));
        System.out.println("----------------------------");
        System.out.println(myDataSource);
        return "springboot is running";
    }
}
