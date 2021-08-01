package com.company.object.three;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Encapsulation
 * @company 公司
 * @Description 封装
 * 封装是指把某些属性隐藏起来,不被外界访问,但是要提供一个公共方法给外界访问才可以
 * 高内聚: 类的内部数据操作细节自己完成的,不允许外部干涉
 * 低耦合: 仅对外部暴露少量方法自己访问
 * @createTime 2021年08月01日 13:23:23
 */
public class Encapsulation {

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        /**
         * 不加this的话,这个age指的是局部变量的age,也就是setAge(int age)
         * 加了this指的是当前对象
         */
        if (age >= 30) {
           this.age = 18;
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setAge(31);
        System.out.println(e.getAge());
    }
}
