package Demos.File_IO_demo.IO.Char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterClassic {
    /**
     * 缓冲字符输出流
     * @param args
     */
    public static void main(String[] args) throws IOException {

        Writer fw = new FileWriter("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(98);
        bw.write('a');
        bw.write('王');
        bw.write("\n");

        bw.write("我是wcl");
        bw.write("我是wcl",1,3);
        bw.write("\n");

        char[] chars = "我是cyb".toCharArray();
        bw.write(chars);
        bw.write(chars,2,2);
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
