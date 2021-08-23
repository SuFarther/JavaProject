package com.company.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadLock
 * @company 公司
 * @Description Thread下面的Lock锁
 * Lock和synchronized的区别
 * 1、Lock是显示锁,（手动开启和关闭锁，别忘记关锁）,synchronized是隐式
 * 2、Lock只有代码块锁,synchronized有代码块和方法锁
 * 3、使用Lock锁，JVM将话费较少时间来调度线程,性能更好,并且具有更好的扩展性(提供更多的子类)
 *
 * 使用顺序
 *  Lock。。。。同步代码块(已经进入了方法体,分配相应的资源)...同步方法(在方法体外之外)
 * @createTime 2021年08月23日 16:25:25
 */
public class ThreadLock implements Runnable{
    static int ticketNum = 10;
    /**
     * 拿来一把锁
     */
    Lock lock = new ReentrantLock();


    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            //打开锁
            lock.lock();
            try {
                if (ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+"买了广州南到深圳北的"+ticketNum--+"张票");
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //关闭锁，如果前面出现异常,会导致锁关不上
                lock.unlock();
            }
        }
    }
}


class ThreadLockTest{
    public static void main(String[] args) {
        ThreadLock t = new ThreadLock();
        Thread t1 = new Thread(t,"窗口1");
        t1.start();

        Thread t2 = new Thread(t,"窗口2");
        t2.start();

        Thread t3 = new Thread(t,"窗口3");
        t3.start();
    }
}