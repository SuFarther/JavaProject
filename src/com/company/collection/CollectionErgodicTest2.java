package com.company.collection;

import java.util.ArrayList;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicTest2
 * @company 公司
 * @Description 泛型类注意的细节
 * (1)泛型类可定义多个类型
 * (2)泛型类的构造器方法
 * (3)不同泛型的引用类型不可以相互赋值
 * (4)泛型如果不指定,那么会被擦除,反应对应的类型为Object类型
 * (5) 不能直接使用E创建对象
 * @createTime 2021年08月10日 22:59:59
 */
public class CollectionErgodicTest2<A,B,C>{
    A age;
    B name;
    C sex;

//    public void a(<A a,B b ,C c>){
//
//    }

//    public CollectionErgodicTest2<A,B,C>{
//
//    }

//    public void b(){
//        ArrayList<String> list1 = null;
//        ArrayList<Integer> list2 = null;
//        list1 = list2;
//    }


//    A[] i = new A[10];
//    A[]i = (A[]) new Object[10];
}
