package Demos.File_IO_demo.IO.Bytes;

import java.io.*;

public class Copy_demo {
    /**
     * 字节输出流复制
     * @param args
     */
    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\text2.txt");
             OutputStream os = new FileOutputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\text3.txt");
             ){

            byte[] buffer = new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
