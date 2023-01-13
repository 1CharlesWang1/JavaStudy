package Demos.Network_demo.TCP.ThreadPoolTCP;

import ch.qos.logback.core.net.server.ServerRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo2 {

    //使用静态变量记住一个线程池
    private static ExecutorService pool = new ThreadPoolExecutor(2,
            3, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws IOException {

        System.out.println("===服务端===");

        //注册端口
        ServerSocket serverSocket = new ServerSocket(7777);
        //定义一个死循环让主线程负责不断接收客户端的Socket管道连接
        while (true) {
            //调用accept方法,等待接收客户端的Socket连接请求,建立Socket通信管道
            Socket socket = serverSocket.accept();
            //从socket管道中得到一个字节输出流
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            //多线程建立单个线程通信
            //Runnable target = new ServerReaderThread(socket);
            //线程池通信
            Runnable target = new ServerReaderRunnable(socket);
            pool.execute(target);
        }
    }
}



