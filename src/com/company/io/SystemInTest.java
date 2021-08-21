package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SystemInTest
 * @company 公司
 * @Description System.in是对io流的读写
 * @createTime 2021年08月21日 21:18:18
 */
public class SystemInTest {
    public static void main(String[] args) throws IOException {
        //字节流
        InputStream is  = System.in;

        //字节流转成字符流
        InputStreamReader isr = new InputStreamReader(is);

        //增强字节流
        BufferedReader br = new BufferedReader(isr);


        //定义一个输出文件
        File f = new File("txt文本路径的地址");


        //字符输出流
        FileWriter fw = new FileWriter(f);


        //增强字符缓冲流
        BufferedWriter bw = new BufferedWriter(fw);


        //开始动作
        String s = br.readLine();
        while (!s.equals("exit")){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }


        bw.close();
        br.close();
    }
}
