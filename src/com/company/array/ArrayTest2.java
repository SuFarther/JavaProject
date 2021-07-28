package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-9:09 上午
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        /**
         * 数组的定义: 数组是用来存储相同的数据类型,我们称之为数组
         * 数组的作用: 用啦存储相同的数据类型
         * 1、声明
         * 2、创建
         * 3、赋值
         * 4、使用
         *
         * 数组分为基本数据类型的数组 引用数据类型的数组
         * 数组中如果有两个不同的数据类型,根据赋值的不同,决定使用哪个数据类型为开始位置,离他最近的
         * byte[]   ---->0
         * short[]  ----->0
         * char[]  --->'u\000'
         * int[]   --->'0'
         * long[]  ---> '0'
         * float[]  ----> '0'
         * double[]  ---> '浮点型'
         * boolean[]  -->false
         */

        int[] arr;
        arr = new int[10];
        arr[0] = 10;
        System.out.println(arr[0]);
    }
}
