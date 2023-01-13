package Demos.File_IO_demo.IO.Bytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStream_demo {
    /**
     * 字节输出流
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        OutputStream os = new FileOutputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\text2.txt");

        os.write('a');
        os.write(98);
        os.write('c');

        byte[] buffer = {'1','2','3'};
        os.write(buffer);
        os.write("\r\n".getBytes());

        byte[] buffer2 = "我是wcl".getBytes();
        os.write(buffer2);
        os.write("\r\n".getBytes());

        os.write(buffer,1,2);
        os.write("\r\n".getBytes());

        os.close();

    }
}
