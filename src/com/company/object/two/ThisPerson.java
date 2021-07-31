package com.company.object.two;

/**
 * @version 1.0
 * @ClassName ThisPerson
 * @company 公司
 * @Description this关键字
 *
 * （1）this可以修饰属性:
 * 总结： 当属性名字和星灿发生重名的时候,或者属性名字和局部变量重名的时候,都会发生就近原则,所以如果我要是想要直接只用
 * 变量名字的话,就指的是离的近的那个形参或者局部变量,这时候如果我想要表示属性的话，在前面要加上: this修饰
 *  （2）this可以修饰方法:
 *  总结: 在同一个类中,方法可以互相调用,this可以省略不写
 *
 *  this在类中属性名不同名的时候，this修饰属性名可以省略不屑
 *
 *  this可以修饰构造器
 *  总结: 同一个类中的构造器可以相互用this调用,注意：this修饰构造器必须方法在第一行
 *
 * @createTime 2021年07月31日 21:33:33
 */
public class ThisPerson {

    String name;
    int age;


    public ThisPerson(){

    }

    public ThisPerson(String name,int age){
        this(name);
        this.name = name;
        this.age = age;
    }

    public ThisPerson(String name){
        this.name = name;
    }

    public void eat(){
        int age =  10;
        //局部变量就近原则
        System.out.println(age);
        System.out.println(this.age);
        System.out.println("吃饭");
    }

    public void play(){
        eat();
        System.out.println("吃法吗");
    }
}
