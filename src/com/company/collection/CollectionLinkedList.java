package com.company.collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionLinkedList
 * @company 公司
 * @Description LinkedList实现类的使用
 * LinedList实现类的常用方法
 * 增加  addFirst(E e)  addLast(E e)  	offerFirst(E e)  	offerLast(E e)
 * 删除  pollFirst()  	pollLast() poll() removeFirst() removeLast()
 * 修改
 * 查询  element()  getFirst() getLast()  indexOf(Object o)  lastIndexOf(Object o)  	peekFirst() 	peekLast()
 * 判断   contains(Object o)
 * @createTime 2021年08月12日 00:29:29
 */
public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("bbbbb");
        //LinkedList可以添加重复的数据
        list.addFirst("1");
        list.addLast("2");
        list.offer("3");
        list.offerFirst("4");
        list.offerLast("5");

        //删除
        list.pollFirst();
        list.pollLast();
        list.poll();
        list.removeFirst();
        list.removeLast();

        //查询
        list.element();
        list.getFirst();
        list.getLast();
        list.indexOf("bbbbb");
        list.lastIndexOf("ccccc");
        list.peekFirst();
        list.peekLast();

        if (list.contains("aaaaa")) {
            System.out.println("你是对的");
        } else {
            System.out.println("你是错的");
        }

        System.out.println("----------------");

        //LinedList循环遍历
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        //增强for
        for (Object obj : list) {
            System.out.print(obj + "\t");
        }
        System.out.println();
        //循环迭代（先获取迭代器）
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        System.out.println();
        System.out.println(list);
    }
}
