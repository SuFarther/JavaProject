package com.company.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SocketClient4
 * @company 公司
 * @Description 实现对象流传输,实现客户端发送账号密码到服务器端登陆验证,加入完整的异常处理方式
 * @createTime 2021年08月25日 05:56:56
 */
public class SocketClient4 {
    public static void main(String[] args)  {
        Socket s = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        DataInputStream dis = null;


        try {
            s = new Socket("自己计算机的ip地址",8888);
            //键盘录入两个数
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入你的账号: ");
            String username = sc.next();
            System.out.println("请录入你的密码: ");
            String pwd = sc.next();


            //将账号和密码封装成一个对象
            User2 user = new User2(username,pwd);

            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

           is = s.getInputStream();
            dis = new DataInputStream(is);
            boolean b = dis.readBoolean();
            if (b){
                System.out.println("恭喜你,登陆成功！");
            }else{
                System.out.println("恭喜你,登陆失败！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               if(is!=null){
                   is.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(oos!=null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               if(os!=null){
                   os.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class  SocketServer4{
    public static void main(String[] args){
        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;
        ObjectInputStream ois = null;
        OutputStream os  = null;
        DataOutputStream dos = null;

        try {
            ss = new ServerSocket(8888);
           s = ss.accept();
           is = s.getInputStream();
            ois = new ObjectInputStream(is);
            //  客户端发来的数据
            User2 user = (User2)ois.readObject();
            boolean flag = false;
            if ("安安".equals(user.getUsername())&&"123".equals(user.getPwd())){
                flag = true;
            }

            //向客户端输出数据
           os = s.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeBoolean(flag);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               if(os!=null){
                   os.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ois!=null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               if(s!=null){
                   s.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               if(ss!=null){
                   ss.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


class User2 implements Serializable{


    private static final long serialVersionUID = 3952683637567386379L;

    private  String username;

    private  String pwd;

    public User2(String username, String pwd) {
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