package com.company.test;

import java.util.Arrays;

/**
 * @version 1.0
 * @ClassName BubbleSort1
 * @company 公司
 * @Description 冒泡排序
 * @createTime 2021年08月05日 09:53:53
 */
public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,54,89,10};
        BubbleSort1.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr){
        //定义一个临时变量
        int temp;
        for (int i = 0; i < arr.length -1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
