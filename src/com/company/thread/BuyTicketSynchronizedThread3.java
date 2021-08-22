package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BuyTicketSynchronizedThread3
 * @company 公司
 * @Description 同步方法
 * @createTime 2021年08月22日 23:45:45
 */
public class BuyTicketSynchronizedThread3 implements Runnable{
    static int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            BuyTicket();
        }
    }


    public synchronized void BuyTicket(){
        if(ticketNum > 0){
            System.out.println("我在"+Thread.currentThread().getName()+"买了广州南到深圳北"+ticketNum--+"张票");
        }
    }
}


class BuyTicketSynchronizedThread3Test{
    public static void main(String[] args) {
        BuyTicketSynchronizedThread3 t = new BuyTicketSynchronizedThread3();
        Thread t1 = new Thread(t,"窗口1");
        t1.start();


        Thread t2 = new Thread(t,"窗口2");
        t2.start();

        Thread t3 = new Thread(t,"窗口3");
        t3.start();
    }
}