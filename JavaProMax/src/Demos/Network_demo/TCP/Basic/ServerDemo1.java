package Demos.Network_demo.TCP.Basic;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {

        System.out.println("===服务端===");

        //注册端口
        ServerSocket serverSocket = new ServerSocket(7777);
        while (true) {
            //调用accept方法,等待接收客户端的Socket连接请求,建立Socket通信管道
            Socket socket = serverSocket.accept();
            //从socket管道中得到一个字节输出流
            InputStream is = socket.getInputStream();
            //把字节输入流包装成缓冲字符输入流进行消息接受
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //按照行读取信息
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + "说了:" + msg);
            }
        }
    }
}


