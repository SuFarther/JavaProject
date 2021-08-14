package com.company.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ListIterator
 * @company 公司
 * @Description ListIterator迭代器
 * 出错原因: 就是迭代器和list同时对集合进行操作
 * 解决方法: 事情让一个人做----》引入新的迭代器：ListIterator() 迭代和添加操作都是靠ListIterator完成
 * @createTime 2021年08月14日 18:05:05
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        //Exception in thread "main" java.util.ConcurrentModificationException
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            if ("cc".equals(it.next())) {
//                list.add("kk");
//            }
//        }
//        System.out.println(list);

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            if("cc".equals(it.next())){
                it.add("kk");
            }
        }
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        //逆向遍历
        while (it.hasPrevious()){
            System.out.print(it.previous()+"\t");
        }
        System.out.println();
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        System.out.println(list);
    }

}
