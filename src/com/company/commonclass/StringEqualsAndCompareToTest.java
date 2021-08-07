package com.company.commonclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StringEqualsAndCompareToTest
 * @company 公司
 * @Description String下面的equals方法的比对
 *  String下面的两个相同的new 对象比较的是两个对象的值,因为比较地址值没有意义了
 *
 *  String  a = "abc" ;  这句是表示在方法去的常量池取值
 *  (1)当两个对象地址值相同的时候,直接返回的是true
 *  (2)当自己跟自己对比的时候,直接返回的是true
 *
 *
 *  String下面的compareTo方法：
 *  String类实现了Comparable,里面有一个抽象方法叫compareTo,所以String中一定要对这个方法进行重写
 *
 * @createTime 2021年08月07日 15:58:58
 */
public class StringEqualsAndCompareToTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3.compareTo(str4));
    }
}
