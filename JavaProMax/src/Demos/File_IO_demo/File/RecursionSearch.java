package Demos.File_IO_demo.File;

import java.io.File;
import java.util.Date;

public class RecursionSearch {
    public static void main(String[] args) {

    Date date1 = new Date();

    searchFile(new File("E:/"),"红色证件照.jpg");

    Date date2 = new Date();
    System.out.println("用时"+(date2.getTime()-date1.getTime())/1000.0+"s");



    }

    private static void searchFile(File dir, String filename) {
        if(dir!=null&&dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files!= null&&files.length>0){
                for (File file : files) {
                    if(file.isFile()){
                        if(file.getName().equals(filename)){
                            System.out.println("找到了:"+file.getAbsoluteFile());
//                            try {
//                                Runtime r = Runtime.getRuntime();
//                                r.exec(file.getAbsolutePath());
//                            }catch (IOException e){
//                                e.printStackTrace();
//                            }
                        }
                    }else {
                        searchFile(file,filename);
                    }
                }
            }
        }else {
            System.out.println("空文件夹或不是文件夹");
        }
    }
}
