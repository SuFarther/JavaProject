package com.company.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicWildcard1
 * @company 公司
 * @Description 自定义泛型结构-通配符
 * @createTime 2021年08月11日 23:51:51
 */
public class CollectionErgodicWildcard1 {
    public void a(List<?> list){
        //通配符里面的遍历用object就可以
        for (Object object:list) {
            System.out.println(object);
        }

        //2.数据的写入操作:
        //list.add("abc"); ---->出错，不能随意的添加数据
        list.add(null);

        //3.数据的读取操作：
        Object o = list.get(0);
    }
}

class CollectionErgodicWildcard1Test{
    public static void main(String[] args) {
        CollectionErgodicWildcard1 c1 = new CollectionErgodicWildcard1();
        c1.a(new ArrayList<String>());
        c1.a(new ArrayList<Integer>());
        c1.a(new ArrayList<Double>());
    }
}
