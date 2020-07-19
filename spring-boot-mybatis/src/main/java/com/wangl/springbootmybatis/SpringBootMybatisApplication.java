package com.wangl.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wangl")
public class SpringBootMybatisApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

}
