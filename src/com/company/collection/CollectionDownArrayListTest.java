package com.company.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionDownArrayListTest
 * @company 公司
 * @Description Collection接口下的ArrayList实现类
 * Collection接口常用方法:
 * 增加:  add(E e)  	addAll(Collection<? extends E> c)
 * 删除:  clear()  remove(Object o)  removeAll(Collection<?> c) 	removeIf(Predicate<? super E> filter)
 * 修改:
 * 查看:  iterator() size()
 * 判断：contains(Object o)  containsAll(Collection<?> c)  equals(Object o) isEmpty()
 * Collection是接口,接口不能创建对象,有Collection下面的实现类ArrayList来创建对象
 * 集合有一个特点: 只能存放引用数据类型的数据,不能是基本数据数据类型
 * 基本数据类型自动装箱,对应包装类 比如: int Integer
 *
 * Arrays.asList将数组转成list集合
 * 将Arrays.asList转成的集合，Collection下面的allAll方法添加到Collection集合中
 *
 * @createTime 2021年08月08日 14:18:18
 */
public class CollectionDownArrayListTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(18);
        c.add(17);
        c.add(6);
        System.out.println(c);
        List<Integer> list = Arrays.asList(new Integer[]{1, 25, 4, 5, 7});
        c.addAll(list);
        System.out.println(c);


        //删除集合中某个元素
        boolean remove = c.remove(25);
        System.out.println("删除集合中某个元素: "+remove);
        System.out.println(remove);

        //清空c的集合
        c.clear();
        System.out.println("清空的集合c为："+c);
        System.out.println("集合元素的数量为: " +c.size());

        Collection c1 = new ArrayList();
        c1.add(18);
        c1.add(17);
        c1.add(6);


        Collection c2 = new ArrayList();
        c2.add(18);
        c2.add(17);
        c2.add(6);
        //比较的是两个对象的地址
        System.out.println("两个集合对象是否相等:"+(c1==c2));
        System.out.println("两个集合是否相等: "+c1.equals(c2));

        boolean contains = c1.contains(6);
        System.out.println("c1集合中是否包含某个元素: " + contains);
    }
}
