package com.hiya.se.reflection;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ContextForConstructor implements IContext
{
    @Override
    public void doReflections(Class<Person> clazz) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException, IOException, NoSuchFieldException, SecurityException
    {
        //1.获取Constructor对象  
        @SuppressWarnings("unchecked")
        Constructor<Person>[] constructors =    (Constructor<Person>[])clazz.getConstructors();  
        for (Constructor<Person> constructor: constructors) 
        {  
            System.out.println(constructor);  
        }  
      
        Constructor<Person> constructor = clazz.getConstructor(String.class, Integer.class);  
        System.out.println("指定的-->" + constructor);  
      
        //2.调用构造器的newInstance()方法创建对象  
        Object obj= constructor.newInstance("changwen", 11);  
        System.out.println("obj-->" + obj); 
    }
}
