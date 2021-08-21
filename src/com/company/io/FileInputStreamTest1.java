package com.company.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileInputStreamTest1
 * @company 公司
 * @Description 字符流读取文本文件
 * 警惕不要用字符流寸文本文件 一个中文占3个字节
 * @createTime 2021年08月21日 14:51:51
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //利用字符流存储将文本的内容读取

        //定义一个源文件
        File f = new File("txt文本内容全部详细地址");

        //定义一个字符流存储
        FileInputStream pis = new FileInputStream(f);

        //读取一个文件
        int n = pis.read();
        // 一个一个循环读取
        while (n!=-1){
            System.out.println(n);
            n = pis.read();
        }

        //关闭流
        pis.close();
    }
}
