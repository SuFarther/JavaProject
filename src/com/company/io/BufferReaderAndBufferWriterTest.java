package com.company.io;


import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BufferReaderAndBufferWriterTest
 * @company 公司
 * @Description BufferedRWriter
 * @createTime 2021年08月21日 20:16:16
 */
public class BufferReaderAndBufferWriterTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("文件夹名的地址1");

        File f2 = new File("文件夹名的地址2");

        FileReader fr = new FileReader(f1);

        FileWriter fw = new FileWriter(f2);


        BufferedReader br = new BufferedReader(fr);

        BufferedWriter bw = new BufferedWriter(fw);

        char[] ch = new char[5];
        int len = br.read(ch);
        while (len!=-1){
            bw.write(ch,0,len);
            len = br.read(ch);
        }

        bw.close();
        br.close();
        fw.close();
        fr.close();
    }
}
