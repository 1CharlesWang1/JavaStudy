package Demos.File_IO_demo.IO.Bytes;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Charset {
    /**
     * 编码解码
     * @param args
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws UnsupportedEncodingException {

        String name = "我是wcl";

        //编码
        byte[] bytes = name.getBytes();//默认utf-8
        byte[] bytes2 = name.getBytes("GBK");//默认utf-8

        System.out.println(bytes.length);
        System.out.println(bytes2.length);
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes2));

        //解码
        String rs = new String(bytes);
        String rs2 = new String(bytes2,"GBK");
        System.out.println(rs);
        System.out.println(rs2);


    }
}
