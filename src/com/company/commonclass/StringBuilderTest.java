package com.company.commonclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StringBuilderTest
 * @company 公司
 * @Description String类中的StringBuilder
 * 字符串分类:
 *    (1)： 不可变字符串: String
 *    (2)： 可变字符串: StringBuilder,StringBuffer
 *
 * StringBuilder底层:
 *  char[] value:  value就是StringBuilder底层存储
 *  int value: count就是value数组中被使用的长度
 *
 * @createTime 2021年08月07日 20:36:36
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //表面上调用StringBuilder空构造器,实际底层是对value数组进行初始化,长度为16
        StringBuilder sb = new StringBuilder();
        //表面上调用StringBuilder有参构造器，传入int类型的数,实际底层就是对value数组进行初始化,长度传入你的数字
        StringBuilder sb2 = new StringBuilder("abc");
        //底层是数组的扩容,当数组的长度只要不为空,假设你原始传入3个字符串,那么字符串有19个长度,当长度到达19,发现已经
        //到底了，字符串数组就进行扩容,在append的数后在新增长度，构成新的数组
        //value= Arrays.copyof(value,newCapacity,minimumCapacity)
        System.out.println(sb2.append("asdasdada").append("adasdasd").append("asdasdad").toString());
    }
}
