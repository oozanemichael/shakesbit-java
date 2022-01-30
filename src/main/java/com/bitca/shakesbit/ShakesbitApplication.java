package com.bitca.shakesbit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({
        "com.baomidou.mybatisplus.samples.quickstart.mapper",
        "com.bitca.shakesbit.mapper"})
public class ShakesbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShakesbitApplication.class, args);
    }

}
