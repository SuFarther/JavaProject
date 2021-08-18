package com.company.io;

import java.io.File;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FileOperationDirectory
 * @company 公司
 * @Description File对目录对操作
 *
 * f.mkdir():   创建单层目录
 * f.mkdirs():  创建多层目录
 * f.delete(); 如果删除目录的话，只会删除一层，并且前提是这个目录是空的,里面没有内容,如果有内容就不会被删除
 * f.list(); 文件夹下面的东西都会遍历输出
 * f.listFiles(); 作用更强点
 *
 * @createTime 2021年08月19日 06:30:30
 */
public class FileOperationDirectory {
    public static void main(String[] args) {
        File f = new File("文件夹名的地址");
        System.out.println("文件是否可读："+f.canRead());
        System.out.println("文件是否可写："+f.canWrite());
        System.out.println("文件名: "+f.getName());
        System.out.println("获取文件名的上级父类: "+f.getParent());
        System.out.println("是否是目录: "+f.isDirectory());
        System.out.println("是否是文件: "+f.isFile());
        System.out.println("文件是否存在: "+f.exists());
        System.out.println("文件的绝对路径: "+f.getAbsolutePath());
        System.out.println("文件的相对路径: "+f.getPath());


        File f2 = new File("/文件夹名1的地址/文件夹名2的地址");
        f2.mkdir();
        File f3 = new File("/文件夹名1的地址/文件夹名2的地址/文件夹名3地址");
        f3.mkdirs();
        f3.delete();

        File f4= new File("/文件夹名1的地址");
        String[] list = f4.list();
        for (String s: list) {
            System.out.println(s);
        }

        File[] files = f4.listFiles();
        for (File file:files) {
            System.out.println(file.getName()+"------"+file.getAbsolutePath());
        }
    }
}
