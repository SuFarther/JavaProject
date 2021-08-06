package com.company.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 苏少奇
 * @version 1.0
 * @ClassName SimpleDateFormatTest
 * @company 公司
 * @Description SimpleDateFormat 日期相关
 *   (1)String ----java.util.Date类型转换
 *   分解:
 *      (1)String----> java.sql.Date
 *      (2)java.sql.Date ------> java.util.Dtae
 *
 *
 *  日期转换 格式化转换
 *  DateFormat是SimpleDateFormat父类,抽象方法不能new，只能由它的子类来实现
 *  String转Date  parse
 *  Date转String  format
 *
 * @createTime 2021年08月06日 09:15:15
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        /**
         * 有局限性  2021-08-06 日期类型是这样的
         */
//        java.sql.Date date = java.sql.Date.valueOf("2021-08-06");
//        java.util.Date date2 = date;
//        System.out.println(date2);



        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = df.parse("2021-04-02 12:03:14");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String date = df.format(new Date());
        System.out.println(date);
    }
}
