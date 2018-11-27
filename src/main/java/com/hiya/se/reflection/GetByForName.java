package com.hiya.se.reflection;

public class GetByForName implements IClass<Person>
{
    @SuppressWarnings("unchecked")
    @Override
    public Class<Person> getClassInstance() 
    {
        Class<Person> clazz = null;
        try
        {
            clazz = (Class<Person>) Class.forName("com.hiya.se.reflection.Person");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }  
        System.out.println("通过全类名获取: " + clazz);  
        return clazz;
    }
}
