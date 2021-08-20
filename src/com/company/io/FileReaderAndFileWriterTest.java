package com.company.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileReaderAndFileWriterTest
 * @company 公司
 * @Description 将元文件输入输出
 * @createTime 2021年08月20日 23:51:51
 */
public class FileReaderAndFileWriterTest {
    public static void main(String[] args) throws IOException {
        ///创建源文件
        File f1 =  new File("文件夹名的地址1");

        //创建目标文件
        File f2 =  new File("文件夹名的地址2");

        //创建字符输入流
        FileReader fr = new FileReader(f1);

        //创建字符输出流
        FileWriter fw = new FileWriter(f2);

        //一个一个字符的读
//        int n = fr.read();
//        while (n!=-1){
//            fw.write(n);
//            n = fr.read();
//        }


        //创建字符缓冲流
//        char[] ch = new char[5];
//        int len = fr.read(ch);
//        while (len != -1){
//            fw.write(ch,0,len);
//            len = fr.read(ch);
//        }

        char[] ch = new  char[5];
        int len = fr.read(ch);
        while (len!=-1){
            String  s = new String(ch,0,len);
            fw.write(s);
            len = fr.read(ch);
        }


        //关闭流,自下至上
        fw.close();
        fr.close();

    }
}
