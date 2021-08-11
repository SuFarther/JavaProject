package com.company.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 泛型的受限
 * @version 1.0
 * @ClassName CollectionGenericRestriction
 * @company 公司
 * @Description 泛型受限
 * A和B是子类父类关系,但是G(A)和G(B)不存在继承关系,是并列关系
 * 加入通配符？后G<2>就变成G(A)和G(B)的父类
 *
 * @createTime 2021年08月12日 00:12:12
 */
public class CollectionGenericRestriction {
    public static void main(String[] args) {
        /**
         * a,b,c属于并列关系,并不存在字符类关系
         */
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();


        /**
         * 泛型上限
         *  List<? extends Person>:
         *  就相等于
         *   List<? extends Person> 是List<Person>的父类,是List<Person的子类>的父类
         */
        List<? extends Person> e = null;
//        e = b;
//        e = c;
//        e = a;

        /**
         * 泛型下限
         *  List<? super Person>：
         *  就相等于
         *  List<? super Person> 是List<Person>的父类,是List<Person的父类>的父类
         */
        List<? super Person> s = null;
//        s = a;
//        s = b;
//        s = c;
    }
}


class Person{

}
class Student extends Person{

}

