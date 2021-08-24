package com.company.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SocketClient1
 * @company 公司
 * @Description 实现服务端和客户端的会话
 *
 * 注意: 先开启服务器 在开启客户端
 * @createTime 2021年08月25日 05:05:05
 */
public class SocketClient1 {
    public static void main(String[] args) throws IOException {
        //指定Socket,Socket指应用层和传输层的中间套的接口,传输层有TCP和UCP
        Socket s = new Socket("自己计算机的ip地址",8888);
        //向外发送数据，利用输出流
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好!");
        dos.close();
        os.close();
        s.close();
    }
}

class  SocketServer1 {

    public static void main(String[] args) throws IOException{

        //创建套接字,指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);
        //等待客户端发来的信息
        //阻塞方法： 等待接收客户端的数据,什么时候接收到数据,什么时候程序继续向下执行
        //accept()返回值为一个socket,这个Socket其实就是客户端的Socket
        //接收到这个Socket以后,客户端和服务器才真正产生了连接,才真正可以通信了
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //读取客户端发来的数据:
        String str = dis.readUTF();
        System.out.println("客户端发来的数据为:"+str);
        dis.close();
        is.close();
        s.close();
    }
}