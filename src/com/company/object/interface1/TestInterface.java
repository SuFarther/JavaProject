package com.company.object.interface1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TestInterface
 * @company 公司
 * @Description 面向对象,接口
 *   (1) 类是类,接口是接口,它们是同一个层次概念
 *   (2) 接口没有构造器
 *   (3) 接口如何声明: interface
 *   (4) 在JDK1.8之前,接口中只有两部分内容:
 *      (1) 常量: 固定修饰符: public static final
 *      (2) 抽象方法: 固定修饰符: public abstract
 *
 *      注意: 修饰符可以省略不写
 *   (5) 类和接口的关系: 实现关系 类实现接口
 *   (6) 一旦实现一个接口,那么实现类要重写接口中全部抽象方法
 *   (7) 如果没有全部重写抽象方法,那么那个类可以变成一个抽象类
 *   (8) 一个类继承其他类,只能直接继承一个父类
 *   但是实现接口的话,可以实现多个接口
 *   (9) 写法: 先继承,再实现
 *   (10) 接口不能创建对象:
 *   TestInterface2 t =  new Stundet(); //接口指向实现类----》多态
 *
 *   (11)接口中常量如何访问:
 *     (1)接口.接口中的常量
 *     (2)实现接口的类创建对象,然后调用接口的常量
 *     (3)子类.接口中的常量
 *   (12)接口的作用是什么？
 *     定义规则,只是跟抽象类不同地方在哪里？它是接口不是抽象类
 *     接口定义好规则后,实现类负责实现即可
 *    (13) 继承:子类对父类继承 (is...a关系)
 *         实现： 实现类对接口实现 (has...a关系)
 *    (14) 多态应用场合：
 *        （1） 父类当作方法形参,传入具体子类对象
 *         (2) 父类当作方法的返回值,返回的是具体的子类对象
 *         (3) 接口当作方法的形参,传入具体实现类对象
 *         (4) 接口当作方法的返回值,返回的是具体的实现类对象
 * @createTime 2021年08月04日 09:15:15
 */
public interface TestInterface {

//    public final  static int NUM = 10;
//    public   abstract void a ();

    int NUM = 10;
    void  a();
    void  b();
}

interface  TestInterface2{
    void d();
}


class Person{
    public void c(){
        System.out.println("吃吃吃");
    }
}

class  Student extends  Person implements TestInterface,TestInterface2{
    @Override
    public void c() {
        System.out.println("吃吃吃,火腿肠");
    }

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void d() {
        System.out.println("d");
    }
}


class Test{
    public static void main(String[] args) {
        //获取接口中的常量
        System.out.println("接口常量获取是接口.接口中的常量:"+TestInterface.NUM);
        System.out.println("实现接口Student实现类.接口中的常量:"+Student.NUM);
        //多态 父类的引用指向子类对象  多态的体现----还是这个接口
        TestInterface t = new Student();
        System.out.println("接口的多态指向实现类,还是这个接口调用:"+ TestInterface.NUM);
        //实现类创建对象
        Student s = new Student();
//        System.out.println("实现类.接口中常量"+ s.NUM);
    }
}
