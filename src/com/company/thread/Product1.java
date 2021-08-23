package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Product1
 * @company 公司
 * @Description 生产者和消费者
 * 出现问题：
 *  (1) 生产者和消费者没有交替输出
 *  (2) 打印数据错乱
 *   -----没有加同步
 *
 *
 * @createTime 2021年08月23日 21:11:11
 */

/**
 * 商品类
 * @author zairensuyi
 */
public class Product1 {
    private String brand;
    private String name;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
class ProducerThread extends Thread{

    /**
     * 传入一个共同的产品类对象
     */
    private Product1 p;

    public ProducerThread(Product1 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 0) {
                p.setBrand("费力罗");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.setName("巧克力");
            }else{
                p.setBrand("哈尔滨");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.setName("啤酒");
            }
            System.out.println("生产者生产了："+ p.getBrand() + "------" + p.getName());
        }
    }
}

/**
 * 消费者
 */
class ConsumerThread extends  Thread{
    /**
     * 传入一个共同的产品类对象
     */
    private Product1 p;

    public ConsumerThread(Product1 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("消费者消费了："+ p.getBrand() + "------" + p.getName());
        }
    }
}

class Product1Test{
    public static void main(String[] args) {
        Product1 p1 = new Product1();

        //创建生产者和消费者线程
        ProducerThread pt = new ProducerThread(p1);
        ConsumerThread ct = new ConsumerThread(p1);

        pt.start();
        ct.start();
    }
}