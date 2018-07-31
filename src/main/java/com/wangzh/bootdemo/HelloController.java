package com.wangzh.bootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhuohui
 * @description 测试类
 * @create 2018-07-19 16:24
 */
@RestController
public class HelloController
{
    //private Logger logger = LoggerFactory.getLogger(HelloController.class);
    
    @RequestMapping("/hello")
    public String hello ()
    {
        String hello = "Hello Spring Boot!";
       // logger.debug("helloController.hello() hello={}", hello);
        return hello;
    }
}
