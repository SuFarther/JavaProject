package com.company.jdk8;


import org.junit.Test;

import java.util.Comparator;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName  LambdaTest
 * @company 公司
 * @Description lambda箭头函数
 * (o1,o2)->Integer.compare(o1,o2);
 *    格式:
 *     -> : lambda操作符 或 箭头操作符
 *     -> 左边: lambda形参列表 (其实就是接口中的抽象方法的形参列表)
 *     -> 右边： lambda体 (其实就是重写的抽象方法的方法体)
 *
 *
 * @createTime 2021年08月27日 18:45:45
 */
public class LambdaTest {


    @Test
    public void testRunnable(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱我家乡");
            }
        };
        runnable.run();


        //lambada表达式写法
        Runnable runnable1 =  ()-> System.out.println("我爱我家");
        runnable1.run();
    }

    @Test
    public void testComparator(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(12, 20);
        System.out.println(compare1);


        Comparator<Integer> com2 = (o1,o2)->Integer.compare(o1,o2);
        int compare2 = com2.compare(12, 20);
        System.out.println(compare2);

        /**
         * 方法引用
         */
        Comparator<Integer> com3 = Integer::compare;
        int compare3= com3.compare(20, 12);
        System.out.println(compare3);
    }
}
