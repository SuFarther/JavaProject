package com.company.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Calendar
 * @company 公司
 * @Description 日期类
 *
 * Calendar父类,抽象类,GregorianCalendar为 Calendar实现类
 * @createTime 2021年08月06日 21:05:05
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)+1);

        cal.set(Calendar.YEAR,2018);
        cal.set(Calendar.MONTH+1,6);
        cal.set(Calendar.DATE,3);
        cal.set(Calendar.DAY_OF_WEEK,2);
        System.out.println(cal);
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        System.out.println(cal.getActualMinimum(Calendar.DATE));

        /**
         * String转Calendar
         */
        java.sql.Date date = java.sql.Date.valueOf("2018-08-09");
        cal.setTime(date);
        System.out.println(cal);
    }
}
