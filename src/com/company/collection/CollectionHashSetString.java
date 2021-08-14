package com.company.collection;

import java.util.HashSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionHashSetString
 * @company 公司
 * @Description HashsetString的类型
 * @createTime 2021年08月14日 23:27:27
 */
public class CollectionHashSetString {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("aaaa");
        hs.add("dddd");
        hs.add("cccc");
        hs.add("aaaa");
        hs.add("bbbb");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
