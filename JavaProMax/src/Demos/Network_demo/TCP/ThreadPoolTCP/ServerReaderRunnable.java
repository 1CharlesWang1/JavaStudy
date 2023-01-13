package Demos.Network_demo.TCP.ThreadPoolTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 线程池Runnable
 */
public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            //从socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            //把字节输入流包装成缓冲字符输入流进行消息接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //按照行读取消息
            String msg ;
            while ((msg= br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了:"+msg);
            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了!");
        }
    }
}
