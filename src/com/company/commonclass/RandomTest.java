package com.company.commonclass;

import java.util.Random;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName RandomTest
 * @company 公司
 * @Description Random
 * @createTime 2021年08月07日 10:19:19
 */
public class RandomTest {
    public static void main(String[] args) {
        System.out.println("随机数:"+Math.random());

        //利用带参数带数的构造器创建对象
        Random r1 = new Random(System.currentTimeMillis());
        int i1 = r1.nextInt();
        System.out.println(i1);

        //利用空构造器创建对象
        Random r2 = new Random();
        System.out.println(r2.nextInt(10));
        System.out.println(r2.nextDouble());
    }
}
