package com.company.exception;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionTryCatchTest
 * @company 公司
 * @Description 异常
 *  catch中异常处理方式
 *     第一种处理: 什么都不写,什么都不做
 *     第二种处理: 输出自定义异常信息
 *     第三种处理: 打印异常信息:
 *     第四种处理: 抛出异常
 * @createTime 2021年08月05日 08:35:35
 */
public class ExceptionCatchTest {
    public static void main(String[] args) {
      try {
          Scanner  s = new Scanner(System.in);
          System.out.print("请录入一个数:");
          int num1 = s.nextInt();
          System.out.print("请录入二个数:");
          int num2 = s.nextInt();
          System.out.print("商:"+num1/num2);
      }catch (Exception e){
          /**显示异常的堆栈信息*/
          e.printStackTrace();
          System.out.println(e);
          System.out.println(e.getMessage());
          throw  e;
      }
        System.out.println("谢谢你使用计算器");
    }
}
