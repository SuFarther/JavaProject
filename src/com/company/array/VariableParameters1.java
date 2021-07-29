package com.company.array;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-29-8:25 上午
 *
 * 可变参数: 作用提供了一个方法, 参数的个数是可变的,解决了部分方法的重载问题
 * int...num
 * double...num
 * boolean...num
 * 可变参数在JDK1.5之后加入的新特性
 * 方法的内部对可变参数的处理跟数组是一样的
 * 可变参数和其他数据一起作为形参的时候,可变参数一定放最后
 */
public class VariableParameters1 {
    public static void main(String[] args) {
        method(10);
        method();
        method(10, 20, 30);
        method(10, 20, 30, 40);
        method(new int[]{10, 20, 30});
        method2(10, 20, 30, 40);
    }


    public static void method(int... num) {
        System.out.println("1-----");
        for (int i : num) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void method2(int num, int... num1) {
        System.out.println("2---");
    }
}
