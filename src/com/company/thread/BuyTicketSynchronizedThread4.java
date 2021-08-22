package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BuyTicketSynchronizedThread4
 * @company 公司
 * @Description 同步方法块
 * @createTime 2021年08月22日 23:52:52
 */
public   class BuyTicketSynchronizedThread4 extends  Thread{

    static int ticketNum = 10;

    public BuyTicketSynchronizedThread4(String name){
        super(name);
    }

    public static synchronized void buyTicket(){
        if (ticketNum > 0){
            System.out.println("我在"+Thread.currentThread().getName()+"买了广州南到深圳北"+ticketNum--+"张票");
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            buyTicket();
        }
    }
}

class BuyTicketSynchronizedThread4Test{
    public static void main(String[] args) {
        BuyTicketSynchronizedThread4 t1 = new BuyTicketSynchronizedThread4("窗口1");
        t1.start();

        BuyTicketSynchronizedThread4 t2 = new BuyTicketSynchronizedThread4("窗口2");
        t2.start();

        BuyTicketSynchronizedThread4 t3 = new BuyTicketSynchronizedThread4("窗口3");
        t3.start();
    }
}
