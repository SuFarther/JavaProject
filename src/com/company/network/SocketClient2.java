package com.company.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SocketClient2
 * @company 公司
 * @Description TCP通信,实现双向通信
 * @createTime 2021年08月25日 05:34:34
 */
public class SocketClient2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("自己计算机的ip地址",8888);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好呀");

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器对我说:"+str);

        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}


class SocketServer2{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("客户端发来的数据:"+str);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("我是服务器端，我已经接收到你的数据,马上响应");

        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}