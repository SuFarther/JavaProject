package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadImplementsRunnable2
 * @company 公司
 * @Description 利用匿名内部类来创建对象2
 * @createTime 2021年08月22日 13:00:00
 */
class ThreadImplementsRunnable2Test{
    public static void main(String[] args) {
       Thread t = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 1; i <= 10; i++) {
                   System.out.println(Thread.currentThread().getName()+i);
               }
           }
       });
       t.start();
    }
}