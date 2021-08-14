package com.company.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionIterable
 * @company 公司
 * @Description Iterator(),iterator,Iterable关系(面试题)
 *            implements                   extends               extends
 * ArrayList实现类------------- List(接口) --------- Collection接口 ----------  Iterable接口
 *  抽象方法            抽象方法要在具体的实现类(ArrayList)中得到实现
 * -------- iterator()--------------------------------------------
 * public Iterator<E> iterator() {
 *         return new Itr();   --------------------------------（iterator()返回值为iterator接口）
 *
 *}
 *   有两个经典方法: hasNext(),next()         抽象方法在哪里做到具体实现呢？在Itr这个类(ArrayList内部类)得到具体的实现
 *---------------------------------->抽象方法-------------------------------------------------------------------->
 * @createTime 2021年08月13日 21:49:49
 */
public class CollectionIterable {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aa");
        al.add("bb");
        al.add("cc");
        al.add("dd");


        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"\t");
        }
    }
}
