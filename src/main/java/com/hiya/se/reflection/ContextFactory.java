package com.hiya.se.reflection;

public class ContextFactory
{
    public static IContext getContext(String type)
    {
        switch (type)
        {
            case "Class":
                return IContext.create(ContextForClass::new);
            case "Method":
                return IContext.create(ContextForMethod::new);
            case "Field":
                return IContext.create(ContextForField::new);
            case "Annotation":
                return IContext.create(ContextForAnnotation::new);
            case "Other":
                return IContext.create(ContextForOther::new);
            default:
                return IContext.create(ContextForClass::new);
        }
    }
}
