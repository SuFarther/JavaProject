package com.company.object.two;

/**
 * @version 1.0
 * @ClassName ThisPersonTest1
 * @company 公司
 * @Description this测试类的关键字
 * @createTime 2021年07月31日 21:37:37
 */
public class ThisPersonTest1 {
    public static void main(String[] args) {
        ThisPerson  t = new ThisPerson("张三",16);
        System.out.println("姓名:"+t.name+",年龄:"+t.age);
        System.out.println();
        t.eat();
    }
}
