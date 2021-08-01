package com.company.object.rewrite;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月01日 23:07:07
 */
public class Student extends Person{

    public void study(){
        System.out.println("学习");
    }

    @Override
    public void eat(){
        System.out.println("我可以吃小龙虾喝酒");
    }
}
