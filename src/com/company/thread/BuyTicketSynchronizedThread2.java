package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BuyTicketSynchronizedThread2
 * @company 公司
 * @Description 线程同步
 * 认定锁，指的是同一个把锁,所必须是同一把锁,
 * "abc"在参量池中是唯一的，所以a,b,c用的是同一把锁,一般传字节码
 * @createTime 2021年08月22日 23:04:04
 */
public class BuyTicketSynchronizedThread2 extends  Thread{
    static int ticketNum = 10;

    public BuyTicketSynchronizedThread2(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
           synchronized (BuyTicketSynchronizedThread2.class){
               if (ticketNum > 0){
                   System.out.println("我在"+this.getName()+"买了广州南到深圳北"+ticketNum--+"张票");
               }
           }
        }
    }
}


class BuyTicketSynchronizedThread2Test{
    public static void main(String[] args) {
        BuyTicketSynchronizedThread2 t1 = new BuyTicketSynchronizedThread2("窗口1");
        t1.start();

        BuyTicketSynchronizedThread2 t2 = new BuyTicketSynchronizedThread2("窗口2");
        t2.start();

        BuyTicketSynchronizedThread2 t3 = new BuyTicketSynchronizedThread2("窗口3");
        t3.start();
    }
}