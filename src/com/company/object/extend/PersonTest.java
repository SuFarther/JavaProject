package com.company.object.extend;

/**
 * @author   苏东坡
 * @version 1.0
 * @ClassName PersonTest
 * @company 公司
 * @Description PersonTest（人类的Person测试类）
 *
 * Person是父类,我们创建2个人类,分别是学生,教师,因为学生类和教师类是子类
 * 所以学生类和教师类可以拥有父类的所有属性和方法
 *  子类要想拥有父类的东西,就必须在类中继承父类，如果继承了子类就可以拥有父类中的属性和方法
 *  比如:
 *      public class 子类 extends 父类{
 *
 *      }
 *  继承的好处是:
 *  1、提高代码的服用行,父类定义内容,子类可以直接拿来使用
 *  2、多台的前提
 *
 *  (3)父类private的内容子类也会继承过来
 *  (4)一个父类可以有多个子类
 *  (5)一个子类只能有一个父类
 *  (6) 继承有传递性
 *      Student(子类)  ----》继承 Person(父类) ----》继承自 Object
 *   Object是所有类的基类,所有子类间接调用object
 *
 * @createTime 2021年08月01日 14:45:45
 */
public class PersonTest {
    public static void main(String[] args) {
        //人类
        Person p = new Person();
        System.out.println("人类的属性有:姓名:"+p.getName()+",年龄:"+p.getAge()+",身高:"+p.getHeight());
        System.out.println("人类有哪些行为呢:");
        p.eat();
        p.sleep();

        System.out.println("----------------------------------------");

        //新建一个学生类 子类拥有父类的属性
        Student s = new Student();
        //调用父类中的属性
        s.setName("学生");
        s.setAge(21);
        s.setHeight(190.00);
        //调用自己的属性
        s.setStuno(2021012);
        //调用父类的方法
        System.out.println("子类Student拥有父类中的属性,姓名为:"+s.getName()+",年龄："+s.getAge()+
                ",身高:"+s.getHeight()+",学号:"+s.getStuno());
        //调用父类的方法
        System.out.print("子类student调用父类的方法:");
        s.eat();
        System.out.print("子类student调用父类的方法:");
        s.sleep();
        System.out.print("子类自己的方法:");
        s.study();

        System.out.println("----------------------------------------");

        //新建一个教师类 子类拥有父类的属性
        Teacher t = new Teacher();
        //调用父类中的属性
        t.setName("教师");
        t.setAge(33);
        t.setHeight(173);
        //调用自己的属性
        t.setTeano(19970345);
        //调用父类的方法
        System.out.println("子类Teacher拥有父类中的属性,姓名为:"+t.getName()+",年龄："+t.getAge()+
                ",身高:"+t.getHeight()+",教师编号:"+t.getTeano());
        //调用父类的方法
        System.out.print("子类Teacher调用父类的方法:");
        t.eat();
        System.out.print("子类Teacher调用父类的方法:");
        t.sleep();
        System.out.print("子类自己的方法:");
        t.teach();

    }
}
