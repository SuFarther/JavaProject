package com.company.packingclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName AutomaticPackingAndUnpackingClassTest
 * @company 公司
 * @Description 自动装箱和自动拆箱
 *  int ----- Integer 自动装箱
 *  就Integer类说,底层是通过valueOf方法实现自动装箱
 *  Integer ----- int  自动拆箱
 *  底层是通过intValue实现自动拆箱
 * @createTime 2021年08月06日 06:08:08
 */
public class AutomaticPackingAndUnpackingClassTest {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println(i);
        Integer i2 = new Integer(12);
        int num = i2;
        System.out.println(num);
    }
}
