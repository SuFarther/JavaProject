package com.company.collection;

import java.util.TreeSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TreeSetString
 * @company 公司
 * @Description TreeSet类型
 * @createTime 2021年08月15日 15:39:39
 */
public class TreeSetString {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("alili");
        t.add("glili");
        t.add("elili");
        t.add("flili");
        t.add("alili");
        t.add("dlili");
        System.out.println(t.size());
        System.out.println(t);
    }
}
