package com.hiya.se.reflection;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ContextForAnnotation implements IContext
{
    @Override
    public void doReflections(Class<Person> clazz)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException,
            InvocationTargetException, IOException, NoSuchFieldException, SecurityException
    {
        Object obj = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("setAge", Integer.class);
        int val = 40;

        // 获取注解
        Annotation annotation = method.getAnnotation(AgeValidator.class);
        if (annotation != null)
        {
            if (annotation instanceof AgeValidator)
            {
                AgeValidator ageValidator = (AgeValidator) annotation;
                if (val < ageValidator.min() || val > ageValidator.max())
                {
                    throw new RuntimeException("数值超出范围");
                }
            }
        }
        method.invoke(obj, val);
        System.out.println(obj);
    }
}
