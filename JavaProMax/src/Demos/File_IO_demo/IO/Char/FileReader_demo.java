package Demos.File_IO_demo.IO.Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReader_demo {
    /**
     * 字符输入流
     * @param args
     */
    public static void main(String[] args) throws Exception {

        Reader fr = new FileReader("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\text3.txt");
//        int code;
//        while ((code=fr.read())!=-1){
//            System.out.print((char) code);
//        }

        char[] buffer = new char[1024]; //1K字符
        int len;
        while ((len=fr.read(buffer))!=-1){
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }

    }
}
