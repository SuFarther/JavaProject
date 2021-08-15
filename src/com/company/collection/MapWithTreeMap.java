package com.company.collection;

import java.util.Map;
import java.util.TreeMap;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MapWithTreeMap
 * @company 公司
 * @Description TreeMap
 *
 * Hashtable JDk1.0 效率低 线程安全 key不可以存放null值
 * HashMap  JDK1.2 效率搞 线程不安全 key可以存放null值,并且唯一的Null值也是唯一的
 *
 * LinkedHashMap实现类
 * 底层: 哈希表+链表
 * 特点: 唯一、有序: 按照输入顺序进行输出
 *
 * Map接口下的TreeMap实现类
 * 特点: 唯一,有序(按照升序或者降序)
 * 原理: 二叉树 key遵照二叉树的特点
 * 放入集合key数据对应的类型内部一定要是要实现,比较器(内部比较器，外部比较器二选一)
 * @createTime 2021年08月15日 21:35:35
 */
public class MapWithTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("alili",18);
        map.put("glili",18);
        map.put("clili",18);
        map.put("alili",18);
        map.put("dlili",18);
        System.out.println(map.size());
        System.out.println(map);
    }
}
