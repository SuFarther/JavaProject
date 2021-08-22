package com.company.thread;

import sun.rmi.runtime.RuntimeUtil;

/**
 * @author 伴随线程
 * @version 1.0
 * @ClassName ThreadSetDaemon
 * @company 公司
 * @Description SetDaemon方法,先设置再启动
 * 将子线程为主线程的伴随线程,主线程停止的时候,子线程也不要继续执行,但是还是有些时候垂死挣扎
 * @createTime 2021年08月22日 21:06:06
 */
public class ThreadSetDaemon extends  Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("子线程"+i);
        }
    }
}


class ThreadSetDaemonTest{
    public static void main(String[] args) {
        ThreadSetDaemon tsd = new ThreadSetDaemon();
        tsd.setDaemon(true);
        tsd.start();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("主线程"+i);
        }
    }
}