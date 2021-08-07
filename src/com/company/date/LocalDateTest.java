package com.company.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName LocalDateTest
 * @company 公司
 * @Description jdk1.8后面的方法
 *
 *   LocalDate  获取日期
 *  LocalTime  获取时间
 *  LocalDateTime  获取日期时间
 * @createTime 2021年08月07日 09:26:26
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate =  LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //of设置指定的日期和时间
        LocalDate of = LocalDate.of(2021, 12, 3);
        LocalTime of1 = LocalTime.of(13, 12, 45);
        LocalDateTime of2 = LocalDateTime.of(2020, 12, 3, 12, 20, 13);
        System.out.println(of);
        System.out.println(of1);
        System.out.println(of2);

        //一系列的常用的get**
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        //不用set方法,用with
        LocalDateTime localDateTime1 = localDateTime.withMonth(8);
        System.out.println(localDateTime1);


        //提供了加减操作
        LocalDateTime localDateTime2 = localDateTime.plusMonths(4);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = localDateTime.minusMonths(5);
        System.out.println(localDateTime3);
    }
}
