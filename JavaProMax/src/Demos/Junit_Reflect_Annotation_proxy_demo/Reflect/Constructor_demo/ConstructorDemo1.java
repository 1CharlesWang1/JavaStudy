package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.Constructor_demo;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 获取类中构造器
 */
public class ConstructorDemo1 {

//    1.getConstructors 获取public构造器
    @Test
    public void getConstructors(){
        //获取类对象
        Class c =Student.class;
        //提取类中所有构造器
        Constructor[] constructors = c.getConstructors();
        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"==>"+constructor.getParameterCount());
        }
    }

    //2.getDeclaredConstructors 获取所有构造器
    @Test
    public void getDeclaredConstructors(){
        //获取类对象
        Class c =Student.class;
        //提取类中所有构造器
        Constructor[] constructors = c.getDeclaredConstructors();
        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"==>"+constructor.getParameterCount());
        }
    }

    //3.getConstructor 获取某个public构造器
    @Test
    public void getConstructor() throws NoSuchMethodException {
        //获取类对象
        Class c =Student.class;
        //定位单个构造器对象
        Constructor constructor = c.getConstructor();
        System.out.println(constructor.getName()+"==>"+constructor.getParameterCount());
    }

    //4.getDeclaredConstructor 获取某个构造器
    @Test
    public void getDeclareConstructor() throws NoSuchMethodException {
        //获取类对象
        Class c =Student.class;
        //定位无参构造器对象
        Constructor constructor1 = c.getDeclaredConstructor();
        System.out.println(constructor1.getName()+"==>"+constructor1.getParameterCount());
        //定位有参构造器对象
        Constructor constructor2 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor2.getName()+"==>"+constructor2.getParameterCount());
    }

}
