package com.hiya.se.reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

@FunctionalInterface
public interface IContext
{
     void doReflections(Class<Person> clazz)  throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
     InstantiationException, InvocationTargetException, IOException, NoSuchFieldException, SecurityException;
     
     public static IContext create(final Supplier<IContext> supplier)
     {
         return supplier.get();
     }
}
