package com.company.object.inner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MemberInner
 * @company 公司
 * @Description 面向对象_内部类_成员内部类
 *
 * 1、类的组成: 属性，方法，构造器 ,代码块(普通块、静态块,构造块,同步块),内部类
 * 2. 一个类的在另一个类的内部类
 * 3、 内部类: 成员内部类(静态,非静态类的) 和 局部内部类(位置: 方法内,块内,构造器内)
 * 4、成员内部类:
 *     里面属性,方法,构造器等
 *     修饰符： private,default.protected,abstract
 * @createTime 2021年08月04日 16:41:41
 */
public class MemberInner {

    /**
     * 成员内部类
     *
     */
    public class  D{
        int age = 20;
        String name;
        public  void method(){
            int age = 30;
            //内部类可以访问外部类的内容
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(MemberInner.this.age);
//            a();
        }
    }

    static class  E{
        public  void method(){
            //静态内部类中只能访问外部类中被static修饰的内容
//            System.out.println(age);
//            a();
        }
    }


    /**
     * 属性
     */
    int age = 10;

    /**
     * 方法
     */
    public void a(){
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");
        }


        D d = new D();
        System.out.println(d.name);
        d.method();
    }

    //静态块
    static {
        System.out.println("这是一个静态块");
    }

    //构造块
    {
        System.out.println("这是一个构造块");
    }

    /**
     * 构造器
     */
    public MemberInner() {
    }

    public MemberInner(int age) {
        this.age = age;
    }
}

class  Test{
    public static void main(String[] args) {
        MemberInner m = new MemberInner();
        m.a();

        //静态成员内部类创建对象
        MemberInner.E e = new MemberInner.E();
        //非静态成员内部类对象：
        MemberInner t = new MemberInner();
        MemberInner.D d = t.new D();
    }
}