package Demos.Junit_Reflect_Annotation_proxy_demo.Reflect.FrameworkDemo;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    public static void save(Object obj) {

        try (
                PrintStream ps = new PrintStream(
                        new FileOutputStream(
                                "JavaProMax\\src\\Demos\\JunitReflect_demo\\Reflect\\FrameworkDemo\\file.txt", true))
        ) {
            //提取对象的成员变量,反射解决
            Class c = obj.getClass();
            //保存的类名
            ps.println("===" + c.getSimpleName() + "===");

            //提取全部成员变量
            Field[] fields = c.getDeclaredFields();

            //获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                //提取本成员变量在obj对象中的取值
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }
            ps.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
