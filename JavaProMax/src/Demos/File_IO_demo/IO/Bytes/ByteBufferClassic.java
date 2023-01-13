package Demos.File_IO_demo.IO.Bytes;

import java.io.*;

public class ByteBufferClassic {
    /**
     * 包装成 高级缓冲字节流 复制文件
     * @param args
     */
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        try (InputStream is = new FileInputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text2.txt");
             InputStream bis = new BufferedInputStream(is);
             OutputStream os = new FileOutputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text3.txt");
             OutputStream bos = new BufferedOutputStream(os);
        ) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间"+(endTime-startTime)/1000.0+"s");

    }
}
