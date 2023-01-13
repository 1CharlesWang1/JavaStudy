package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.Constructor_demo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 暴力反射打开private权限
 */
public class ConstructorDemo2 {

    //4.getConstructor 获取某个构造器
    @Test
    public void getDeclareConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取类对象
        Class c =Student.class;
        //定位无参构造器对象
        Constructor constructor1 = c.getDeclaredConstructor();
        System.out.println(constructor1.getName()+"==>"+constructor1.getParameterCount());

        Student s1 = (Student) constructor1.newInstance();
        System.out.println(s1);

        //定位有参构造器
        //定位有参构造器对象
        Constructor constructor2 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor2.getName()+"==>"+constructor2.getParameterCount());

        //暴力反射打开权限
        constructor2.setAccessible(true);

        Student s2 = (Student) constructor2.newInstance("wcl",100);
        System.out.println(s2);

    }

}
