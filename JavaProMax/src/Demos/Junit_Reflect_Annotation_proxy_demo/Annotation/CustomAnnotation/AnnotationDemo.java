package Demos.Junit_Reflect_Annotation_proxy_demo.Annotation.CustomAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo {

    @Mytest
    public void test1(){
        System.out.println("===test1===");
    }

//    @Mytest
    public void test2(){
        System.out.println("===test2===");
    }

    @Mytest
    public void test3(){
        System.out.println("===test3===");
    }

    /**
     * 启动菜单
     * @param args
     */
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        AnnotationDemo at = new AnnotationDemo();

        Class c = AnnotationDemo.class;
        //提取全部方法
        Method[] methods = c.getDeclaredMethods();
        //遍历是否有MyTest注解
        for (Method method : methods) {
            if(method.isAnnotationPresent(Mytest.class)){
                method.invoke(at);
            }
        }

    }

}
