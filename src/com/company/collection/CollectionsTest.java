package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionsTest
 * @company 公司
 * @Description Collections工具类
 * Collections不支持创建对象,因为构造器私有化了,里面的1属性都是被static修饰,我们可以直接用类名.调用即可
 * 常用方法:
 *  addAll: 添加集合到另一个结果
 *  binarySearch: 二分法查找(必须在有序集合中查找)
 *  sort: 提供升序排列 -----》排序
 *  copy: 替换: 将后面的集合中的内容替换前面集合重点的内容
 *  fill:填充
 * @createTime 2021年08月17日 23:24:24
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("aaa");
        list.add("bbb");
        Collections.addAll(list,"eee","fff","ggg");
        Collections.addAll(list,new String[]{"ooo","ppp","qqq"});
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"ccc"));


        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"tt","ff");
        Collections.copy(list,list2);
        System.out.println(list);
        System.out.println(list2);


        Collections.fill(list2,"yy");
        System.out.println(list2);

    }
}
