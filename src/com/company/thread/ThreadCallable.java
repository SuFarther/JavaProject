package com.company.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ThreadCallable
 * @company 公司
 * @Description 线程的第四种方式 实现Callable接口
 *
 * 好处:  实现Callable好处： 有返回1值  抛出异常
 * 坏处:  创建线程麻烦
 *
 * public class FutureTask<V> implements RunnableFuture<V>{}
 * RunnableFuture接口下
 * public interface RunnableFuture<V> extends Runnable, Future<V> {
 *   void run();
 * }
 * @createTime 2021年08月22日 13:37:37
 */
public class ThreadCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}


class ThreadCallableTest{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCallable tc = new ThreadCallable();
        FutureTask ft = new FutureTask(tc);

        //我们发现线程类里面没有runnable接口
        Thread t = new Thread(ft);
        t.start();

        Object o = ft.get();
        System.out.println(o);
    }
}