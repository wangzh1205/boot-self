package com.wangzh.bootdemo;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
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
        //SpringApplication.run(BootdemoApplication.class, args);
        // 自定义tomcat
        //new SpringApplicationBuilder(BootdemoApplication.class).web(true).run(args);
        new SpringApplicationBuilder().sources(Parent.class).child(BootdemoApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
