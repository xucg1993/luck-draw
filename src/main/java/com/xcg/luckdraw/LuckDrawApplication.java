package com.xcg.luckdraw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan({"com.example.dao"})
public class LuckDrawApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckDrawApplication.class, args);
    }
}
