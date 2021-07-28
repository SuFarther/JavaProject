package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-9:22 下午
 * 功能: 给定一个数组,删除3的元素
 */
public class DeleteArrayPosition2 {
    public static void main(String[] args) {
         int[] arr = {1,3,7,23,12,8,10};

        System.out.println("删除前的元素为:"+Arrays.toString(arr));

        //键盘录入要找的数
        Scanner  sc = new Scanner(System.in);
        System.out.print("请输入即将删除对应索引的值");
        int num = sc.nextInt();

        /**
         * 找到要删除对应索引的值
         */
        int index = -1;
        for (int i= 0; i<arr.length;i++){
            if (arr[i]  == num){
                index = i;
                break;
            }
        }

        if(index != -1){
            for(int i= index; i <= arr.length-2; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
        }else {
            System.out.println("没有找到该元素!");
        }

        System.out.println("删除后的元素为:"+Arrays.toString(arr));
    }
}
