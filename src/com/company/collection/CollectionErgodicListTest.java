package com.company.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicList
 * @company 公司
 * List接口下的方法:
 * 增加  add(int index, E element)
 * 修改  set(int index, E element)
 * 删除  remove(int index)
 * 查看  get(int index)
 * 判断
 * @Description Collection下的子接口List
 * @createTime 2021年08月08日 19:12:12
 */
public class CollectionErgodicListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(13);
        list.add(26);
        list.add(10);
        list.add(2);
        System.out.println("list集合元素为: "+list);
        list.add(2,12);
        System.out.println("将指定的元素的下标插入元素: " +list);
        list.set(1,24);
        System.out.println("修改指定下标的元素:"+list);
        list.remove(1);
        System.out.println("删除指定的元素的下标"+list);
        System.out.println("查找元素的下标为元素:"+list.get(0));

        //list集合循环遍历
        //list普通for循环遍历
        System.out.println("-----------");
        System.out.println("list普通for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }

        //list增强for循环
        System.out.println();
        System.out.println("list增强for循环");
        for (Object obj:list) {
            System.out.print(obj+"\t");
        }

        System.out.println();
        System.out.println("list迭代器遍历");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"\t");
        }
    }
}
