package com.company.collection;

import java.util.LinkedHashSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionLinkedHashSet
 * @company 公司
 * @Description LinkedHashSet原理: 唯一有序的(按照输入顺序进行输出)
 * 其实就是在Hash基础上,多了一个总的链表，这个总链表将放入的元素串在一起,方便有序的遍历
 * @createTime 2021年08月15日 00:13:13
 */
public class CollectionLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(18);
        hs.add(17);
        hs.add(19);
        hs.add(17);
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
