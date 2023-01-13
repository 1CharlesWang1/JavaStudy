package Demos.Junit_Reflect_Annotation_proxy_demo.Annotation.MetaAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    String name();
    double price() default 100;
    String[] author();
}














