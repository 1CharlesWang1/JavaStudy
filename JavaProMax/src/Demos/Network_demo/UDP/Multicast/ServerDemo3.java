package Demos.Network_demo.UDP.Multicast;

import java.net.*;

public class ServerDemo3 {
    /**
     * 接收端
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println("===服务端启动===");

        //创建接受端对象,注册端口号
        MulticastSocket socket = new MulticastSocket(9999);

        socket.joinGroup(InetAddress.getByName("224.0.1.1"));

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
