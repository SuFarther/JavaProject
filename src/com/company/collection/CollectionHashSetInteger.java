package com.company.collection;

import java.util.HashSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionHashSetInteger
 * @company 公司
 * @Description Hashset唯一无序的
 * @createTime 2021年08月14日 23:24:24
 */
public class CollectionHashSetInteger {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(19);
        hs.add(30);
        hs.add(13);
        hs.add(19);
        hs.add(2);
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
