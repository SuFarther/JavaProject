package com.company.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileReaderTest
 * @company 公司
 * @Description 文件字符流的读取
 *
 * 1、先有一个文件,然后往流里面读取数据
 * 2、然后将文件通过流的管道方式存入程序
 * @createTime 2021年08月20日 06:28:28
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File  f = new File("/Users/zairensuyi/Desktop/学习路线/a.txt");
        //字符流存储
        FileReader fr =  new FileReader(f);
        //然后一个一个读取
//        int n1 = fr.read();
//        int n2 = fr.read();
//        int n3 = fr.read();
//        int      = fr.read();
//        int n5 = fr.read();
 //       int n6 = fr.read();
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);
//        System.out.println(n5);
//        System.out.println(n6);

        /**
         * 第一种方式1 循环读取
         */
//        int n = fr.read();
//        while (n!=-1){
//            System.out.println(n);
//            n = fr.read();
//        }
        /**
         * 第二种方式读取
         */
        int  n;
          while ((n= fr.read())!=-1){
              System.out.print((char)n+"\t");
          }
    }
}
