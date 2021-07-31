package com.company.object.two;

/**
 * @version 1.0
 * @ClassName ConstructorTest1
 * @company 公司
 * @Description 构造器
 * @createTime 2021年07月31日 01:49:49
 */
public class ConstructorTest1 {
    public static void main(String[] args) {
        /**
         * new  关键字实际上是调用一个方法,这个方法就叫做构造方法(构造器)
         * 调用构造方法,如果类中没有这个构造器,系统会默认给你分配一个构造器,只是我们看不到罢了
         * 系统在类的初始化,new调用的构造方法默认是有参构造方法
         *
         * 如果自己造一个构造器,系统默认使用我们自己的,例子如下:
         * 情况1：如果自己写了一个有参构造器,没有写系统的无参构造器,系统默认用我们自己的构造器
         * 情况2: 有无参构造器,有参构造器,new 构造器()可以有参也可以无参
         *
         * 构造器格式:
         * [修饰符] 修饰器的名字(){
         *
         * }
         *
         * 1、构造器和方法的区别:
         *   1、没有方法的返回值类型
         *   2、方法体内部不能有return语句
         *   3、构造器的名字很特殊,必须跟类名一样
         *
         *  构造器作用: 不是为了创建对象，因为在调用构造器的时候,这个对象就已经创建好了,并且属性有默认的初始值
         *  调用构造器的目的是给属性进行赋值操作
         *
         *  注意: 我们一般不回在空构造器中进行初始化,因为那样的每个对象的属性都一样
         *  实际上,我们只要保证空构造器的方法存在就可以了,其他都不用写
         */
        Constructor c =  new Constructor();
        System.out.println(c.name="张三");
        System.out.println(c.age=14);
    }
}
