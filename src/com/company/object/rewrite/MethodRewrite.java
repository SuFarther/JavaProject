package com.company.object.rewrite;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MethodRewrite
 * @company 公司
 * @Description 方法重写测试类
 * (1)方法的重写: 发生在子类和父类中,当子类对父类提供的方法不满意时候,要对父类的方法进行重写
 *
 * (2)重写有严格的要求:
 *   子类的方法名和父类必须一致,参数列表(个数,类型,顺序)也要和父类的一致
 *
 *
 * 重载和重写不同：
 *   重载:同一个类中,当方法名相同,形参列表不同的时候 多个方法进行重载
 *   重写: 在不同类中,子类对父类提供的方法不满意的时候,要对父类的方法进行重写
 *
 *           英文        位置不同            修饰符                   返回值                     方法名       参数        抛出异常    方法体
 *   重载    overload   同一个类中             无关                    无关                      必须相同    必须不同       无关      不同
 *
 *   重写    override    子类父类中   父类的权限修饰符要低于子类的       父类的返回值类型大于子类      必须相同    必须相同      小于等于   不同
 *
 * @createTime 2021年08月01日 23:09:09
 */
public class MethodRewrite {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        s.eat();
    }
}
