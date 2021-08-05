package com.company.exception;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionThrowAndThrowsTest
 * @company 公司
 * @Description  throw和throws区别 异常
 *
 *  （1） 位置不同
 *  throw: 方法内部
 *  throws: 方法的签名处,方法的声明处
 *
 *  (2) 内容不同:
 *   throw+ 异常对象(检查对象,运行时异常)
 *   throws+异常的类型(可以多个异常，用拼接)
 *
 *   (3)作用不同:
 *   throw: 异常出现的源头,制造异常
 *   throws：在方法的声明处,告诉方法的调用者,这个方法中可能出现我声明的这些异常,然后
 *   调用者对这个异常进行处理,要么自己处理要么再继续向外抛出异常
 *
 * @createTime 2021年08月05日 20:52:52
 */
public class ExceptionThrowAndThrowsTest {
    public static void main(String[] args) throws Exception {
        devide();
    }


    public static  void devide() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("请录入一个数:");
        int num1 = s.nextInt();
        System.out.print("请录入二个数:");
        int num2 = s.nextInt();
        if(num2 == 0){
            //制造运行时异常
//            throw  new RuntimeException();
             //制造检查异常
//              try {
//                  throw new Exception();
//              }catch (Exception e){
//                  e.printStackTrace();
//              }
             //自己往外抛异常
              throw new Exception();
        }else{
            System.out.print("商:"+num1/num2);
        }
    }
}
