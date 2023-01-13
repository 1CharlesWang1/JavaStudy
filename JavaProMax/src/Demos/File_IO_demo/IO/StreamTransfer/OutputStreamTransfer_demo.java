package Demos.File_IO_demo.IO.StreamTransfer;

import java.io.*;

public class OutputStreamTransfer_demo {
    /**
     * GBK转码输出流
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        //字节输出流
        OutputStream os = new FileOutputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\GBK.txt");
        //原始字节流转换为字符输出流
        Writer osw = new OutputStreamWriter(os,"GBK");
        //低级字符输出流包装为改机缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("我是王晨乐wcl");
        bw.write("我是王晨乐wcl");
        bw.close();
    }
}
