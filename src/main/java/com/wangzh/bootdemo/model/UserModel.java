package com.wangzh.bootdemo.model;

/**
 * @author wangzhuohui
 * @version V1.0
 * @description 测试用户类
 * @since 2018-12-21 14:24
 */
public class UserModel
{
    public String name;
   
    public int age;
   
    public String adddress;
    
    public UserModel(String name, int age, String adddress)
    {
        this.name = name;
        this.age = age;
        this.adddress = adddress;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getAdddress()
    {
        return adddress;
    }
    
    public void setAdddress(String adddress)
    {
        this.adddress = adddress;
    }
    
    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("UserModel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", adddress='").append(adddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
