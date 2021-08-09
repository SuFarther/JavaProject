package com.company.collection;

import java.util.ArrayList;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionGenericTest
 * @company 公司
 * @Description Collection下面的实现类ArrayList实现泛型作用
 * （1）JDK1.5以后
 *  (2) 泛型实际就是一个<>引起来的参数类型,这个参数类型具体在使用的时候才可以确定具体的类型
 *  (3) 使用了泛型以后,可以确定集合中存放的类型,在编译时期,就可以检查出来
 *  (4) 使用泛型你可能觉得麻烦,实际使用了泛型后才会简单,后期的遍历操作简单
 *  (5) 泛型的类型,但是引用数据类型,不是基本数据类型
 *  (6) ArrayList<Integer> al = el ArrayList<Integer>(); 在JDK1.7后ArrayList<Integer> al = el ArrayList<>()；
 * @createTime 2021年08月10日 06:49:49
 */
public class CollectionGenericTest {
    public static void main(String[] args) {
        //加入泛型限制数据的类型
        ArrayList al = new ArrayList();
        al.add(80);
        al.add(30);
        al.add(20);
        al.add("哈哈");
        al.add(9.5);
        for (Object obj : al){
            System.out.println(obj);
        }
        System.out.println("没有使用泛型之前的集合al为 :" +al);

        System.out.println("-------------------------");
//        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(30);
        al2.add(40);
        al2.add(10);
//        al2.add("哈哈"); //报错,不是Integer指定的类型
        for (Integer i:al2){
            System.out.println(i);
        }
        System.out.println("没有使用泛型之前的集合al2为 :" +al2);
    }
}
