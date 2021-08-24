package com.company.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SocketClient3
 * @company 公司
 * @Description 实现对象流传输,实现客户端发送账号密码到服务器端登陆验证
 * @createTime 2021年08月25日 05:56:56
 */
public class SocketClient3 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("自己计算机的ip地址",8888);

        //键盘录入两个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你的账号: ");
        String username = sc.next();
        System.out.println("请录入你的密码: ");
        String pwd = sc.next();
        
        
        //将账号和密码封装成一个对象
        User user = new User(username,pwd);

        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(user);

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        boolean b = dis.readBoolean();
        if (b){
            System.out.println("恭喜你,登陆成功！");
        }else{
            System.out.println("恭喜你,登陆失败！");
        }

        dis.close();
        is.close();
        oos.close();
        os.close();
        s.close();
    }
}

class  SocketServer3{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        //  客户端发来的数据
        User user = (User)ois.readObject();
        boolean flag = false;
        if ("安安".equals(user.getUsername())&&"123".equals(user.getPwd())){
            flag = true;
        }

         //向客户端输出数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBoolean(flag);

        dos.close();
        os.close();
        ois.close();
        is.close();
        s.close();
    }
}


class User implements Serializable{

    private static final long serialVersionUID = -1339401143751070095L;

    private  String username;

    private  String pwd;

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}