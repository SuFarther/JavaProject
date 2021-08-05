package com.company.test;

/**
 * @version 1.0
 * @ClassName Array1
 * @company 公司
 * @Description 将一个给定的整型数组输出
 * @createTime 2021年08月05日 08:57:57
 */
public class Array1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i = arr.length -1 ; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
