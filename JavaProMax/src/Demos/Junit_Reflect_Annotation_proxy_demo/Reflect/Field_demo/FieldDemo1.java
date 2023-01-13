package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.Field_demo;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo1 {
    /**
     * 获取全部成员变量
     */
    @Test
    public void getDeclareFields(){
        //定位Class对象
        Class c = Student.class;
        //定位全部成员变量
        Field[] fields = c.getDeclaredFields();
        //遍历
        for (Field field : fields) {
            System.out.println(field.getName()+"==>"+field.getType());
        }
    }

    /**
     * 获取某个成员变量
     */
    @Test
    public void getDeclareField() throws NoSuchFieldException {
        //定位Class对象
        Class c = Student.class;
        //定位某个成员变量
        Field field1 = c.getDeclaredField("age");
        System.out.println(field1.getName()+"==>"+field1.getType());
    }
}
