package Demos.File_IO_demo.IO.Char;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderClassic {
    /**
     * 缓冲字符输入流
     * @param args
     */
    public static void main(String[] args) {

        try (
                Reader fr = new FileReader("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text2.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
