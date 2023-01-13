package Demos.File_IO_demo.IO.StreamTransfer;

import java.io.*;

public class InputStreamReaderTransfer {
    /**
     * GBK转码输入流
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //字节输出流
        InputStream is = new FileInputStream("JavaProMax\\src\\Demos\\File_IO_demo\\IO\\files\\GBK.txt");
        Reader isr = new InputStreamReader(is,"GBK");
        //原始字节流转换为字符输出流
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

    }
}
