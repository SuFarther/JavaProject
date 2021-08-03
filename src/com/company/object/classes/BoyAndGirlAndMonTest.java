package com.company.object.classes;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BoyAndGirlAndMonTest
 * @company 公司
 * @Description 测试类
 * 面向对象-类和类之间的关系
 *  (1) 面向对象思维： 找参与者,找女孩类,找男孩类
 *  (2) 什么叫形参和实参
 *  (3) 类和类形成产生类 将一个类做为另外一个类的形参
 *  (4) 将一个类作为另一个类的属性
 *
 *
 * @createTime 2021年08月03日 14:49:49
 */
public class BoyAndGirlAndMonTest {
    public static void main(String[] args) {
        Boy  b = new Boy("鹿晗",30);
        Girl g = new Girl("关晓彤",172.00);
        g.love(b);
//        g.mon = new Mon();
        g.wechat();
    }
}
