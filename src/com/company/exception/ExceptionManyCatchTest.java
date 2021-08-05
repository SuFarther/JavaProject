package com.company.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionTryCatchTest
 * @company 公司
 * @Description 异常
 * 多重catch
 * 先写子类异常,在写父类异常，在jdk1.7异常并列  InputMismatchException e ｜  ArithmeticException e
 *
 * @createTime 2021年08月05日 08:35:35
 */
public class ExceptionManyCatchTest {
    public static void main(String[] args) {
      try {
          Scanner  s = new Scanner(System.in);
          System.out.print("请录入一个数:");
          int num1 = s.nextInt();
          System.out.print("请录入二个数:");
          int num2 = s.nextInt();
          System.out.print("商:"+num1/num2);
      }catch (InputMismatchException e){
          System.out.println("对不起,你录入的数据不是int类型");
      }catch (ArithmeticException e){
          System.out.println("对不起,除数不为0");
      }catch (Exception e){
          System.out.println("对不起,程序出现异常");
      } finally {
          System.out.println("谢谢你使用计算器");
      }
    }
}
