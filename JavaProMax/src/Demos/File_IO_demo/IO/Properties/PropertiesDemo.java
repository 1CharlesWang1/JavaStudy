package Demos.File_IO_demo.IO.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.setProperty("admin","123456");
        properties.setProperty("wcl","123");
        properties.setProperty("root","456");
        System.out.println(properties);

        /**
         * 参数一:保存管的 字符输出流管道
         * 参数二:备注
         */
        properties.store(new FileWriter("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\users.properties")
                ,"suffering");

        Properties properties2 = new Properties();
        //加载属性文件进来
        properties2.load(new FileReader("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\users.properties"));
        System.out.println(properties2);

        String rs = properties.getProperty("wcl");
        System.out.println(rs);
        String rs2 = properties.getProperty("root");
        System.out.println(rs2);

    }
}
