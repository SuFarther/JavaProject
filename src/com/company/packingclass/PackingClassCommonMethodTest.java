package com.company.packingclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName PackingClassCommonMethodTest
 * @company 公司
 * @Description 包装类的常用方法
 * compareTo: 只返回三个值,要么是0,-1,1    return (x < y) ? -1 : ((x == y) ? 0 : 1);
 * equals:Integer对Object中的equals方法进行了重写,比较的是底层封装那个value的值
 * Integer对象是通过new 子创建的对象
 *
 *  Integer对象通过自动装箱来完成
 *    ValueOf底层:
 *      如果自动装箱范围在-128～127之间,那么比较的具体的值,否则比较对象的地址
 *
 *    intValue：将Integer转换成int类型
 *
 *    parseInt： 将String --int
 *
 *    toString: 将integer转成String类型
 *
 * @createTime 2021年08月06日 08:23:23
 */
public class PackingClassCommonMethodTest {
    public static void main(String[] args) {
          Integer i1 = new Integer(6);
          Integer i2 = new Integer(12);
          System.out.println(i1.compareTo(i2));
          Integer i3 = new Integer(12);
          Integer i4 = new Integer(12);
          //比较两个对象的地址值
//          System.out.println(i3 == i4);
           System.out.println(i3.equals(i4));
           Integer i5 = 130;
           Integer i6 = 130;
           System.out.println(i5.equals(16));
//           System.out.println(i5==i6);

           Integer i7 = 8;
           int i = i7.intValue();
           System.out.println("将Integer类型的值转换成int:"+i);


           int i8 = Integer.parseInt("12");
           System.out.println("将字符串String类型转换成int:"+i8);
    }
}
