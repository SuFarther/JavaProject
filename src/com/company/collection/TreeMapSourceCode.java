package com.company.collection;


import java.util.TreeMap;



/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TreeSetSourceCode
 * @company 公司
 * @Description TreeMapSourceCode底层原理分析
 *
 *
 * public class TreeMap<K,V>{
 *     重要属性
 *     外部比较器:
 *     private final Comparator<? super K> comparator;
 *     数的根节点：
 *     private transient Entry<K,V> root;
 *     集合中元素的数量:
 *     private transient int size = 0;
 *     //空构造器
 *     public TreeMap() {
 *         comparator = null; //如果使用空构造器,那么底层就不使用外部比较器
 *     }
 *
 *    有参构造器
 *    public TreeMap(Comparator<? super K> comparator) {
 *         this.comparator = comparator; //如果使用有参比较器,相当指定外部比较器
 *     }
 *
 *      public V put(K key, V value) { //K,V的类型在创建对象的时候确定了
 *      //如果放入的是第一对元素,那么t的值为null
 *         Entry<K,V> t = root; //在放入第二个节点的时候,root已经是根节点了
 *         //如果放入的是第一个元素的话,走入这个if中
 *         if (t == null) {
 *             //自己跟自己比
 *             compare(key, key);
 *             //根节点确定为ROOT
 *             root = new Entry<>(key, value, null);
 *             size = 1;
 *             modCount++;
 *             return null;
 *         }
 *         int cmp;
 *         Entry<K,V> parent;
 *         // split comparator and comparable paths
 *         //将外部比较器赋给cpr
 *         Comparator<? super K> cpr = comparator;
 *         //cpr不等于null,意味着你刚才创建对象的时候调用了有参构造器,指定了外部比较器
 *         if (cpr != null) {
 *             do {
 *                 parent = t;
 *                 cmp = cpr.compare(key, t.key);  // 将元素的key值做比较
 *                 //cmp返回的值就是int类型的数据:
 *                 //要是这个值 << 0  =0  >> 0
 *                 if (cmp < 0)
 *                     t = t.left;
 *                 else if (cmp > 0)
 *                     t = t.right;
 *                 else
 *                 //如果key的值一样,那么新的value替换老的value,但是key不变,因为key是唯一的
 *                     return t.setValue(value);
 *             } while (t != null);
 *         }
 *         //cpr等于null,意味着你刚才创建对象的时候调用了空构造器,没有指定了外部比较器，使用内部比较器
 *         else {
 *             if (key == null)
 *                 throw new NullPointerException();
 *             @SuppressWarnings("unchecked")
 *                 Comparable<? super K> k = (Comparable<? super K>) key;
 *             do {
 *                 parent = t;
 *                 cmp = k.compareTo(t.key);  // 将元素的key值做比较
 *                 if (cmp < 0)
 *                     t = t.left;
 *                 else if (cmp > 0)
 *                     t = t.right;
 *                 else
 *                     return t.setValue(value);
 *             } while (t != null);
 *         }
 *         Entry<K,V> e = new Entry<>(key, value, parent);
 *         if (cmp < 0)
 *             parent.left = e;
 *         else
 *             parent.right = e;
 *         fixAfterInsertion(e);
 *         size++;
 *         modCount++;
 *         return null;
 *     }
 * }
 *
 * static final class Entry<K,V> implements Map.Entry<K,V> {
 *         K key;
 *         V value;
 *         Entry<K,V> left;
 *         Entry<K,V> right;
 *         Entry<K,V> parent;
 *         boolean color = BLACK;
 *}
 *
 *
 * TreeSet底层源码:
 *  public class TreeSet<E> extends AbstractSet<E>
 *     implements NavigableSet<E>, Cloneable, java.io.Serializable{
 *     //重要属性：
 *     private transient NavigableMap<E,Object> m;
 *
 *       //在调用空构造器的时候,底层创建一个TreeMap
 *        public TreeSet() {
 *            this(new TreeMap<E,Object>());
 *         }
 *
 *
 *        TreeSet(NavigableMap<E,Object> m) {
 *            this.m = m;
 *         }
 *
 *
 *         public boolean add(E e) {
 *            return m.put(e, PRESENT)==null;
 *         }
 *     }
 * @createTime 2021年08月17日 22:40:40
 */
public class TreeMapSourceCode {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        System.out.println(map.put(18,"lili"));
        map.put(3,"lili");
        map.put(12,"lili");
        System.out.println(map.put(18,"lili2"));
        map.put(7,"lili");
        System.out.println(map.size());
        System.out.println(map);
    }
}
