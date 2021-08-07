package com.company.commonclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Math
 * @company 公司
 * @Description Math类
 * (1) 直接使用,无需导包
 * (2) final修饰类,这个类不能被继承
 * (3) 构造器私有化,不能创建Math对象
 *  (4) Math内部所有属性,都被static使用
 *  （5）静态导入
 * @createTime 2021年08月07日 10:09:09
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println("圆周率都的大小:"+Math.PI);
        //[0.0,1.0)
        System.out.println("随机数："+Math.random());
        System.out.println("向上取整: "+Math.ceil(7.7));
        System.out.println("向下取整："+Math.floor(3.2));
        System.out.println("绝对值:"+Math.abs(-80));
        System.out.println("四舍五入："+Math.round(4.5));
        System.out.println("取最大值的值:"+Math.max(3,6));
        System.out.println("取最小值的值:"+Math.min(3,6));
    }
}
