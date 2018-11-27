package com.hiya.se.reflection;

import java.io.Serializable;

public class Person implements IReflection,Serializable
{
    private static final long serialVersionUID = -149001668418534612L;
    String name;
    private int age;

    public Person()
    {
        System.out.println("无参构造器");
    }

    public Person(String name, int age)
    {
        System.out.println("有参构造器");
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setName(String name , int age){  
        System.out.println("name: " + name);  
        System.out.println("age:"+ age);  
  
    }  

    public int getAge()
    {
        return age;
    }

    @AgeValidator(max = 2, min = 18)
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person[" + "name='" + name + '\'' + ", age=" + age + ']';
    }
    
    public void  toSay(String val)
    {
        System.out.println("toSay:"+val);
    }

    @Override
    public void demo()
    {
        System.out.println("demo:");
    }
}
