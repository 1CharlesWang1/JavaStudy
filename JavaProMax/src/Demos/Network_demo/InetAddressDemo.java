package Demos.Network_demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws Exception {

        //获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //获取公网ip对象
        InetAddress ip3 = InetAddress.getByName("14.215.177.38");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        //判断是否5秒内ping通
        System.out.println(ip3.isReachable(5000));

    }
}
