package com.hiya.se.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ContextForMethod implements IContext
{
    public  void doReflections(Class<Person> clazz) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InstantiationException, InvocationTargetException
    {
        //1、得到clazz 对应的类中有哪些方法,不能获取private方法
        Method[] methods = clazz.getMethods();
        System.out.print("        getMethods: ");  
        for (Method method : methods)
        {
            System.out.print(method.getName() + ", ");
        }

        // 2、获取所有的方法(且只获取当着类声明的方法，包括private方法）
        Method[] methods2 = clazz.getDeclaredMethods();
        System.out.print("\ngetDeclaredMethods: ");
        for (Method method : methods2)
        {
            System.out.print(method.getName() + ", ");
        }

        // 3、获取指定的方法
        Method method = clazz.getDeclaredMethod("setName", String.class);// 第一个参数是方法名，后面的是方法里的参数
        System.out.println("\nmethod : " + method);

        Method method2 = clazz.getDeclaredMethod("setName", String.class, int.class);// 第一个参数是方法名，后面的是方法里的参数
        System.out.println("method2: " + method2);

        // 4、执行方法！
        Object obj = clazz.newInstance();
        method.invoke(obj, "changwen");
        method2.invoke(obj, "changwen", 22);
    }
}
