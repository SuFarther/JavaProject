package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-9:49 上午
 *
 * 数组初始化方式分为3种:
 * 静态初始化、动态初始化、默认初始化
 * 静态初始化有三种方式,是指初始化和赋值同时完成
 * 动态初始化是先初始化值，然后在赋值,分开写
 * 默认初始化是指数组的类型都有一个默认值
 */
public class ArrayTest3 {
    public static void main(String[] args) {

        /**
         * 静态初始化三种写法
         * 第一种:数组的基本数据类型 变量 = new 数组的基本数据类型[长度]；
         * 数组的基本数据类型 变量 = new 数组的基本数据类型[]{数值1，数值2，数组3，数值4}；
         * 数组的基本数据类型 变量 = {数组1，数值2。。。。}
         */
        int[] a = new int[4];
        System.out.println(a.length);
        int[] b = new int[]{1,2,3,4};
        System.out.println(b[0]=1);
        int[] c = {1,2,4,5};
        System.out.println(c.length);

        /**
         * 动态初始化
         */
        int[] d;
        d = new int[4];
        System.out.println(d[0] = 2);

        /**
         * 默认初始值
         */
        int[] e = new int[4];
        System.out.println(e[0]);

    }
}
