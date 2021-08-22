package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadSetPriority1
 * @company 公司
 * @Description 线程类设置优先级别
 * （1）同优先级别线程，采取的策略就是先到先服务，使用时间片策略
 *  (2) 如果优先级别1高，被CPU调度的概率高
 * @createTime 2021年08月22日 14:05:05
 */
public class ThreadSetPriority1 extends  Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
    }
}


class ThreadSetPriority2 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <=30 ; i++) {
            System.out.println(i);
        }
    }
}


class ThreadSetPriorityTest{
    public static void main(String[] args) {
        ThreadSetPriority1 t1 = new ThreadSetPriority1();
        t1.setPriority(5);
        t1.start();
        ThreadSetPriority2 t2= new ThreadSetPriority2();
        t2.setPriority(1);
        t2.start();

    }
}