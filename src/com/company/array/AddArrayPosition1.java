package com.company.array;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-8:45 下午
 * 功能: 给定一个数组,在数组下标为2的位置上添加一个元素91
 */
public class AddArrayPosition1 {
    public static void main(String[] args) {

        //给定一个数组
        int[] arr = {12,20,62,27,39,45};
        //            0  1  2  3  4  5
        System.out.print("输出前的数组: ");
        for (int i= 0; i<arr.length;i++){
              if(i!=arr.length-1){
                  System.out.print(arr[i]+",");
              }else {
                  System.out.print(arr[i]);
              }
        }

        /**
         * 增加元素
         *  arr[5] = arr[4];
         *  arr[4] = arr[3];
         *  arr[3] = arr[2];
         */
       //从键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("\n请录入你要添加元素的下标:");
        int index = sc.nextInt();
        System.out.print("\n请录入你要添加下标的元素:");
        int ele = sc.nextInt();
        addElement(arr,index,ele);

        System.out.print("\n输出后的数组: ");
        for (int i= 0; i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }else {
                System.out.print(arr[i]);
            }
        }
    }

    /**
     * 提取一个添加元素的方法
     * 在数组的制定位置上添加一个指定的元素
     * 在哪个数组的哪个位置添加哪个元素
     * 不确定因素: 形参: 哪个数组,哪个位置,哪个元素
     * 返回值无
     */
    public static  void addElement(int[] arr,int index,int ele){
        for (int i = arr.length-1; i>=(index+1); i--){
            arr[i] = arr[i-1];
        }
        arr[index] = ele;
    }
}
