package com.company.object.extend;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Person
 * @company 公司
 * @Description 继承 父类
 * @createTime 2021年08月01日 14:39:39
 */
public class Person {
    private String name;
    private int  age;
    private double height;


    public Person(){

    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
