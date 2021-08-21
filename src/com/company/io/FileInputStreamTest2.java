package com.company.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileInputStreamTest2
 * @company 公司
 * @Description 利用字节流读取非文本文件
 * @createTime 2021年08月21日 14:58:58
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        //利用字符流存储将文本的内容读取

        //定义一个源文件
        File f = new File("/Users/zairensuyi/Desktop/学习路线/7b907725ad1230ac3823897e8b878c66.jpeg");

        //定义一个字符流存储
        FileInputStream pis = new FileInputStream(f);

        //读取一个文件
        int n = pis.read();
        //定义一个计数器看他读取了多少
        int count = 0;
        // 一个一个循环读取
        while (n!=-1){
            System.out.println(n);
            n = pis.read();
            count++;
        }

        System.out.println(count);

        //关闭流
        pis.close();
    }
}
