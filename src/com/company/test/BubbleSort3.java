package com.company.test;

import java.util.Arrays;

/**
 * @version 1.0
 * @ClassName BubbleSort3
 * @company 公司
 * @Description 内层循环优化
 * @createTime 2021年08月05日 10:16:16
 */
public class BubbleSort3 {
    public static void main(String[] args) {
        int[] arr = {1,124,53,6,7};
        BubbleSort3.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void BubbleSort(int[] arr){
        int flag = 1;
        int temp;
        for (int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                return;
            }
        }
    }
}
