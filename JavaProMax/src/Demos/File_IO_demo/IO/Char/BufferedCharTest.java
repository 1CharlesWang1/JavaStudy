package Demos.File_IO_demo.IO.Char;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BufferedCharTest {
    /**
     * 字符输入
     * 排序
     * 输出流
     * @param args
     */
    public static void main(String[] args) {

        try (
                BufferedReader br = new BufferedReader(new FileReader("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\peom.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\text2.txt"));
        ){

            List<String> data = new ArrayList<>();
            String line;
            while ((line = br.readLine())!=null){
                data.add(line);
            }
            System.out.println(data);

            //自定义排序
//            List<String> sizes = new ArrayList<>();
//            Collections.addAll(sizes,"一","二","三","四");
//            Collections.sort(data, new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    return sizes.indexOf(o1.substring(0,o1.indexOf(".")))
//                            -sizes.indexOf(o1.substring(0,o2.indexOf(".")));
//                }
//            });
            Collections.sort(data);
            System.out.println(data);

            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
