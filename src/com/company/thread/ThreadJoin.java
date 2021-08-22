package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadJoin
 * @company 公司
 * @Description 线程常见方法_join
 * join方法: 当一个线程调用了join方法,这个线程就会先被执行,它执行结束以后才可以去执行其余的线程
 * @createTime 2021年08月22日 20:36:36
 */
public class ThreadJoin extends Thread{

    public ThreadJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName()+i);
        }
    }
}


class ThreadJoinTest{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            System.out.println("main------"+i);
            if(i == 6){
                ThreadJoin t = new ThreadJoin("子线程");
                t.start();
                t.join();
            }
        }
    }
}