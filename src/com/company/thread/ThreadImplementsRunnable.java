package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadImplementsRunnable
 * @company 公司
 * @Description 创建线程的第二种方式,实现runnable接口,实现runnable就要实现他下面的run方法
 * @createTime 2021年08月22日 13:00:00
 */
public class ThreadImplementsRunnable implements Runnable{



    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}


class ThreadImplementsRunnableTest{
    public static void main(String[] args) {
        ThreadImplementsRunnable tr = new ThreadImplementsRunnable();
        /**
         * 我们发现Runnable实现的接口下面没有Thread类的start方法,那怎么办呢,创建一个线程类,把他引进来,让他们产生关联
         */
        Thread t =  new Thread(tr);
        t.start();
    }
}