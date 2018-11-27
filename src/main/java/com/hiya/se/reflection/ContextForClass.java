package com.hiya.se.reflection;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class ContextForClass implements IContext
{
    public void doReflections(Class<Person> c3) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
    InstantiationException, InvocationTargetException, IOException
    {
        Person obj = (Person) c3.newInstance();  
        System.out.println(obj);  
        
        ClassLoader  classLoader = c3.getClassLoader();  
        System.out.println("当前类由哪个类加载器进行加载-->"+classLoader);  
        
        InputStream in = classLoader.getResourceAsStream("com/hiya/se/reflection/hiya.properties");  
        System.out.println("in: " +in);  
  
        Properties properties = new Properties();  
        properties.load(in);  
        String driverClass = properties.getProperty("dirver");  
        String user = new String(properties.getProperty("user").getBytes("ISO-8859-1"), "UTF-8");  
        System.out.println("diverClass: "+driverClass);  
        System.out.println("user: " + user);  

    }
}
