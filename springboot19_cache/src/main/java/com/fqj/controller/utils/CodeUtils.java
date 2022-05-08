package com.fqj.controller.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CodeUtils {
    private String[] patch = {"00000","0000","000","00","0",""};
    public String generator(String tele){
        int h = tele.hashCode();
        int encryption = 2019302886;
        long result = h^encryption;
        long nowTime = System.currentTimeMillis();
        result=result^nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code:code;
        String codeStr = code+ "";
        int len = codeStr.length();

        return patch[len - 1] + String.valueOf(code);
    }

    @Cacheable(value = "smsCode",key = "#tele")
    public String get(String tele){
        return null;
    }

//    public static void main(String[] args) {
//        CodeUtils codeUtils = new CodeUtils();
//        System.out.println(codeUtils.generator("18092838828"));
//    }
}
