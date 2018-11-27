package com.hiya.se.reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
public class ContextForOther implements IContext
{
    public void doReflections(Class<Person> c3) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
    InstantiationException, InvocationTargetException, IOException
    {
        //类的简称
        System.out.println(c3.getSimpleName());  
        
        //类名
        System.out.println( c3.getName());

        //所在包
        System.out.println(c3.getPackage());
        
        //修饰符
        System.out.println(c3.getModifiers());
        
        //接口
        System.out.println(c3.getInterfaces());
        
        //注解的接口
        System.out.println(c3.getAnnotatedInterfaces());
    }
}
