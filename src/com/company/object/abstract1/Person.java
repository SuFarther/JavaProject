package com.company.object.abstract1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Person
 * @company 公司
 * @Description 面向对象-抽象类和抽象方法
 *  （1）一个方法的方法体去掉,然后被abstract修饰,那么这个方法就变成一个抽象方法
 *   (2) 在一个类中如果是抽象方法,那么那个类就变成一个抽象类
 *   (3) 一个抽象类可以有0-n抽象方法
 *   总结：有抽象方法的类一定是抽象类,有抽象类的类不一定有抽象方法
 *   (4) 抽象类可以被其他类继承
 *   (5) 一个类继承一个抽象类,那么这个类可以变成抽象类
 *   (6) 一般子类不会加abstract修饰,一般会让子类重写父类中的抽象方法
 *   (7) 子类继承抽象类,就必须抽象全部的抽象方法
 *   (8) 子类如果没有重写父类全部的抽象方法,那么子类可以变成一个抽象类
 *
 *   抽象类作用:
 *   在抽象类中定义抽象方法,目的是为了子类提供一个通用的模版,子类可以在模版的基础上进行开发,先重写父类的抽象方法,然后
 *   可以扩展子类自己的内容。抽象类设计避免子类设计的随意性,通过抽象类,子类的设计变得更加严格，进行某些成都上的限制,
 *   使子类更加的通用
 *
 * @createTime 2021年08月04日 08:30:30
 */
abstract public class Person {

    public void eat(){
        System.out.println("我吃吃吃");
    }

   abstract public void say();
}


class  Student extends Person{

    @Override
    public void say() {
        System.out.println("我在学习日语");
    }
}

class Demo{
    public static void main(String[] args) {
        //创建抽象类的对象是不可以的

        //创建子类对象
        Student s = new Student();
        s.say();
        s.eat();


        Person p = new Student();
        p.eat();
        p.say();
    }
}