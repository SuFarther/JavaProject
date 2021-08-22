package com.company.thread;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 苏东坡1
 * @version 1.0
 * @ClassName ThreadSleep
 * @company 公司
 * @Description 线程常用方法sleep
 * 人为的阻塞事件
 * @createTime 2021年08月22日 20:52:52
 */
public class ThreadSleep {
    public static void main(String[] args) {
       //定义一个时间日期的控件，时间范围为时分秒
       DateFormat df = new SimpleDateFormat("hh:mm:ss");
       while (true){
           //打印现在的日期
           Date date = new Date();

           //将Date类型转成String类型
           String format = df.format(date);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(format);
       }
    }
}
