package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BuyTicketSynchronizedThread
 * @company 公司
 * @Description 线程同
 * @createTime 2021年08月22日 22:38:38
 */
public class BuyTicketSynchronizedThread implements  Runnable{
    static int ticketNum = 10;


    @Override
    public void run() {
        // 同步代码块, 把具有安全隐患锁住即可,如果锁多了就会效率低,this就是这个锁
        for (int i = 1; i <= 100; i++) {
           synchronized (this){
               if(ticketNum > 0){
                   System.out.println("我在"+Thread.currentThread().getName()+"买了广州南到深圳北"+ticketNum--+"张票");
               }
           }
        }
    }
}


class  BuyTicketSynchronizedThreadTest{
    public static void main(String[] args) {
        BuyTicketSynchronizedThread btk1 = new BuyTicketSynchronizedThread();
        Thread t1 = new Thread(btk1,"窗口1");
        t1.start();

        BuyTicketSynchronizedThread btk2 = new BuyTicketSynchronizedThread();
        Thread t2 = new Thread(btk2,"窗口2");
        t2.start();

        BuyTicketSynchronizedThread btk3 = new BuyTicketSynchronizedThread();
        Thread t3 = new Thread(btk3,"窗口3");
        t3.start();
    }
}