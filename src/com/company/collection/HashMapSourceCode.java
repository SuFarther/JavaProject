package com.company.collection;

import java.util.HashMap;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName HashMapSourceCode
 * @company 公司
 * @Description HashMap源码分析
 * 1、HashMap的K,V值,在创建对象时候确定：K:Integer V:String
 * public class HashMap<K,V> extends AbstractMap<K,V>
 *     implements Map<K,V>, Cloneable, Serializable {}
 *   HashMap的父类AbstractMap已经实现map接口，但是源码中单独实现类Map接口
 *   //重要属性:
 *   默认初始容量 - 必须是 2 的幂。 定义类一个16,一定要赋值给数组长度 ----》》 static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
 *   最大容量，在两个带参数的构造函数隐式指定更高值时使用。 必须是 2 的幂 <= 1<<30。 -----》 static final int MAXIMUM_CAPACITY = 1 << 30;
 *   在构造函数中未指定时使用的负载因子。  -----》 static final float DEFAULT_LOAD_FACTOR = 0.75f;
 *   表，在第一次使用时初始化，并根据需要调整大小。 分配时，长度始终是 2 的幂。 （我们还在某些操作中容忍长度为零，以允许当前不需要的引导机制。） ----》   transient Node<K,V>[] table;
 *
 *   transient Node<K,V>[] table;
 *   实现了Entry transient Entry<K,V>[] table; ----》底层主数组
 *
 *   transient int size;  添加元素的数量
 *   int threshold;  定义个变量，没赋值默认是0 ===》这个是用来表示数组的扩容的边界值
 *   final float loadFactory  这个变量是用来接收装载因子 加载因子负载因子
 *
 *   构造一个具有指定初始容量和负载因子的空HashMap 。
 *  参数：
 *  initialCapacity – 初始容量
 *  loadFactor – 负载因子
 *  抛出：
 *  IllegalArgumentException – 如果初始容量为负或负载因子为非正
 *  源码：
 *   public HashMap(int initialCapacity, float loadFactor) {
 *         if (initialCapacity < 0)
 *             throw new IllegalArgumentException("Illegal initial capacity: " +
 *                                                initialCapacity);
 *         if (initialCapacity > MAXIMUM_CAPACITY)
 *             initialCapacity = MAXIMUM_CAPACITY;
 *         if (loadFactor <= 0 || Float.isNaN(loadFactor))
 *             throw new IllegalArgumentException("Illegal load factor: " +
 *                                                loadFactor);
 *         this.loadFactor = loadFactor;
 *         this.threshold = tableSizeFor(initialCapacity);
 *     }
 *
 *
 *   ------------------------------------------
 *   HashMap构造器
 *   构造一个具有指定初始容量和默认负载因子 (0.75) 的空HashMap 。
 *   参数：
 *    initialCapacity – 初始容量。
 *    抛出：
 *     IllegalArgumentException – 如果初始容量为负
 *
 *   this(16, 0.75);
 *     public HashMap(int initialCapacity) {
 *         this(initialCapacity, DEFAULT_LOAD_FACTOR);
 *     }
 *
 *
 *   HashMap带参构造器,不建议使用者调用这个构造器
 *   public HashMap(int initialCapacity) {
 *    this(initialCapacity, DEFAULT_LOAD_FACTOR);
 *   }
 *
 *   点进this进入
 *     public HashMap(int initialCapacity, float loadFactor) {
 *         if (initialCapacity < 0)
 *             throw new IllegalArgumentException("Illegal initial capacity: " +
 *                                                initialCapacity);
 *         if (initialCapacity > MAXIMUM_CAPACITY)
 *             initialCapacity = MAXIMUM_CAPACITY;
 *         if (loadFactor <= 0 || Float.isNaN(loadFactor))
 *             throw new IllegalArgumentException("Illegal load factor: " +
 *                                                loadFactor);
 *         this.loadFactor = loadFactor;
 *         this.threshold = tableSizeFor(initialCapacity);
 *     }
 *
 *
 *
 *
 * @createTime 2021年08月17日 03:54:54
 */
public class HashMapSourceCode {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        System.out.println(map.put(12,"西瓜皮1"));
        System.out.println(map.put(13,"西瓜皮2"));
        System.out.println(map.put(10,"西瓜皮3"));
        System.out.println(map.put(12,"西瓜皮4"));
        System.out.println(map.put(17,"西瓜皮5"));

        System.out.println("集合中元素：+"+map);
        System.out.println("集合中元素的数量："+map.size());
    }

}
