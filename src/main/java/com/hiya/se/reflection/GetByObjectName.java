package com.hiya.se.reflection;

public class GetByObjectName implements IClass<Person>
{
    @Override
    public Class<Person> getClassInstance()
    {
        Person obj = new Person();  
        @SuppressWarnings("unchecked")
        Class<Person> clazz = (Class<Person>) obj.getClass();  
        System.out.println("通过getClass(): " + clazz);  
        return clazz;
    }
}
