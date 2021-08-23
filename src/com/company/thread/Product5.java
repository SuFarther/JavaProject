package com.company.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Product5
 * @company 公司
 * @Description 生产和消费者 使用同步代码块
 * 并且让他们交替运行
 *
 * Lock锁下的线程通信
 * Lock(同步器)拥有一个同步队列和多个等待队
 * 创建两个生产者和两个消费者,他们各自放入自己的生产池和等待池
 *
 * @createTime 2021年08月23日 21:57:57
 */
public class Product5 {
    /**
     * 声明一个Lock锁
     */
    Lock lock = new ReentrantLock();
    /**
     * 声明一个生产者队列
     */
    Condition produceCondition =  lock.newCondition();
    /**
     * 声明一个消费者队列
     * @return
     */
    Condition consumerCondition =  lock.newCondition();
    private String Brand;
    private String name;
    /**
     * 引入一个灯 true:红色  false:绿灯
     * 默认情况没有商品，让生产者生产,让消费者消费
     * 红色: 有商品可以消费
     * 绿色：没有商品,生产者开始生产
     *
     *
     */
    private Boolean flag = false;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  void setProduct(String brand,String name){
        lock.lock();
        try {
            //灯是红色,证明有商品,生产者不生产,等待消费者消费
            if (flag == true){
                try {
//                    wait();
                    //生产者队列阻塞 进入等待队列 并且释放锁
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //灯是绿色的,就消费
            this.setBrand(brand);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了:"+ this.getBrand() + "-----" + this.getName());

            //生产完以后,灯变色,变成红色
            flag = true;

            //告诉消费者去消费
//            notify();
            //生产者通过signal唤醒之前await()在等待队列的线程,让他进入consumerCondition消费者队列
            consumerCondition.signal();
        }finally {
            lock.unlock();
        }
    }

    public  void getProduct(){
        lock.lock();
        try {
            //灯是绿色,说明没有商品,flag == false，等待生产者生产
            if(!flag){
                try {
//                    wait();
                    //消费者的等待,消费者进入等待队列
                    consumerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者消费了:"+ this.getBrand() + "-----" + this.getName());

            //消费完,灯变绿
            flag = false;

            //告诉生产者来生产
//            notify();
            produceCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}

class Produce5Thread extends Thread{

    private  Product5 p;

    public Produce5Thread(Product5 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 0){
                p.setProduct("费利罗","巧克力");
            }else{
                p.setProduct("哈尔滨","啤酒");
            }
        }
    }
}

class Consumer5Thread extends Thread{
    private Product5 p;

    public Consumer5Thread(Product5 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
           p.getProduct();
        }
    }
}

class Product5Test{
    public static void main(String[] args) {
        Product5 p5 = new Product5();
        Produce5Thread pt5 = new Produce5Thread(p5);
        Consumer5Thread ct5 = new Consumer5Thread(p5);

        pt5.start();
        ct5.start();
    }
}