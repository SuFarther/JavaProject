package com.company.date;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CalendarDemo2Test
 * @company 公司
 * @Description 日期类的练习
 *
 *  1、步骤:
 *    (1)先把String转成Calendar
 *     这步可以拆分为String转成Date
 *     然后将Date转成Calendar
 *
 *    （2）输出字符串带有空格的"日 一 二 三 四 五 六"
 *     (3) 然后获取最大的天数  得到最大的天数在循环遍历出来在一行上
 *     (4) 我们发现一行只有7列,然后我们用计数器来控制
 *     (5) 我们在取得具体的每一个cal.get(Calendar.DATE) 得到现在天数nowDay
 *      我们在循环判断里面判断这个i是否和nowDay相等,相等就是我们想要的天数,则加入*
 *     （6）我们将每个月的天数设置为第一天
 *      (7) 然后我们取得这个第一天的天数是星期几
 *      (8) 然后求出空出来的天数就等于 int day = 然后我们取得这个第一天的天数是星期几 -1
 *      (9) 然后我们发现空出来的天数对应上去了,但是发现格数不对,后面的天数挤掉出来,
 *      我们还要在计数器里面加上空出来的天数 count= count + day
 *
 *
 *
 *
 *
 * @createTime 2021年08月06日 21:53:53
 */
public class CalendarDemo2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入日期,相关的要求如：2018-8-16");
        String strDate = sc.next();

        //String----》Calendar
        //String-----》Date
        java.sql.Date date =  java.sql.Date.valueOf(strDate);
        //Date-----》Calendar
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        //输入一个月的最大天数多少
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //求一个月的第几天
        int nowDay = cal.get(Calendar.DATE);

        //将这个的天数搞为1
        cal.set(Calendar.DATE,1);
        //获取这个月的第一天是星期几
        int num = cal.get(Calendar.DAY_OF_WEEK);
        //前面空出来的天数
        int day = num -1;
        //定义一个计数器
        int count = 0;
        //将空出来的天数循环输出
        for (int i = 1; i <= day; i++) {
            System.out.print("\t");
        }
        //空出来的日子也要加入计数器
        count = count + day;
        for (int i = 1; i <= maxDay ; i++) {
            //如果是这天加*操作
            if(i == nowDay){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            //如果计数器达到7就换行
             if(count % 7 == 0){
                 System.out.println();
             }
        }

    }
}
