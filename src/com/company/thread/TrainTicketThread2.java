package com.company.thread;

/**
 * @author 抢火车票
 * @version 1.0
 * @ClassName TrainTicketThread2
 * @company 公司
 * @Description 线程第二种方式去抢
 * @createTime 2021年08月22日 13:15:15
 */
public class TrainTicketThread2 implements Runnable{

    static int trainTicket = 10;


    @Override
    public void run() {
        //100个人去抢
        for (int i = 1; i < 100; i++) {
            if(trainTicket > 0){
                System.out.println(Thread.currentThread().getName()+"抢到了广州南到深圳北"+trainTicket--+"张票");
            }
        }
    }
}


class TrainTicketThread2Test{
    public static void main(String[] args) {
        TrainTicketThread2 tr1= new TrainTicketThread2();
        Thread t1 = new Thread(tr1);
        t1.start();

        TrainTicketThread2 tr2= new TrainTicketThread2();
        Thread t2 = new Thread(tr2);
        t2.start();


        TrainTicketThread2 tr3= new TrainTicketThread2();
        Thread t3 = new Thread(tr3);
        t3.start();
    }
}