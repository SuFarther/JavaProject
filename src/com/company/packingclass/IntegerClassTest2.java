package com.company.packingclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName IntegerClassTest2
 * @company 公司
 * @Description int类型左右构造器的参数
 *
 *  转int类型的参数必须是数字
 *
 * @createTime 2021年08月06日 05:58:58
 */
public class IntegerClassTest2 {
    public static void main(String[] args) {
//        Integer i1 = new Integer(12);
//        System.out.println(i1);

        Integer i2 = new Integer("12");
        System.out.println(i2);
    }
}
