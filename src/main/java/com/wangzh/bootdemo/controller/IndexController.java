package com.wangzh.bootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
}
