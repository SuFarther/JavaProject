package com.company.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileInputStreamTest3
 * @company 公司
 * @Description 利用字符缓冲流读取非文本文件
 * @createTime 2021年08月21日 15:02:02
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws IOException {
        //利用字符流存储将文本的内容读取

        //定义一个源文件
        File f = new File("图片类型的完整数据地址");

        //定义一个字符流存储
        FileInputStream pis = new FileInputStream(f);

        byte[] b = new byte[1024];
        int len = pis.read(b);
        while (len!=-1){
            for (int i = 0; i < len; i++) {
                System.out.println(b[i]);
            }
            len = pis.read(b);
        }

        //关闭流
        pis.close();
    }
}
