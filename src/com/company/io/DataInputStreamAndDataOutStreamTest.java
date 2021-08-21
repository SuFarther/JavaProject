package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName DataInputStreamAndDataOutStreamTest
 * @company 公司
 * @Description
 * 数据流: 用来操作基本数据类型和字符串的
 * DataInputStream: 将文件中存储的基本数据类型和字符串写入内存中的变量
 * DataOutputStream: 将内存中的基本数据类型和字符串变量写出文件中
 * @createTime 2021年08月21日 21:39:39
 */
public class DataInputStreamAndDataOutStreamTest {
    public static void main(String[] args) throws IOException {
//        DataOutputStream  dos = new DataOutputStream(new FileOutputStream(new File("txt后缀文件路径1")));
//        dos.writeUTF("你好呀！");
//        dos.writeBoolean(false);
//        dos.writeInt(18);
//        dos.writeDouble(18.6);
//        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream(new File("txt后缀文件路径1")));
        //将文件中的内容读取到程序中来
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        dis.close();
    }
}
