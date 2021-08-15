package com.company.collection;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ComparatorTest
 * @company 公司
 * @Description 比较器
 * 比较器思路: 将比较数据做差,返回返回一个int类型的数据,将这个int类型的数值 按照0 > 0 < 0;
 * @createTime 2021年08月15日 13:47:47
 */
public class ComparatorTest {
    public static void main(String[] args) {
        //数值比较
        int  s1 = 10;
        int  s2 = 20;
        System.out.println(s1-s2);


        //字符串类型比较 String类实现Comparable<String>接口 点进"Comparable" 进入public interface Comparable<T>    String重写这个类的方法  public int compareTo(T o);
        String s3 = "A";
        String s4 = "B";
        System.out.println(s3.compareTo(s4));


        //实现包装类型,下面实现Comparable<Double>接口 点进"Comparable" 进入public interface Comparable<T>  Double重写类这个方法  public int compareTo(T o);
        double s5  = 10.7;
        double s6  = 7.2;
        System.out.println(((Double) s5).compareTo((Double) s6));
    }
}
