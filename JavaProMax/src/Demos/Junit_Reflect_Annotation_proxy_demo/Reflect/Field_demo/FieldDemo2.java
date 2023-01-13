package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.Field_demo;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo2 {

    /**
     * 获取某个成员变量
     */
    @Test
    public void getDeclareField() throws Exception {
        //定位Class对象
        Class c = Student.class;
        //定位某个成员变量
        Field ageF = c.getDeclaredField("age");

        //打开权限
        ageF.setAccessible(true);

        //赋值
        Student s = new Student();
        ageF.set(s,18);
        System.out.println(s);

        //取值
        int age = (int) ageF.get(s);
        System.out.println(age);
    }
}
