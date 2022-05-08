package com.fqj.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//springmvc的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截异常信息
    @ExceptionHandler
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试！");
    }
}
