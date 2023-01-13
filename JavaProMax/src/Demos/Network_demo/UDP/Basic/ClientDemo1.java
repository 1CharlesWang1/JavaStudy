package Demos.Network_demo.UDP.Basic;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ClientDemo1 {
    /**
     * 发送端
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println("===客户端启动===");

        //创建发送端对象,自带默认端口号
        DatagramSocket socket = new DatagramSocket(5555);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请说:");
            String msg = scanner.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("离线");
                socket.close();
                break;
            }

            //创建一个数据包对象封装数据
            byte[] buffer = msg.getBytes();

            /**
             * public DatagramPacket(byte buf[], int length,
             *                           InetAddress address, int port)
             * 参数一:封装要发送的数据
             * 参数二:发送数据的大小
             * 参数三:服务端的主机ip
             * 参数四:服务器端口
             */
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                    InetAddress.getLocalHost(), 8888);

            //发送数据
            socket.send(packet);
        }
    }
}
