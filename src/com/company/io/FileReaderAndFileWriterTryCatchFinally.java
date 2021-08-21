package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileReaderAndFileWriterTryCatchFinally
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月21日 14:27:27
 */
public class FileReaderAndFileWriterTryCatchFinally {
    public static void main(String[] args) throws IOException {
        File f1 =  new File("文件夹名的地址1");

        //创建目标文件
        File f2 =  new File("文件夹名的地址2");

        //创建字符输入流
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f1);
            //创建字符输出流
           fw = new FileWriter(f2);


            char[] ch = new  char[5];
            int len = fr.read(ch);
            while (len!=-1){
                String  s = new String(ch,0,len);
                fw.write(s);
                len = fr.read(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //关闭流,自下至上
           if(fw!=null){
               fw.close();
           }
           if(fr!=null){
               fr.close();
           }
        }
    }
}
