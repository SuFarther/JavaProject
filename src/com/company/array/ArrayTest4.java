package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-3:39 下午
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        //实现一个功能,给定一个数组int[] arr = {12,3,7,4,8,125,9,45}，求出数组中的最大的数
        int[]  arr = {12,3,7,4,8,125,9,45};

        //定义一个最大值
        int maxNum = arr[0];

        for (int i = 0; i < arr.length;i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println("数组中最大的值为:"+maxNum);
    }
}
