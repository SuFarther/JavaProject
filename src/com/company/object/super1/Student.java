package com.company.object.super1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月02日 05:50:50
 */
public class Student extends  Person {
    double score;

    public void study(){
        System.out.println("考试");
    }

    public void  a(){
        System.out.println(super.age);
        super.eat();
        System.out.println(age);
        eat();
    }
}
