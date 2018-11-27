package com.hiya.se.reflection;

public class GetByClassName implements IClass<Person>
{
    @Override
    public Class<Person> getClassInstance()
    {
        Class<Person> clazz = Person.class;  
        System.out.println("通过类名: " + clazz);  
        return clazz;
    }
}
