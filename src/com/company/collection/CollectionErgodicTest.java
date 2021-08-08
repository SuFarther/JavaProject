package com.company.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicTest
 * @company 公司
 * @Description Collection的循环遍历
 * 有两种方式: 增强for
 * 迭代for
 * @createTime 2021年08月08日 19:12:12
 */
public class CollectionErgodicTest {
    public static void main(String[] args) {
        Collection col  = new ArrayList();
        col.add(123);
        col.add(32);
        col.add(1);
        col.add(31.2);
        col.add("小明");
        System.out.println(col);

        //增强for循环
        for (Object obj: col){
            System.out.print(obj+"\t");
        }
        System.out.println();
        Iterator it = col.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"\t");
        }

    }
}
