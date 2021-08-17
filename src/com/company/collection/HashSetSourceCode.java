package com.company.collection;


import java.util.HashSet;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName HashSetSourceCode
 * @company 公司
 * @Description HashSet底层原理
 *     public class HashSet<E>
 *     extends AbstractSet<E>
 *     implements Set<E>, Cloneable, java.io.Serializable{
 *           //重要属性
 *          private transient HashMap<E,Object> map;
 *          private static final Object PRESENT = new Object();
 *
 *          //构造器:
 *         public HashSet() {
 *             map = new HashMap<>(); //HashSet的底层就是利用HashMap来完成
 *         }
 *
 *
 *         public boolean add(E e) {
 *              return map.put(e, PRESENT)==null;
 *         }
 *     }
 *
 * @createTime 2021年08月17日 22:27:27
 */
public class HashSetSourceCode {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        System.out.println(map.add("西瓜皮1"));
        System.out.println(map.add("西瓜皮3"));
        System.out.println(map.add("西瓜皮2"));
        System.out.println(map.add("西瓜皮1"));
        System.out.println(map.add("西瓜皮5"));


        System.out.println("集合中元素：+"+map);
        System.out.println("集合中元素的数量："+map.size());
    }

}
