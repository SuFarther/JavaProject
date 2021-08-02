package com.company.object.object;

/**
 * @version 1.0
 * @ClassName PhoneTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月02日 21:03:03
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("张三",19,2021);
        Phone p2 = new Phone("张三",19,2021);
        /**
         * equals方法:  作用: 比较对象具体内容是否相等
         * 点进源码 底层依旧比较是==,依旧比较的是地址值
         * equals作用: 这个方法提供了对象是否相等,对象的内容就是属性
         * 父类Object提供的equals就是在比较== 地址,没有实际的意义,我们一般不会直接使用
         * 父类提供的方法,而是在子类中对这个方法进行重写
         *
         */
        if(p1.equals(p2)){
            System.out.println("两个对象相等");
        }else{
            System.out.println("两个对象不相等");
        }

        Cat c = new Cat();
        System.out.println(p1.equals(c));
    }
}
