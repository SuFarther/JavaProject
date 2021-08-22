package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TrainTicketThread
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月22日 12:48:48
 */
public class TrainTicketThread extends  Thread{

    /**
     * 定义一个全局的10长票
     */
    static int trainTicket = 10;


    public TrainTicketThread(String name){
        super(name);
    }

    @Override
    public void run() {
        /**
         * 每个窗口有100个人抢票
         */
        for (int i = 1; i <=100 ; i++) {
            if(trainTicket > 0){
                System.out.println("我在"+this.getName()+"广州南到深圳南"+trainTicket--+"张票");
            }
        }
    }
}


class  TrainTicketThreadTest{
    public static void main(String[] args) {
        TrainTicketThread t1 = new TrainTicketThread("窗口1");
        t1.start();

        TrainTicketThread t2 = new TrainTicketThread("窗口2");
        t2.start();

        TrainTicketThread t3 = new TrainTicketThread("窗口3");
        t3.start();
    }
}