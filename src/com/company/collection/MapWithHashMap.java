package com.company.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MapWithHashMap
 * @company 公司
 * @Description Map里面常见的方法
 * Map接口是无序唯一的
 * 增加   put(K key, V value)
 * 删除  clear() 	remove(Object key)
 * 判断   equals(Object o)  isEmpty()	containsKey(Object key) containsValue(Object value)
 * 查看   entrySet()  size()  entrySet() 	get(Object key)  values() keySet()
 *
 * @createTime 2021年08月15日 20:51:51
 */
public class MapWithHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",19);
        map.put("bbb",14);
        map.put("ccc",12);
        map.put("ddd",5);


        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsValue(5));



        Map<String,Integer> map2 = new HashMap<>();
        map2.put("aaa",19);
        map2.put("bbb",14);
        map2.put("ccc",12);
        map2.put("ddd",5);

        System.out.println(map==map2);
        //底层进行了重写比较的是集合的值
        System.out.println(map.equals(map2));
        System.out.println(map.get("aaa"));

        System.out.println(map.isEmpty());
        /**
         * 清空所有集合
         */
//        map.clear();
        System.out.println("-----------");
        /**
         * keySet对集合中所有的key进行遍历
         */
        Set<String> set = map.keySet();
        for (String s:set) {
            System.out.print(s+"\t");
        }
        System.out.println();
        /**
         * values()对集合中的Value进行遍历查看
         */
        Collection<Integer> values = map.values();
        for (Integer i:values) {
            System.out.print(i+"\t");
        }
        /**
         * get(Object key) KeySet()
         */
        System.out.println();
        Set<String> set2 = map.keySet();
        for (String s:set2) {
            System.out.print(map.get(s)+"\t");
        }
        /**
         * entrySet 返回是一对集合数据
         */
        System.out.println();
        Set<Map.Entry<String, Integer>> set3 = map.entrySet();
        for (Map.Entry<String, Integer> e:set3) {
            System.out.println(e.getKey()+"-----------"+e.getValue());
        }
    }
}
