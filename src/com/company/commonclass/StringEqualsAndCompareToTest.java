package com.company.commonclass;

import java.util.Arrays;
import java.util.Locale;

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
 *
 *
 *
 * @createTime 2021年08月07日 15:58:58
 */
public class StringEqualsAndCompareToTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("String类中的equals: "+str1.equals(str2));

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println("String类中的compareTo: "+str3.compareTo(str4));

        ///截取字符串中的字符串,索引从第几位开始到第几位结束,如果传入的是第一位 [+,+)
        String str5 = "helloworld";
        System.out.println("String类中的substring: "+str5.substring(3,6));
        //startsWith以什么开头,以endsWith什么结尾
        if(str5.startsWith("h") && true&&str5.endsWith("d")){
            System.out.println("startsWith和endsWith");
        }

        //判断某个某个字符串里面是否包含某个字符
        System.out.println("String类的contain用法:"+str5.contains("h"));

        //字符串的拼接
        System.out.println("String类的concat用法:"+str5.concat("ddddd"));

        //字符串的切割成一个数组
        String str7 = "a-b-c-d-g";
        System.out.println("String类的split切割用法:"+ Arrays.toString(str7.split("-")));


        //字符串中的大小写转换
        System.out.println("String类的toUpperCase用法将字母转成大写:"+str5.toUpperCase());
        System.out.println("String类的toLowerCase用法将字母转成小写:"+str5.toUpperCase().toLowerCase());

        //去除首尾空格空格
        String str6 = "   sdsdad ";
        System.out.println("String类的trim去除首尾空格空格:"+str6.trim());


        //字符串的替换
        System.out.println("String类的replace替换方法:"+str5.replace('h','u'));

        //字符串中将String转换为类型
        System.out.println(String.valueOf(false));
    }
}
