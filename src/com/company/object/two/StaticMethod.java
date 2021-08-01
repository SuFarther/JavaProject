package com.company.object.two;

/**
 * @author zairensuyi
 * @version 1.0
 * @ClassName StaticMethod
 * @company 公司
 * @Description static修饰方法
 *
 * （1）在静态方法中不能访问非静态的属性
 *  (2) 在静态方法中不能访问非静态方法
 *  (3) static和pubilc都是修饰赋,并列没有先后顺序,谁先写后写都可以
 *  (4) 在静态方法中不能使用this关键字
 *  (5) 非静态方法可以用对象名.方法名调用
 *  (6) 静态方法可以使用 对象名.方法名去调用 也可以用类名.方法名(推荐)
 *
 * @createTime 2021年08月01日 12:22:22
 */
public class StaticMethod {
    int id;
    static int sid;

    public void eat(){
        System.out.println("我喜欢吃饭");
    }
    public static  void sleep(){
        System.out.println("我喜欢睡觉");
    }

    public static void main(String[] args) {
        StaticMethod s = new StaticMethod();
        s.eat();

        StaticMethod.sleep();
    }
}
