package com.company.object.super1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Person
 * @company 公司
 * @Description super 超级的
 *
 *   (1）super指的是父类
 *  （2）super可以修饰属性,可以修饰方法
 *
 *    在子类的方法中,可以通过super.属性 super.方法 显示去调用父类提供方法,属性,在通常情况下,super可以省略不写
 *
 * @createTime 2021年08月02日 05:47:47
 */
public class Person {
    int  age;

    public void eat(){
        System.out.println("吃饭");
    }
}
