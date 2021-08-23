package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Product4
 * @company 公司
 * @Description 生产和消费者 使用同步代码块
 * 并且让他们交替运行
 *
 * 说明: 你持有锁进入锁池
 * 你没有持有池 进入等待池
 * 在Java对象中有两种池
 * 锁池------ synchronized
 * 等待池------ wait()、notify()、notifyAll()
 * 如果未来的某一时刻,另外一个线程调用了相同对象的notify方法或者notify方法,那么该等待池中的线程就会被唤起,然后进入到对象的锁池里面获得该对象的锁,
 * 如果获取锁成功后，那么该线程就会沿着wait方法之后的路径继续执行。注意是沿着wait方法之后
 *
 * 注意:
 *   wait方法和notify()要在同步方法和同步代码块才有效的(因为在同步的基础上进行线程通信才有效的)
 *   sleep和wait区别: sleep进入阻塞状态没有释放锁，wait进入阻塞状态同时释放了锁
 *
 * @createTime 2021年08月23日 21:47:47
 */
public class Product4 {
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


    public synchronized void setProduct(String brand,String name){
        //灯是红色,证明有商品,生产者不生产,等待消费者消费
        if (flag == true){
            try {
                wait();
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
        notify();
    }

    public synchronized void getProduct(){
        //灯是绿色,说明没有商品,flag == false，等待生产者生产
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了:"+ this.getBrand() + "-----" + this.getName());

        //消费完,灯变绿
        flag = false;

        //告诉生产者来生产
        notify();
    }
}

class Produce4Thread extends Thread{

    private  Product4 p;

    public Produce4Thread(Product4 p) {
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

class Consumer4Thread extends Thread{
    private Product4 p;

    public Consumer4Thread(Product4 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
           p.getProduct();
        }
    }
}

class Product4Test{
    public static void main(String[] args) {
        Product4 p4 = new Product4();
        Produce4Thread pt4 = new Produce4Thread(p4);
        Consumer4Thread ct4 = new Consumer4Thread(p4);

        pt4.start();
        ct4.start();
    }
}