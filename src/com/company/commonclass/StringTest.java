package com.company.commonclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StringTest
 * @company 公司
 * @Description String类的使用
 *   String的本质
 *      （1）String底层是一个char类型的数组
 *      （2）String不能被继承,不能有子类
 *      （3）String是一个被final修饰的char类型的数组,不能被修改？后期可以通过反射改变值
 *      (4)  构造器: 底层是给对象的value数组进行赋值操作
 *
 * @createTime 2021年08月07日 15:38:38
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);

        //构造器创建对象
        String str1 = new String();
        String str2 = new String("abc");
        String str3 = new String(new char[]{'a','b','c'});
        System.out.println(str3);

        //求数组的长度
        String str4 = "abc";
        System.out.println("数组的长度为:"+str4.length());

        //求一个数组是否为空
        String str5 = "";
        System.out.println("判断一个数组是否为空:"+str5.isEmpty());

        //求数组对应的元素索引的值
        String str6 = "abc";
        System.out.println("数组对应的元素索引的值:"+str6.charAt(1));
    }
}
