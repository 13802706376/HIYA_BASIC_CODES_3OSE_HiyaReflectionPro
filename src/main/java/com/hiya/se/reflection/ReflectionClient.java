package com.hiya.se.reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
public class ReflectionClient
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IOException, 
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException, SecurityException
    {
         //获取class 
         Class<Person> c1 = new GetByClassName().getClassInstance();
         Class<Person> c2 = new GetByObjectName().getClassInstance();
         Class<Person> c3 = new GetByForName().getClassInstance();

         //处理class
         ContextFactory.getContext("Class").doReflections(c1);
         
         //处理方法
         ContextFactory.getContext("Method").doReflections(c2);
         
         //处理字段
         ContextFactory.getContext("Field").doReflections(c3);
         
         //注解
         ContextFactory.getContext("Annotation").doReflections(c3);
         
         //处理其他的（接口，包名，名称等）
         ContextFactory.getContext("Other").doReflections(c3);
         
    }
}
