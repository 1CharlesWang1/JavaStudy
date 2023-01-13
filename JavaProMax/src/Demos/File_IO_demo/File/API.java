package Demos.File_IO_demo.File;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class API {
    public static void main(String[] args) throws IOException {

        File file = new File("E:\\wcl\\Java projects\\JavaProject\\JavaProMax\\src\\Demos\\File_demo\\text.txt");
        long size = file.length();
        System.out.println(size);

        //相对路径对应到工程的模块下
        File file2 = new File("JavaProMax\\src\\Demos\\File_demo\\text.txt");
        long size2 = file.length();
        System.out.println(size2);

        //绝对路径
        System.out.println(file2.getAbsoluteFile());
        //使用路径
        System.out.println(file2.getPath());
        //文件名
        System.out.println(file2.getName());
        //上次修改时间
        long time = file2.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        //创建新文件
        File file3=new File("E:\\wcl\\Java projects\\JavaProject\\JavaProMax\\src\\Demos\\File_demo\\text2.txt");
        System.out.println(file3.createNewFile());

        //创建新文件夹
        File file4=new File("E:\\wcl\\Java projects\\JavaProject\\JavaProMax\\src\\Demos\\File_demo\\aaa");
        System.out.println(file4.mkdir());

        File file5=new File("E:\\wcl\\Java projects\\JavaProject\\JavaProMax\\src\\Demos\\File_demo\\bbb\\ccc");
        System.out.println(file5.mkdirs());

        //删除文件夹
        file4.delete();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}
