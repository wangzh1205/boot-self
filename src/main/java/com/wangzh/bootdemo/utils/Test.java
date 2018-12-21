package com.wangzh.bootdemo.utils;

import com.wangzh.bootdemo.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wangzhuohui
 * @version V1.0
 * @description 测试类
 * @since 2018-12-20 16:28
 */
public class Test
{
    private static Logger logger= LoggerFactory.getLogger(Test.class);
    
    public static String test1()
    {
        logger.debug("This is={}", "Test.test1");
        return "this is Test.test1";
    }
    
    public static String test2(String id)
    {
        logger.debug("This is={}, id={}", "Test.test2", id);
        return "this is Test.test2";
    }
    
    public static String test3(String id) throws Exception
    {
        logger.debug("This is={}, id={}", "Test.test3", id);
        if("2".equals(id))
        {
            throw new Exception();
        }
        
        return "this is Test.test3";
    }
    
    public static int test4(int id) throws Exception
    {
        logger.debug("This is={}, id={}", "Test.test4", id);
        if((id % 2 )== 0)
        {
            throw new Exception("this test4 id = " + id);
        }
        
        return id % 2;
    }
    
    public static int test5(int id, int num, String str) throws Exception
    {
        logger.debug("This is={}, id={}, num={}, str={}", "Test.test5", id, num, str);
        if((id % 3 )== 0)
        {
            throw new Exception("this test5 id = " + id);
        }
        
        if ("wang".equals(str))
        {
            throw new Exception("this test5 str = " + str);
        }
        
        
        return id % 2;
    }
    
    public static UserModel test6(String str) throws Exception
    {
        
        if ("wang".equals(str))
        {
            throw new Exception("this test6 str = " + str);
        }
        
        UserModel userModel = new UserModel(str, 20, "浙江省杭州市西湖区文二西路780号西溪银座B座");
    
        logger.debug("This is={}, str={}, userModel={}", "Test.test6", str, userModel);
        
        return userModel;
    }
}
