package com.company.reflection;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ClassInstance
 * @company 公司
 * @Description 可以作为Class类的实例的种类
 * (1) 类: 外部类 内部类
 * (2) 接口
 * (3) 注解
 * (4) 数组
 * (5) 基本数据类型
 * (6) void
 * @createTime 2021年08月26日 22:31:31
 */
public class ClassInstance {
    public static void main(String[] args) {
        Class c1 = Person.class;
        System.out.println(c1);
        Class c2 = Runnable.class;
        System.out.println(c2);
        Class c3 = Comparable.class;
        System.out.println(c3);
        Class c4 = Override.class;
        System.out.println(c4);

        /**
         * 同一维度,同一元素类型,得到字节码同一个
         */
        int[] arr1 = {1,2,3,4};
        Class  c5 = arr1.getClass();
        int[] arr2 = {6,7};
        Class  c6 = arr2.getClass();
        System.out.println(c5==c6);


        Class c7 = int.class;
        System.out.println(c7);

        Class c8 = void.class;
        System.out.println(c8);
    }
}
