package com.wangzh.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootdemoApplication extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(BootdemoApplication.class);
    }
    
    public static void main(String[] args)
    {
        // 自带的tomcat
        SpringApplication.run(BootdemoApplication.class, args);
        // 自定义tomcat
       // new SpringApplicationBuilder(BootdemoApplication.class).web(true).run(args);
    }
}
