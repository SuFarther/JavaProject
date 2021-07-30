package com.company.object;

/**
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description
 * @createTime 2021年07月31日 01:36:36
 */
public class Student {
    /**
     * 成员变量和局部变量的区别:
     *
     *   区别1:  代码的位置  成员变量是在类中方法外,局部变量是方法中
     *   区别2:  代码的作用域  成员变量的作用域是在类中多个方法,局部变量的作用域在一个方法中(当前代码快)
     *   区别3:  是否有默认值  成员变量有默认值,局部变量没有默认值
     *   区别4:  是否初始化    成员变量不需要初始化,局部变量一定需要初始化
     *   区别5: 内存中位置不同
     */
     int a;
     byte b;

     public  void study(){
         int num = 2;
         System.out.println("我去学习");
     }

     public void eat(){
         System.out.println("我要吃饭");
     }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.a);
        s.study();
    }
}
