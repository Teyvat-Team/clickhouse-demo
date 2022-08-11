package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = {"com.congge.mapper"})
@SpringBootApplication
public class ClickHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClickHouseApplication.class, args);
    }

}

