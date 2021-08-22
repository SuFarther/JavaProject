package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadStop
 * @company 公司
 * @Description 线程下的停止方法
 * @createTime 2021年08月22日 21:17:17
 */
public class ThreadStop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
           if(i==6){
               Thread.currentThread().stop();
           }
            System.out.println(i);
        }
    }
}
