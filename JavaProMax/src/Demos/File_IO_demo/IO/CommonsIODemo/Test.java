package Demos.File_IO_demo.IO.CommonsIODemo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {

        //1.文件复制
        IOUtils.copy(new FileInputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\GBK.txt"),
                new FileOutputStream("E:\\GBK1.txt"));

        //2.文件复制到文件夹下
        FileUtils.copyFileToDirectory(new File("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\GBK.txt")
                , new File("E:\\"));

        //3.文件夹复制到文件夹下
        FileUtils.copyDirectoryToDirectory(new File("E:\\迅雷云盘")
                ,new File("E:\\fuzhi云盘"));
        //删除文件夹
        FileUtils.deleteDirectory(new File("E:\\fuzhi云盘"));
        FileUtils.deleteDirectory(new File("E:\\wcl\\PythonCrawler\\Scripts"));
        //删除文件
        FileUtils.deleteQuietly(new File("E:\\GBK.txt"));

    }
}
