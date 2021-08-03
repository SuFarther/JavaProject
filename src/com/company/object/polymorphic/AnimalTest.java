package com.company.object.polymorphic;

/**
 * @author 动物测试类
 * @version 1.0
 * @ClassName AnimalTest
 * @company 公司
 * @Description 多态
 *
 *
 * 多态：
 *   （1）多态跟属性无关,多态指的是方法的多态,而不是属性的多态
 *    (2) 先有父类,再有子类----》继承  先有子类，再有父类---》泛化
 *    (3) 什么是多态
 *     多态就是多种形态: 同一个行为,不同子类表现出来的形态。多态指的是同一个
 *     方法的调用,然后由于对象不同产生不同的行为
 *    （4）多态好处: 为了提高代码扩展性,符合面向对象的设计原则,开闭原则
 *    开闭原则:指的是扩展是开放的,修改是关闭的,但是扩展性没有达到最好的
 *
 *    注意: 多态可以提高扩展性,但是扩展性没有达到最好,因为还有反射
 *    (5)多态要素：
 *    一：继承
 *    二： 重写: 子类对父类的方法不满意对父类进行重写
 *    三： 父类引用指向子类对象
 *      Animal an = new Cat();
 *      左侧：编译器的类型
 *      右侧：运行期的类型
 *
 *
 * @createTime 2021年08月03日 15:13:13
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal c = new Cat();
        Animal d = new Dog();
        Girl g =  new Girl();
        g.play(c);
        g.play(d);
    }
}
