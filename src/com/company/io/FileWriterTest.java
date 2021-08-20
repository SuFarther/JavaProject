package com.company.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileWriterTest
 * @company 公司
 * @Description TODO
 * Filewriter写入操作
 * 一个一个字符向外输出
 * 如果目标文件不存在,则会自动创建
 * 如果目标文件存在的话，文件会覆盖操作，而不是追加
 *
 * 利用缓冲数组
 * @createTime 2021年08月20日 23:25:25
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File f = new File("文件的路径地址!");
        FileWriter fw = new FileWriter(f);
//        String str = "hello你好!";
//        for (int i = 0; i < str.length(); i++) {
//            fw.write(str.charAt(i));
//        }
         String str = "Hello!";
        char[] chars = str.toCharArray();
        fw.write(chars);
        fw.close();
    }
}
