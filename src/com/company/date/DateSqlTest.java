package com.company.date;

import java.sql.Date;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName DateSqlTest
 * @company 公司
 * @Description 日期对象java.sql.Date
 *
 * java.sql.Date和java.util.Date的区别
 *
 * （1）java.util.Date： 年月日 十分秒
 * java.sql.Date: 年月日
 * （2） java.sql.Date和java.util.Date的联系
 *   java.sql.Date(子类)extends java.util.Date(父类)
 *
 *
 * @createTime 2021年08月06日 08:59:59
 */
public class DateSqlTest {
    public static void main(String[] args) {
        Date d = new Date(1628211654395L);
        System.out.println(d);
        /**
         * util---->sql
         */
        java.util.Date date = new Date(1628211654395L);
        /**
         * 方式1： 向下转型
         * 方式2： 利用构造器
         */
         Date date1 = (Date) date;
         Date date2 = new Date(date.getTime());


        /**
         * sql---->util
         */
         java.util.Date date3 = d;


        /**
         * String----》sql.Date
         */
        Date date4 = Date.valueOf("2021-08-06");
    }
}
