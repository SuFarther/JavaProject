package com.company.object.one;

/**
 * @version 1.0
 * @ClassName TestOOP1
 * @company 公司
 * @Description 面向对象 属性和方法
 * @createTime 2021年07月30日 22:02:02
 */
public class Person {
    /**
     * @title 
     * @description  name(名字),age(年龄),height(身高),weight(体重)
     * 成员变量都是定义在类中,方法外的
     * 局部变量都是定义在方法中,且必须赋值
     * 这4个变量都是属性
     * @author admin 
     * @updateTime 2021/7/30 10:04 下午 
     * @throws 
     */
    String name;
    int  age;
    double  height;
    double  weight;

    /**
     * 吃饭的方法,行为
     */
     public void eat(){
         /**
          * 局部变量
          */
         int num = 10;
         System.out.println("我们喜欢吃饭");
     }

     public void sleep(String address){
         System.out.println("我在"+address+"睡觉");
     }


     public String introduce(){
         return "我的名字是:"+name+"\n我的年龄是:"+age+"\n我的身高是:"+height+"\n我的体重是:"+weight;
     }
}
