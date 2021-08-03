package com.company.object.polymorphic;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Cat
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月03日 15:10:10
 */
public class Cat extends Animal{

    @Override
    public void shout(){
        System.out.println("我是猫咪,我可以喵喵喵！");
    }

    public  void   scratch(){
        System.out.println("猫咪很生气,我可以挠人");
    }

}
