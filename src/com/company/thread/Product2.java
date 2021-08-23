package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Product2
 * @company 公司
 * @Description 同步代码块实现生产者和消费者
 * 这里只是解决线程同步问题,交叉运行还是不行的
 * @createTime 2021年08月23日 21:33:33
 */
public class Product2 {
    /**
     *  品牌
     */
    private String Brand;

    /**
     * 名字
     */
    private String name;

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
}


/**
 * 生产者
 */
class ProduceThread2 extends Thread{

    /**
     * 共同品牌
     */
    private Product2 p;


    public ProduceThread2(Product2 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (p){
                if(i % 2 == 0){
                    p.setBrand("费力罗");
                    p.setName("巧克力");
                }else{
                    p.setBrand("哈尔滨");
                    p.setName("啤酒");
                }
                System.out.println("生产者生产了: " + p.getBrand() + "------"+ p.getName());
            }
        }
    }
}

/**
 * 消费者
 */
class ConsumerThread2 extends  Thread{
    /**
     * 共同品牌
     */
    private Product2 p;

    public ConsumerThread2(Product2 p) {
        this.p = p;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            synchronized (p){
                System.out.println("消费者消费了: " + p.getBrand() + "------"+ p.getName());
            }
        }
    }
}

class Product2Test{
    public static void main(String[] args) {
        Product2 p2 = new Product2();
        ProduceThread2 pt2 = new ProduceThread2(p2);
        ConsumerThread2 ct2 = new ConsumerThread2(p2);
        pt2.start();
        ct2.start();
    }
}