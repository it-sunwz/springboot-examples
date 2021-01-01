package com.its;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.its.mapper")
public class SpringBootAppRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppRun.class);
    }

}
