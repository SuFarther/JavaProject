package com.company.object.super1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Dog
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月02日 05:58:58
 */
public class Dog extends Animal{
    int score;
    int  age = 10;


    public  void study(){
        System.out.println("学习技能");
    }

    /**
     *重写是发生在父子类中,当子类不满足父类的方法,子类就可以重写父类的方法,方法名必须想相同
     * 如果子类dog中有age= 10； 父类中也有age = 20;
     * 子类如果想得到age= 20 我们就应该super调用
     * 在特殊情况下,当子类和父类的属性重名时,你要想使用父类的属性,必须加上修饰符super.,只能通过super.属性来调用
     */
    @Override
    public  void eat(){
        System.out.println(this.age);
        System.out.println("吃食物、吃骨头");
    }

    public void a(){
        System.out.println(age);
        this.eat();
        System.out.println("super.属性和方法调用父类的属性和方法:");
        System.out.println(super.age);
        super.eat();
    }

}
