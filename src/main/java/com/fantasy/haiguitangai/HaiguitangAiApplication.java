package com.fantasy.haiguitangai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fantasy.haiguitangai.mapper")
public class HaiguitangAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaiguitangAiApplication.class, args);
    }

}
