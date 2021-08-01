package com.company.object.modifier;

/**
 * @version 1.0
 * @ClassName StudentTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月01日 22:32:32
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s = new Student();
        /**
         * private修饰的类,调用的时候不能修饰其他类
         */
//        System.out.println(s.age);
    }
}
