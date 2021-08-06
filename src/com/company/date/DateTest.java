package com.company.date;

import java.util.Date;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName DateTest
 * @company 公司
 * @Description 日期相关的util包下的Date
 *
 *  d.toString() 中国的时间
 *  d.toGMTString() 本初子午线的时间,相隔8小时,中国时区
 *  d.toLocaleString()  本地时间
 *  d.getYear()  表示当前的年份-1900
 *  d.getMonth()  当前月份   month – the month value between 0-11
 *  d.getTime()   当前时间- 1970, 00:00:00 GMT  返回毫秒数
 *  currentTimeMillis()  返回毫秒数,long类型
 *
 *  本地方法  这个方法是静态的,可以类名.方法名直接调用
 *  一般去衡量一些算法的时间
 *
 *
 * @createTime 2021年08月06日 08:42:42
 */
public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());
        System.out.println(d.toLocaleString());

        System.out.println(d.getYear());
        System.out.println(d.getMonth()+1);
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
