package com.company.object.interface2;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TestInterface2
 * @company 公司
 * @Description JDK1.8后的静态方法
 *  注意1： static不可以省略不写
 *  注意2： 静态方法不能重写
 *
 *  为什么要在接口中加入非抽象方法？？
 *  如果接口中只能定义抽象方法的话,那么我要是修改接口中的内容,那么对实现类的影响太大了,所有实现类都会收到影响
 *  现在在接口中加入非抽象方法,对实现类没有影响，想调用就去调用即可
 *
 * @createTime 2021年08月04日 16:22:22
 */
public interface TestInterface2 {
    //    常量
    public  static  final  int NUM = 10;
    // 抽象方法
    public abstract void a();

    //修饰非抽象方法
    public default void b(){
        System.out.println("我是TestInterface2非抽象方法");
    }

    //修饰静态方法
    public static  void c(){
        System.out.println("我是TestInterface2静态方法");
    }
}

class Demo  implements  TestInterface2{

    @Override
    public void a() {
        System.out.println("重写了A方法");
    }

    @Override
    public void b() {
        TestInterface2.super.b();
    }


    public static  void c(){
        System.out.println("我是Demo中的静态方法");
    }
}

class A{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
        //类名访问
        Demo.c();
        //接口访问
        TestInterface2.c();
    }
}
