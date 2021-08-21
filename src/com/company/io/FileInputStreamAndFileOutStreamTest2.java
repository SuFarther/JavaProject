package com.company.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileInputStreamAndFileOutStreamTest1
 * @company 公司
 * @Description 字节流读取数据和字节流输出数据2
 * @createTime 2021年08月21日 15:14:14
 */
public class FileInputStreamAndFileOutStreamTest2 {
    public static void main(String[] args) throws IOException {
        //定义源文件
        File  f1 =  new File("源文件的图片完整地址1");

        //目标文件
        File f2 = new File("目标文件的图片完整地址2");


        //字节输入流
        FileInputStream fis = new FileInputStream(f1);

        //字节输出流
        FileOutputStream fos = new FileOutputStream(f2);


        byte[] b = new byte[1024];
        int len = fis.read(b);
        while (len!=-1){
            fos.write(b,0,len);
            len = fis.read(b);
        }


        //关闭流
        fos.close();
        fis.close();
    }
}
