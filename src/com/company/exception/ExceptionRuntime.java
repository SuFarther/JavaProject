package com.company.exception;



/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName RuntimeExcepition
 * @company 公司
 * @Description 运行时异常
 *    异常的结构
 *        Object类
 *          ⬇
 *          Throwable类
 *      ⬇                                     ⬇
 *    Error(错误)                         Exception(异常)
 *                                    ⬇                  ⬇
 *   JVM系统内部错误内存溢出           检查异常              运行时异常(ArrayIndexOutOfBoundsException，NullPointerException)
 *   靠程序本身是无法解决️
 *
 * @createTime 2021年08月05日 20:34:34
 */
public class ExceptionRuntime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = null;
//        System.out.println(arr[10]);
//        System.out.println(arr2[0]);
    }
}
