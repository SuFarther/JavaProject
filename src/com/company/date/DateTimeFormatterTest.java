package com.company.date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName DateTimeFormatterTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月07日 09:39:39
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //格式化类： DateTimeFormatter

        //方式一： 预定义的标准格式:ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE,ISO_LOCAL_TIME
        DateTimeFormatter df1 = DateTimeFormatter.ISO_DATE_TIME;
        //df1就可以帮我们完成LocalDateTime和String之间的相互转换
        //LocalDateTime---->String
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //String转LocalDateTime
        TemporalAccessor parse = df1.parse("2021-08-07T09:50:18.572");
        System.out.println(parse);

        //方式二：本地相关的格式:如ofLocalizedDateTime()
        //参数： FormatStyle.LONG / FormatStyle.MEDIUM/FormatStyle.SHORT
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //LocalDateTime---->String
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);

        //String---->LocalDateTime
        TemporalAccessor parse1 = df2.parse("2021-8-7 9:53:56");
        System.out.println(parse1);

        //方式三:自定义的格式:  如ofPattern("yyyy-MM-dd HH:mm:ss")---重点以后常用
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //LocalDateTime---->String
        LocalDateTime now2 = LocalDateTime.now();
        String str4 = df3.format(now2);
        System.out.println(str4);
        //String---->LocalDateTime
        TemporalAccessor parse2 = df3.parse("2021-08-07 09:58:35");
        System.out.println(parse2);
    }
}
