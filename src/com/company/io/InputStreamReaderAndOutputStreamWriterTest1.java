package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName InputStreamReaderAndOutputStreamWriterTest1
 * @company 公司
 * @Description TODO
 * InputStreamReader ： 字节输入流。。。。。。字符输入流
 * OutputStreamReader: 字节输出流。。。。。字符输出流
 * @createTime 2021年08月21日 20:39:39
 */
public class InputStreamReaderAndOutputStreamWriterTest1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("文件路径的详细地址1");

        File f2 = new File("文件路径的详细地址2");

        FileInputStream fis = new FileInputStream(f1);

        FileOutputStream fos = new FileOutputStream(f2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");


        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        char[] ch = new char[5];
        int len = isr.read(ch);
        while (len!=-1){
            osw.write(new String(ch,0,len));
            len = isr.read(ch);
        }

        osw.close();
        isr.close();
        fos.close();

    }
}
