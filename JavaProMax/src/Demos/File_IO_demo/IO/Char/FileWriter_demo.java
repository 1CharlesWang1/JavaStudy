package Demos.File_IO_demo.IO.Char;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWriter_demo {
    /**
     * 字符输出流
     * @param args
     */
    public static void main(String[] args) throws Exception {

        Writer fw = new FileWriter("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\text3.txt");

        fw.write(98);
        fw.write('a');
        fw.write('王');
        fw.write("\n");

        fw.write("我是wcl");
        fw.write("我是wcl",1,3);
        fw.write("\n");

        char[] chars = "我是cyb".toCharArray();
        fw.write(chars);
        fw.write(chars,2,2);
        fw.write("\n");

        fw.flush();
        fw.close();


    }
}
