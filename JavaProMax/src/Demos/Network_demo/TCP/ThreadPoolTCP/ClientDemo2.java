package Demos.Network_demo.TCP.ThreadPoolTCP;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("===客户端===");

        //建立socket端口
        Socket socket = new Socket("127.0.0.1", 7777);

        //从socket通信管道中得到字节输出流,负责发送数据
        OutputStream os = socket.getOutputStream();

        //把低级的字节流包装成打印流
        PrintStream ps = new PrintStream(os);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请说:");
            String msg = scanner.nextLine();
            //发送消息
            ps.println(msg);
            ps.flush();
        }
    }
}

