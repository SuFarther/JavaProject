package com.company.network;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author 网络编程
 * @version 1.0
 * @ClassName InetAddressAndInetSocketAddress
 * @company 公司
 * @Description
 * InetAddress ----- > 封装了IP
 * InetSocketAddress  ----- > 封装了IP和端口号
 * @createTime 2021年08月24日 09:24:24
 */
public class InetAddressAndInetSocketAddress {
    public static void main(String[] args) throws UnknownHostException {
        /**
         * 不能直接创建对象,因为InetAddress()被default修饰了
         */
//        InetAddress ia = new InetAddrress();

        /**
         * 封装ip: 输入本机的ip地址
         * 封装计算机: 输入本机的计算机名字
         * 封装域名
         * ip5.getHostName() 获取域名
         * ip5.getHostAddress() 获取ip地址
         */
        InetAddress ia = InetAddress.getByName("输入本机的ip地址");
        System.out.println(ia);

        InetAddress ia2 = InetAddress.getByName("localhost");
        System.out.println(ia2);

        InetAddress ia3 = InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);

        InetAddress ia4 = InetAddress.getByName("本机的计算机名字");
        System.out.println(ia4);

        InetAddress ip5 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip5);
        System.out.println(ip5.getHostName());
        System.out.println(ip5.getHostAddress());

        System.out.println("-------------");


        InetSocketAddress  isa = new InetSocketAddress("输入本机的ip地址",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress  ia6 = isa.getAddress();
        System.out.println(ia6.getHostName());
        System.out.println(ia6.getHostAddress());

    }
}
