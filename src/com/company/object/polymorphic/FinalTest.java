package com.company.object.polymorphic;

import com.company.object.object.Cat;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName finalTest
 * @company 公司
 * @Description final关键字
 *  (1) 修饰变量
 *    final修饰一个变量,变量的值是不可以改变,这个变量也可以编程一个字符常量,约定俗家的规定: 被final修饰的变量(名字大写)
 *    基本数据类型
 *    finaL修饰引用数据类型,那么地址值不可变,对象的属性可以改变
 *
 * @createTime 2021年08月04日 06:00:00
 */
public class FinalTest {

    public static void main(String[] args) {
        //第一种
        final int A = 10;

        //第二种
        final FinalStudent s = new FinalStudent();
        s.age = 18;

        //第三种
        final FinalStudent s2 = new FinalStudent();
        a(s2);

        //第四种
        b(s2);
    }

    public static void a(FinalStudent s){
        s = new FinalStudent();
    }

    public static  void b(final  FinalStudent s){
//        s = new FinalStudent();
    }
}


