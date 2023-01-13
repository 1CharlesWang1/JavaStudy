package Demos.File_IO_demo.IO.ObjectStreamDemo;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {

        //学生对象
        Student s = new Student("wcl","男","123");
        //对象字节输出流包装字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\Object.txt"));
        //调用
        oos.writeObject(s);

        oos.close();
        System.out.println("完成");

    }
}
