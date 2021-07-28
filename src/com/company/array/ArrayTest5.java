package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-3:57 下午
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        //提取方法的最大值
        int[]  arr = {12,3,7,4,8,125,9,45};
        System.out.println("这个方法的最大值为:"+ getMaxNum(arr));
    }

    /**
     * 提取方法的最大值,形参里面的个数为int类型,返回类型为最大值
     */
    public static  int getMaxNum(int[] arr){
        //定义一个最大值
        int maxNum =  arr[0];
        for (int i= 0; i < arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return  maxNum;
    }
}
