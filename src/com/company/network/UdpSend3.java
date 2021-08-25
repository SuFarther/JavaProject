package com.company.network;

import java.io.IOException;
import java.net.*;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName UdpSend3
 * @company 公司
 * @Description UDP通信_双向通信，并且加入完整的异常信息
 * TCP:
 *   客户端： Socket                       程序感受到的 使用流: 输出流
 *   服务器端: ServerSocket...Socket       程序感受到的 使用流: 输入流
 *   (客户端和服务器端地位不平等)
 *
 *  UDP:
 *   发送方: DatagramSocket   发送: 数据包  DatagramPacket 发送数据包 ds.send(dp);
 *   接收方: DatagramSocket   接收: 数据包  DatagramPacket 接收数据包 ds.receive(dp);
 *   (发送方和接收方地位平等)
 *
 *   完成语言聊天
 * @createTime 2021年08月25日 14:17:17
 */
public class UdpSend3 {
    public static void main(String[] args) {
        System.out.println("学生上线了");
        //1.准备套接字,指定发送方端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            /**
             * 2.准备数据包
             * 数据包需要四个参数   (byte buf[], int offset, int length,InetAddress address, int port
             * 1、指的是发送数据转为字节数组
             * 2、字节数组长度
             * 3、封装接收方的ip
             * 4、指定接收方的端口号
             */
            String s = "你好!";
            byte[] bytes = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);

            //3.发送数据
            ds.send(dp);


            //2.准备空数据包,打算用来接收对方传过来的数据包
            byte[] bytes2 = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(bytes2,bytes2.length);
            //接收完以后dp里面填充的内容
            ds.receive(dp2);
            //接收对方数据包,然后放入我们的dp数据包中填充
            byte[] data = dp2.getData();
            String s2 = new String(data,0,dp2.getLength());
            System.out.println("老师对我说:"+s2);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭数据
            ds.close();
        }
    }
}

class UdpReceive3{
    public static void main(String[] args) {
        System.out.println("老师上线了");
        //1.准备套接字,指定接收方端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            //2.准备空数据包,打算用来接收对方传过来的数据包
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            //接收完以后dp里面填充的内容
            ds.receive(dp);
            //接收对方数据包,然后放入我们的dp数据包中填充
            byte[] data = dp.getData();
            String s = new String(data,0,dp.getLength());
            System.out.println("学生对我说:"+s);

            String s2 = "同学,你好!";
            byte[] bytes2 = s2.getBytes();
            DatagramPacket dp2 = new DatagramPacket(bytes2,bytes2.length, InetAddress.getByName("localhost"),8888);

            //3.发送数据
            ds.send(dp2);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭数据
            ds.close();
        }
    }
}