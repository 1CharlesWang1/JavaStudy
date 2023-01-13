package Demos.File_IO_demo.File;


import java.io.File;

public class Ergodic {
    public static void main(String[] args) {

        //数组
        File file = new File("E:\\wcl");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }

        //对象
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }

    }
}
