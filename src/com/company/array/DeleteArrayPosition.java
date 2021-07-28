package com.company.array;

import java.util.Arrays;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-9:22 下午
 * 功能: 给定一个数组,删除下标为2元素
 */
public class DeleteArrayPosition {
    public static void main(String[] args) {
         int[] arr = {1,3,7,23,12,8,10};

        System.out.println("删除前的元素为:"+Arrays.toString(arr));

        /**
         * 进行删除操作
         * 数字类型表示
         *  数组移位:
         *     arr[2] = arr[3];
         *     arr[3] = arr[4];
         *     arr[4] = 0;
         *  优化写法
         *     for(int i = 2; i <= 4; i ++){
         *       arr[i] = arr[i+1];
         *    }
         *  在优化写法如下:
         */

        int  index = 2;
        for(int i= index; i <= arr.length-2; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

        System.out.println("删除后的元素为:"+Arrays.toString(arr));
    }
}
