package com.company.io;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author
 * @version 苏东坡1
 * @ClassName FileReader2Test
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月20日 08:30:30
 */
public class FileReader2Test {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/zairensuyi/Desktop/学习路线/a.txt");
        //字符流存储
        FileReader fr =  new FileReader(f);
        //以快递车为例子
        char[] ch = new char[5];
        //一次性读取5个;返回数组的有效长度
        int len = fr.read(ch);
        while(len!=-1){
//            System.out.println(len);
            //错误的遍历方式
//            for (int i = 0; i < ch.length; i++) {
//                System.out.print(ch[i]+"\t");
//            }
//            for (int i = 0; i < len; i++) {
//                System.out.printf(ch[i]+"\t");
//            }

            //第二种遍历方式 将数组转为String类型
            String s = new String(ch,0,len);
            System.out.print(s+"\t");
            len = fr.read(ch);
        }
        fr.close();
    }
}
