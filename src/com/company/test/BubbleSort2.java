package com.company.test;

import java.util.Arrays;

/**
 * @version 1.0
 * @ClassName BubbleSort2
 * @company 公司
 * @Description 外层循环优化
 * @createTime 2021年08月05日 09:58:58
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {1,124,53,6,7};
        BubbleSort2.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void BubbleSort(int[] arr){
        boolean flag = true;
        int temp;
        for (int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
