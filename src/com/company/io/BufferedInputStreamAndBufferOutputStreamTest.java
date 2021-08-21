package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BufferedInputStreamAndBufferOutputStreamTest
 * @company 公司
 * @Description 缓冲字节流
 * @createTime 2021年08月21日 15:42:42
 */
public class BufferedInputStreamAndBufferOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //定义源文件
        File f1 =  new File("源文件的图片完整地址1");

        //目标文件
        File f2 = new File("目标文件的图片完整地址2");


        //字节输入流
        FileInputStream fis = new FileInputStream(f1);

        //字节输出流
        FileOutputStream fos = new FileOutputStream(f2);

        //加强输入流
        BufferedInputStream bis = new BufferedInputStream(fis);


        //加强输出流
        BufferedOutputStream bos  = new BufferedOutputStream(fos);


        //定义缓冲数组
        byte[] b = new byte[1024];
        int len = bis.read(b);
        while (len!=-1){
            bos.write(b,0,len);
            len = bis.read(b);
        }


        //关闭流
        if(bos!=null){
            bos.close();
        }
        if(bis!=null){
            bis.close();
        }
        if(fos!=null){
            fos.close();
        }
        if(fis!=null){
            fis.close();
        }


    }
}
