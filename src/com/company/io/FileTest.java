package com.company.io;

import java.io.File;
import java.io.IOException;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileTest
 * @company 公司
 * @Description File操作
 * File类概念详解:
 *   盘符上的文件-----》封装为对象-----》对象属于File类的对象-----》有了这个对象,我们程序就可以直接操纵这个对象,通过这个
 *   对象,通过这个对象获取文件各种高信息，还可以对文件进行创建,删除
 * @createTime 2021年08月18日 23:28:28
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        /**
         * 获取盘符文件的文件名的地址  xxxx/xxx/xx/a.txt （放入你想放入的文件的绝对路径包括文件路径）
         * File.separator 属性帮我们获取操作系统的路径拼接符号,Centos/Mac是"/",Window是"//"
         * f.canRead() 文件是否可读
         * f.canWrite() 文件是否可写
         * f.getName() 名字
         * f.getParent() 上级名字
         * f.isDirectory() 是否是一个目录
         * f.isFile()  是否是一个文件
         * f.isHidden() 是否隐藏
         * f.length() 文件的大 小
         * f.exists() 文件是否存在
         * f.delete() 文件删除
         * f.createNewFile(); 文件创建
         * f.equals() 比较两个对象的文件文件地址是否相等
         * f.getAbsolutePath 绝对路径(真实的完整路径)
         * f.getPath() 相对路径(有一个参造物,相对于这个参造物路径)
         * f.toString() 相对路径
         *
         *
         */
        File f = new File("文件名的全部地址名字");
        File f2 = new File("/aaa/bb"+File.separator+"/cc/a.txt");
        System.out.println("文件是否可读："+f.canRead());
        System.out.println("文件是否可写："+f.canWrite());
        System.out.println("文件名: "+f.getName());
        System.out.println("获取文件名的上级父类: "+f.getParent());
        System.out.println("是否是目录: "+f.isDirectory());
        System.out.println("是否是文件: "+f.isFile());
        System.out.println("文件是否存在: "+f.exists());
//        if (f.exists()){
//            f.delete();
//        }else {
//            f.createNewFile();
//        }
        File f3 = new File("文件名的全部地址名字");
        //两个对象的地址值是否相等
        System.out.println(f == f3);
        System.out.println(f.equals(f3));

        System.out.println("文件的绝对路径: "+f.getAbsolutePath());
        System.out.println("文件的相对路径: "+f.getPath());
        System.out.println("文件的相对地址："+f.toString());

        System.out.println("---------");
        File f4 = new File("demo.txt");
        if(!f4.exists()){
            f4.createNewFile();
        }
        File f5 = new File("a/b/c/demo.txt");
        if (!f4.exists()){
            f4.createNewFile();
        }
        System.out.println("文件的绝对路径: "+f5.getAbsolutePath());
        System.out.println("文件的相对路径: "+f5.getPath());
    }
}
