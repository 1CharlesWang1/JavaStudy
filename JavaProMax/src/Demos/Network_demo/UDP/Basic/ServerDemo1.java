package Demos.Network_demo.UDP.Basic;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo1 {
    /**
     * 接收端
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println("===服务端启动===");

        //创建接受端对象,注册端口号
        DatagramSocket socket = new DatagramSocket(8888);

        //创建一个数据包对象接收数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            //等待接受数据
            socket.receive(packet);
            //取出数据
            int len = packet.getLength();
            String rs = new String(buffer, 0, len);
            System.out.println("收到来自:" + packet.getAddress() + ",对方端口是"
                    + packet.getPort() + "的消息:" + rs);
        }

    }
}
