package com.company.object.super1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Test
 * @company 公司
 * @Description 测试类
 * @createTime 2021年08月02日 05:56:56
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.a();

        System.out.println("------------");

        Dog dog = new Dog();
        System.out.println("调用a方法所得的结果如下:");
        dog.a();
        System.out.println("调用子类dog的age属性,就近原则:");
        System.out.println(dog.age);
        System.out.println("因为子类dog中age,this.age代表当前的dog对象");
        dog.eat();
    }
}
