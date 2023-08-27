package com.heihei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.heihei.mapper")
public class StartApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(StartApplicaiton.class,args);
    }
}
