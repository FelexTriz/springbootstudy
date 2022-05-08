package com.fqj;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//jetcache主开关
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.fqj")
public class Springboot19CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot19CacheApplication.class, args);
    }

}
