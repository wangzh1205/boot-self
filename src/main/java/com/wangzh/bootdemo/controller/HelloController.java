package com.wangzh.bootdemo.controller;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author wangzhuohui
 * @description 测试类
 * @create 2018-07-19 16:24
 */
@RestController
@EnableApolloConfig
public class HelloController
{
    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    private static Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    
    @Value("${we}")
    private String SYSTEM_TEST;
    
    @RequestMapping("/hello")
    public String hello ()
    {
        String hello = "Hello Spring Boot!";
        logger.debug("helloController.hello() hello={}", hello);
        return hello;
    }
    
    @RequestMapping("/hello/{total}")
    public String hello (@PathVariable int total)
    {
        Random random = new Random(1000);
        String hello = "Hello Spring Boot Total!";
        if(total <= 0)
        {
            total = 10;
        }
        for(int i =0; i <= total; i++)
        {
            hashMap.put(random.nextInt(100), random.nextInt(1000));
            //System.out.println(hashMap);
        }
        
        return hello;
    }
    
    @RequestMapping("/test")
    public String test ()
    {
        String hello = "Hello Spring Boot!" + SYSTEM_TEST;
        logger.debug("helloController.hello() hello={}", hello + SYSTEM_TEST);
        return hello;
    }
}
