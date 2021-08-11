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
    }
}

class CollectionErgodicWildcard1Test{
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>());
        System.out.println(new ArrayList<Integer>());
        System.out.println(new ArrayList<Double>());
    }
}
