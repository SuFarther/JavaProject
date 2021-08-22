package com.company.thread;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExtendsThread1
 * @company 公司
 * @Description TODO
 * 实现多线程的方式,第一个继承Thread类,具备了争抢资源的能力
 * @createTime 2021年08月22日 12:07:07
 */
public class ExtendsThread1 extends Thread{
    /**
     * 一会线程对象就要开始争抢资源了,这个线程要执行的任务到底是啥？这个任务你要放在方法中
     * 但是这个方法不能是随便写的一个个方法,必须是重写Thread类中的run方法
     * 然后线程的任务/逻辑写在run方法中
     */
    public ExtendsThread1(String name){
       super(name);
    }


    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
//            System.out.println(super.getName()+i);
            System.out.println(this.getName()+i);
        }
    }
}

class ExtendsThreadTest{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"1"+i);
        }

        /**
         * 调用run方法,想要执行线程中的方法-----》这个run方法不能直接调用,直接调用就会被当做普通的方法。想要
         * tt子线程真正作用比如要启用线程
         */
//        ExtendsThread1 t = new ExtendsThread1();
//        t.setName("子线程");
//        t.start();

        /**
         * 通过有参构造器获取线程名字
         */

        ExtendsThread1 t = new ExtendsThread1("子线程");
        t.start();



        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"2"+i);
        }
    }
}

