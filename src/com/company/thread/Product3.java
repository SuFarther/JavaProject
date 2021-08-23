package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Product3
 * @company 公司
 * @Description 生产和消费者 使用同步代码块
 * 如果把同步方法加在生产者里面控制的是生产者的里面的同步,如果把同步方法加在消费者里面控制的是消费者的里面的同步,线程同步讲的是同步一个方法
 * @createTime 2021年08月23日 21:47:47
 */
public class Product3 {
    private String Brand;

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


    public synchronized void setProduct(String brand,String name){
        this.setBrand(brand);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了:"+ this.getBrand() + "-----" + this.getName());
    }

    public synchronized void getProduct(){
        System.out.println("消费者消费了:"+ this.getBrand() + "-----" + this.getName());
    }
}

class Produce3Thread extends Thread{

    private  Product3 p;

    public Produce3Thread(Product3 p) {
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

class Consumer3Thread extends Thread{
    private Product3 p;

    public Consumer3Thread(Product3 p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
           p.getProduct();
        }
    }
}

class Product3Test{
    public static void main(String[] args) {
        Product3 p3 = new Product3();
        Produce3Thread pt3 = new Produce3Thread(p3);
        Consumer3Thread ct3 = new Consumer3Thread(p3);

        pt3.start();
        ct3.start();
    }
}