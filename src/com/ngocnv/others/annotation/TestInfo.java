package com.ngocnv.others.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface TestInfo {

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public Priority priority() default Priority.MEDIUM;

    String[] tags() default "";

    String createdBy() default "ngocnv";

    String lastModified() default "13/09/2018";
}
