package Demos.File_IO_demo.IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {

        //打印流
        PrintStream ps = new PrintStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text2.txt");

        ps.println("aaa");
        ps.println('q');
        ps.println(97);
        ps.println("哈哈");

        System.out.println("遥望洞庭山水翠");
        //重定向至文件
        PrintStream ps1 = new PrintStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text3.txt");
        System.setOut(ps1);

        System.out.println("白银盘里一青螺");

        ps.close();

    }
}
