package com.company.exception;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionTryCatchTest
 * @company 公司
 * @Description 异常
 * 原理：
 *   把可能出现的异常代码放入try代码中,然后将异常封装为对象,被catch后面的()那个异常异常对象接收,接收以后:执行catch后面{}里面
 *   的代码,然后try-catch后面的代码,该怎么执行就怎么执行
 *
 *   (1)try中没有异常,catch中代码不执行
 *   (2)try中没有异常,catch进行捕获
 *   如果catch异常类型和你出的异常类型匹配的话,走catch中的代码---》进行捕获
 *   如果catch异常类型和你出的异常类型不匹配的话,不走catch中的代码---》没有捕获成功,程序相当于遇到异常,中断了,后续代码不执行
 *
 *   (1)try如果出现异常,然后用catch捕获成功的话,那么try中后续的代码是不会执行的
 *   (2)如果catch捕获异常成功,那么try-catch后面的代码该执行还是执行没有影响
 * @createTime 2021年08月05日 08:35:35
 */
public class ExceptionTryCatchTest {
    public static void main(String[] args) {
      try {
          Scanner  s = new Scanner(System.in);
          System.out.print("请录入一个数:");
          int num1 = s.nextInt();
          System.out.print("请录入二个数:");
          int num2 = s.nextInt();
          System.out.print("商:"+num1/num2);
      }catch (Exception e){
          System.out.println("对不起,程序出现异常!");
      }
        System.out.println("谢谢你使用计算器");
    }
}
