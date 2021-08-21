package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ObjectInputStreamAndObjectOutStreamTest
 * @company 公司
 * @Description 对象输出流和对象输入流
 * @createTime 2021年08月21日 22:04:04
 */
public class ObjectInputStreamAndObjectOutStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("txt后缀文件路径1")));
//        oos.writeObject("你好呀啊啊啊啊啊啊啊啊");
//        oos.close();

         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("txt后缀文件路径1")));
         System.out.println(ois.readObject());
         ois.close();

    }
}
