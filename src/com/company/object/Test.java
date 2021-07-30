package com.company.object;



/**
 * @version 1.0
 * @ClassName Test
 * @company 公司
 * @Description TODO
 * @createTime 2021年07月30日 22:19:19
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 第一个记载类的时候,会进行类的加载,初始化创建对象的时候,对象的属性没有赋值,有默认的初始值
         * 一个类可以创建多个对象,这里 可以创建两个对象
         */
        Person p = new Person();
        p.name = "张三";
        p.age = 20;
        p.height = 188.4;
        p.weight = 76;
        p.eat();
        p.sleep("教室");
        System.out.println(p.introduce());


        Person t = new Person();
        t.name = "李四";
        t.age = 24;
        t.height = 169;
        t.weight = 90;


        /**
         * 对象存在堆中
         * 类的属性相同,但是对象是不一样的,new Person()比较他们的地址值是不一样的,所以不是同一个对象
         *  Person p = new Person();   0x11
         *  Person t = new Person();    0x00
         */
        if(p == t){
            System.out.println("两个对象是同一个");
        }else {
            System.out.println("两个对象是不同一个");
        }
    }
}
