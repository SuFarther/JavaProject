package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-4:12 下午
 * 问题:查询数组中指定元素对应的索引
 * 解题思路:
 *  1、先定义一个数组给定里面的值
 *    int[] arr = {12,18,56,48,19,56};
 *
 *  抽取一个  查询数组中指定元素对应的索引
 *  可以分析 不确定因素: 哪个数组,哪个元素 返回值 索引
 *  1、先循环得出这个循环里面的值 arr[i]是元素  i是索引
 *  对应目标索引定义一个初始值 index接收 ，为什么index=-1是因为数组的索引从0开始,为了查询索引得到的数和初始值的
 *  index冲突故为-1
 *
 *  循环中的i给初始化的值index接收,里面为什么有break;出现break是因为可能数组中的值有重复的,我们用break如果找到第一个值
 *  后面的值就不找了
 */
public class SelectArrayPosition2 {
    public static void main(String[] args) {
        int[] arr = {12,18,56,48,19,56};

        //查询这个数组中的值的索引
        int index = getIndex(arr, 48);
        //判断这个索引
        if(index!=-1){
            System.out.println("元素对应的索引为"+index);
        }else {
            System.out.println("查无此数");
        }
    }

    /**
     * 定义一个方法,查询数组中指定元素对应的索引
     * 不确定因素: 哪个数组 , 哪个元素
     * 返回值: 索引
     */
     public static  int getIndex(int[] arr,int ele){

         //定义一个目标索引的值,接收数组中的i 不能出现索引中的值
         int index = -1;
         //循环遍历这个数组
         for (int i = 0; i< arr.length ; i ++){
             if(arr[i] == ele){
                 index = i;
                 break;
             }
         }
         return index;
     }
}
