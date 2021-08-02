package com.company.object.super2;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description 子类
 * @createTime 2021年08月02日 08:28:28
 */
public class Student extends Person{
    double score;

    public Student() {
        super();
    }

//    public Student(double score){
//        super();
//        this.score = score;
//    }

//
    public Student(String name, int age, double score){
        /**
         * 父类的属性 this.name = name; this.name指的是Person类中的name,后面的name指的是Student中的name
         * 子类引用父类的对象可以用super.属性名调用
         * 调用父类的构造器
         *
         * 如果构造器已经显示调用super父类构造器,那么它的第一行就没有默认分配的super();
         *
         * 在构造器中,super调用父类的构造器和this调用子类的构造器只能存在一个,两者不能共存;
         * 因为super修饰构造器要放在第一行,this修饰构造器也要放到第一行
         *  super(age,name);
         *  this(score);
         */
//        this.name = name;
//        this.age = age;
//        super.name = name;
//        super.age = age;

        super(name,age);
        this.score = score;
    }


}
