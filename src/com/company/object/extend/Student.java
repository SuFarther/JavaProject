package com.company.object.extend;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description 学生类 子类
 * @createTime 2021年08月01日 14:42:42
 */
public class Student extends Person{

    private int stuno;



    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public void study(){
        System.out.println("学生可以学习");
    }
}
