package com.company.date;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CalendarDemoTest
 * @company 公司
 * @Description Calendar日历类
 * @createTime 2021年08月06日 21:22:22
 */
public class CalendarDemoTest {
    public static void main(String[] args) {
        //录入日期的String:
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想要查看的日期: (提示: 请按照例如2021-5-6)格式书写");
        String strDate = sc.next();
        System.out.println(strDate);
        //String---->Calendar
        //String---->Date:
        java.sql.Date date =  java.sql.Date.valueOf(strDate);
        //Date----->Calendar:
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //后续操作
        //星期提示
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //获取本月最大的天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日
        int nowDay = cal.get(Calendar.DATE);

        //将日期调为本月的1号
        cal.set(Calendar.DATE,1);
        //获取这个1号是本周的第几天(星期几)
        int num = cal.get(Calendar.DAY_OF_WEEK);
        //前面空出来的天数
        int day = num -1;
        //从1号到maxDay遍历
        int count = 0;
        //空出来的日子也要加入计数器
        count = count + day;
        for (int i = 1; i <= day ; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= maxDay; i++) {
            if(i == nowDay){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count % 7 == 0){
                System.out.println();
            }
        }
    }
}
