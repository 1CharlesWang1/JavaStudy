package Demos.Junit_Reflect_Annotation_proxy_demo.Annotation.MetaAnnotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 注解解析
 */
public class AnnotionDemo {

    @Test
    public void parseClass() throws Exception{
        //得到类对象
        Class c =BookStore.class;
        //判断类上是否有注解
        if(c.isAnnotationPresent(Book.class)){
            //获取该注解对象
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    @Test
    public void parseMethod() throws Exception{
        //得到类对象
        Class c =BookStore.class;

        Method m = c.getDeclaredMethod("test");
        //判断类上是否有注解
        if(m.isAnnotationPresent(Book.class)){
            //获取该注解对象
            Book book = (Book) m.getDeclaredAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }
}


@Book(name = "《战狼2》",price = 199,author = {"吴京","易烊千玺"})
class BookStore{

    @Book(name = "《三体》",price = 99,author = {"刘慈欣","王源"})
    public void test(){

    }
}
