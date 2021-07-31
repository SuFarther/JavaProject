package com.company.object.two;

/**
 * @version 1.0
 * @ClassName ConstructorTest1
 * @company 公司
 * @Description 构造器测试
 * @createTime 2021年07月31日 01:49:49
 */
public class ConstructorLoadTest1 {
    public static void main(String[] args) {
        /**
         * 构造器的重载(方法的重载)：
         *   先理解下重载:
         *     重载是一个类中有多个相同的方法,但是形参的类型 形参的个数 形参的位置不同
         *
         *  构造器的重载:
         *     是重写相同的构造器的方法,形参列表可以自己定义
         *     在有参构造器中进行属性赋值
         *
         *     一旦你自己写构造器,没有写空构造器,系统就不会给你一个空构造器,系统就会给你报错
         *
         *     当形参名字和属性名字重名的时候,就会出现就近原则
         *     this指的是你创建的对象  当前对象
         *
         */
        ConstructoLoad c =  new ConstructoLoad("张三",14);
        ConstructoLoad d =  new ConstructoLoad("张三2",15);
        System.out.println(c.name);
        System.out.println(c.age);
    }
}
