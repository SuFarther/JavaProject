package com.company.exception;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionTryCatchTest
 * @company 公司
 * @Description 异常
 *  【1】在什么情况下,try-catch后面的代码不执行？
 *   （1）throw抛出异常的信息
 *   （2）catch中没有正常的进行异常捕获
 *    (3) 在try中遇到return
 *
 *   【2】怎么样才可以将try-catch后面的代码 必须执行？
 *   只要将必须执行的代码放入finally中,那么这个代码如何一定执行
 *
 *   [3]return和finally执行顺序？
 *   先执行finally最后执行return
 *
 *   [4]什么代码会在finally中呢？
 *   关闭数据库资源,关闭IO流资源,关闭socket资源
 *
 *   【5】有一句话可以让finally中不执行
 *   System.exit(0); //虚拟机中止资源
 *
 * @createTime 2021年08月05日 08:35:35
 */
public class ExceptionFinallyTest {
    public static void main(String[] args) {
      try {
          Scanner  s = new Scanner(System.in);
          System.out.print("请录入一个数:");
          int num1 = s.nextInt();
          System.out.print("请录入二个数:");
          int num2 = s.nextInt();
          System.out.print("商:"+num1/num2);
          return;
      }catch (Exception e){
        throw  e;
      }finally {
          System.out.println("谢谢你使用计算器");
      }
    }
}
