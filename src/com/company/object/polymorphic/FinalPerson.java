package com.company.object.polymorphic;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FinalPerson
 * @company 公司
 * @Description final修饰方法
 * final修饰的方法,不可以被类的子类重写
 * final修饰的类,代表该类没有子类,该类不可以被继承,一旦一个类被final修饰,那么里面的方法
 * 也没必要final修饰
 *
 * @createTime 2021年08月04日 06:34:34
 */
final public class FinalPerson {
    //   final public void eat(){
//        System.out.println("吃饭");
//    }
    public void eat() {
        System.out.println("吃饭");
    }

}

//class Student extends FinalPerson {
//    @Override
//    public void eat() {
//        super.eat();
//    }
//}