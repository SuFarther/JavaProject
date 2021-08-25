package com.company.annotations;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName JdkAnnotations
 * @company 公司
 * @Description JDK内置注解
 * @Override: 限定重写父类方法,该注解只能用于方法
 * @Deprecated: 用于表示所修饰的元素(类、方法、构造器、属性等)已过时,通常是因为所修饰结构危险或存在更好的选择
 * @SuppressWarnings("unused"): 抑制编译器警告
 * @createTime 2021年08月26日 01:33:33
 */
public class JdkAnnotations {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        new Student().sleep();
        @SuppressWarnings("unused")
        int age = 10;
    }
}


class Person{
    public void eat(){
        System.out.println("我喜欢吃东西");
    }
}

class Student extends  Person{
    @Override
    public void eat() {
        System.out.println("我喜欢吃西瓜");
    }

    @Deprecated
    public void sleep(){
        System.out.println("我喜欢睡觉");
    }
}