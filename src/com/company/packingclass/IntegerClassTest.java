package com.company.packingclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName IntegerClassTest
 * @company 公司
 * @Description 包装类
 * 包装类引入 将基本数据类型,它就是一个数加点属性,加点方法,加点构造器,对数据进行封装,叫包装类
 * 基本数据类型       引用数据类型            继承关系
 * byte                 Byte                -----》number---->Object
 * short                Short                -----》number---->Object
 * int                  Integer             -----》number---->Object
 * long                 Long                -----》number---->Object
 * float                Float               -----》number---->Object
 * double               Double              -----》number---->Object
 * char                 Character           Object
 * boolean              Boolean             Object
 * @createTime 2021年08月06日 05:50:50
 */
public class IntegerClassTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //物极必反
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE-1);
    }
}
