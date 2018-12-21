package com.wangzh.bootdemo.controller;

import com.wangzh.bootdemo.utils.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangzhuohui
 * @version V1.0
 * @description 测试页面访问控制
 * @since 2018-12-14 17:41
 */
@Controller
public class IndexController
{
    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    
    @RequestMapping("/*")
    public String hello ()
    {
        String hello = "index";
        return hello;
    }
    
    @RequestMapping("/test/{total}")
    public String test (@PathVariable int total)
    {
        if(total == 5)
        {
            try
            {
                Test.test5(total, total, "wang");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        if(total == 6)
        {
            try
            {
                Test.test6(total + "");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        return "This is Spring Boot test";
    }
}
