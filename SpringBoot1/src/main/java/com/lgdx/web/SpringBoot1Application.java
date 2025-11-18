package com.lgdx.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 1. 두 줄 임포트
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
// 2. 'extends SpringBootServletInitializer' 추가
public class SpringBoot1Application extends SpringBootServletInitializer {

    // 3. 이 'configure' 메서드를 클래스 안에 추가
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBoot1Application.class);
    }

    // (기존 main 메서드는 그대로 둡니다)
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }
}