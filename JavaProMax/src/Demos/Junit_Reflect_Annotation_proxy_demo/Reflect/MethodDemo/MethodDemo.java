package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.MethodDemo;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 反射获取类方法
 */
public class MethodDemo {

    @Test
    public void getDeclaredMethod() throws Exception{
        //获取类对象
        Class c = Dog.class;
        //提取单个方法
        Method m1 = c.getDeclaredMethod("eat");
        Method m2 = c.getDeclaredMethod("eat",String.class);

        //打开权限
        m2.setAccessible(true);

        //方法执行
        Dog dog = new Dog();
        //方法没有无返回值,返回null
        Object result1 = m1.invoke(dog);
        System.out.println(result1);

        Object result2 = m2.invoke(dog,"小吉");
        System.out.println(result2);

    }

}










