package Demos.File_IO_demo.IO.Bytes;

import java.io.*;

public class InputStream_demo {
    /**
     * 字节输入流
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text1.txt");

        int b1 = is.read();
        System.out.println((char)b1);
        int b2 = is.read();
        System.out.println((char)b2);
        int b3 = is.read();
        System.out.println((char)b3);
        int b4 = is.read();
        System.out.println((char)b4);

        byte[] buffer = new byte[3];
        int len = is.read(buffer);
        System.out.println("字节"+len);
        String rs = new String(buffer);
        System.out.println(rs);

        is.read(buffer);
        String rs2 = new String(buffer);
        System.out.println(rs2);

        byte[] buffer2 = new byte[3];
        int len2;
        while ((len2=is.read(buffer2))!=1){
            System.out.print(new String(buffer2,0,len2));
        }

        byte[] buffer3 =is.readAllBytes();
        System.out.println(new String(buffer3));

    }
}
