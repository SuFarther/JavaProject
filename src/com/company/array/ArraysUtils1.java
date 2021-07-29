package com.company.array;

import java.util.Arrays;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-29-8:54 上午
 */
public class ArraysUtils1 {
    public static void main(String[] args) {
        /**
         * Arrays工具类:
         *   Arrays.toString： 对数组进行遍历查看,返回一个字符串
         *   Arrays.binarySearch: 二分法查看:找出指定数组中的指定元素对应的索引(用这个方法一定得保证这个数组是一个有序数组)
         *   Arrays.sort 数组排序(升序)
         *   Arrays.copyOf: 完成数组的复制
         *   Arrays.copyOfRange: 区间复制【+1,2)
         *   Arrays.equls 比较两个数组是否相等  ==比较两个数或者数组的地址值是否相等
         *   Arrays.fill 数组填充
         */
        int[] arr = {1,3,7,2,4,8};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));


        int[] arr2 = {1,3,7,2,4,8};
        System.out.println(Arrays.toString(Arrays.copyOf(arr2,4)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr2,1,4)));

        int[] arr3 = {1,3,7,2,4,8};
        int[] arr4 = {1,3,7,2,4,8};
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println(arr3==arr4);

        int[] arr5 = {1,3,7,2,4,8};
        Arrays.fill(arr5,10);
        System.out.println(Arrays.toString(arr5));
    }
}
