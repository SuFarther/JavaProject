package com.company.exception;

import java.util.Scanner;

/**
 * @author 苏仔仁
 * @version 1.0
 * @ClassName ExceptionTest
 * @company 公司
 * @Description TODO
 * 异常:
 * Exception：在程序的运行过程中,发生类不正常的现象,阻止了程序运行,我们称之为发生异常
 * 用if-else堵漏洞的特点:
 *  （1） 代码臃肿,业务代码和处理异常的代码混在一起
 *   (2) 可读性差
 *   (3) 程序猿需要话费大量经历类维护这个漏洞
 *   (4) 程序员很难堵住所有的漏洞
 * @createTime 2021年08月05日 06:43:43
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            System.out.print("请输入第二个数:");
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                if (num2 == 0) {
                    System.out.println("对不起,除数不能为0");
                } else {
                    System.out.println("他们两个数的商：" + num1 / num2);
                }
            } else {
                System.out.println("对不起,你录入的不是int类型的数据!");
            }
        } else {
            System.out.println("对不起,你录入的不是int类型的数据!");
        }
    }
}
