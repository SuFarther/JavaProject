package com.company.object.interface2;

import com.company.object.one.Test;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TestInterface
 * @company 公司
 * @Description jdk1.8后的接口
 *  在JDK1.8之后,新增非抽象方法
 *   (1) 被public default 修饰的非抽象方法
 *      注意1: default修饰符必须要加上,否则出错
 *      注意2: 实现类中要是想重写接口中的非抽象方法,那么default修饰符必须不能加,否则出错
 *
 *
 * @createTime 2021年08月04日 16:09:09
 */
public interface TestInterface {
    //常量
    public static  final int NUM = 10;
    //抽象方法
    public  abstract  void a();
    //修饰非抽象方法
    public  default  void b(){
        System.out.println("-------b----------");
    }
}

/**
 * @author Student类
 */
class  Student implements TestInterface{

    public void c(){
        b(); //可以
//        super.b();  不可以
        TestInterface.super.b(); //可以
    }

    @Override
    public void a() {
        System.out.println("重写a的方法");
    }

    @Override
    public void b() {
        System.out.println("重写b的方法");
    }
}