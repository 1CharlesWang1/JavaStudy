package Demos.File_IO_demo.IO.ObjectStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {

        //对象字节输入流包装字节输出流管道
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\Object.txt"));
        //调用
        Student s = (Student) is.readObject();

        System.out.println(s);

    }
}
