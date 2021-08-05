package com.company.exception;

/**
 * @author 方法重载
 * @version 1.0
 * @ClassName ExceptionPerson
 * @company 公司
 * @Description 方法的重写(存在子类和父类),子类不满足父类的方法,故方法重载
 *
 * 只要在父类定义了异常,子类就会收到异常
 * 子类的异常  子类<=异常
 *
 * @createTime 2021年08月05日 21:28:28
 */
public class ExceptionPerson {
    public void eat(){
        System.out.println("吃吃吃");
        //抛出一个自己定义定义的异常
//        throw  new RuntimeException();
        //抛出检查时异常
        try {
            throw  new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ExceptionStudent extends ExceptionPerson{
    @Override
    public void eat() {
        //自定义一个异常
        super.eat();
    }
}

class ExceptionTest2{
    public static void main(String[] args) {
        ExceptionStudent s = new ExceptionStudent();
        s.eat();
    }
}