package com.company.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicWildcard2
 * @company 公司
 * @Description 自定义泛型结构-通配符
 * @createTime 2021年08月11日 23:55:55
 */
public class CollectionErgodicWildcard2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();

        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;
    }
}
