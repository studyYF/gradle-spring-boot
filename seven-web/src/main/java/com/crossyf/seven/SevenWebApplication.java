package com.crossyf.seven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.crossyf.seven.mapper")
public class SevenWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SevenWebApplication.class, args);
    }

}
