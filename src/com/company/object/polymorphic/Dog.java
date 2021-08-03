package com.company.object.polymorphic;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Dog
 * @company 公司
 * @Description 狗类
 * @createTime 2021年08月03日 15:12:12
 */
public class Dog  extends  Animal{

    @Override
    public void shout(){
        System.out.println("我是小狗,我可以汪汪汪！");
    }

    public void housekeeping(){
        System.out.println("小狗看家护院");
    }
}
