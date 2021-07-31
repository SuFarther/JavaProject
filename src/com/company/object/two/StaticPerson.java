package com.company.object.two;

/**
 * @author zairensuyi
 * @version 1.0
 * @ClassName StaticPerson1
 * @company 公司
 * @Description static静态类
 *
 * static可以修饰: 属性,方法，代码快,内部类
 * static可以修饰: 属性,方法，代码快,内部类
 * static修饰类
 *
 * static内存分析
 *   栈中存局部变量、形参
 *   堆: 对象,数组
 *   方法区(字节码信息,字符串常量池)、静态域
 *
 *   类在执行过程中,StaticPerson会首先加载字节码对象(StaticPerson.class)这部分方法放到
 *   方法区
 *
 *   静态域中的静态内容先于对象存在这个静态内容被所有该类的对象共享
 *   静态域中相同的属性会被属性的最终值给覆盖
 *
 *   static在类的加载时只会加载一次
 *
 *   一般官方做法 类名.属性名访问
 *
 * @createTime 2021年07月31日 22:19:19
 */
public class StaticPerson {

    int  id;
    static int sid;

    public static void main(String[] args) {
       StaticPerson s1 = new StaticPerson();
       s1.id = 10;
       sid = 10;

        StaticPerson s2 = new StaticPerson();
        s2.id = 20;
        sid = 20;


        System.out.println(s1.id);
        System.out.println(sid);
        System.out.println(StaticPerson.sid);

        System.out.println(s2.id);
        System.out.println(StaticPerson.sid);

    }
}


