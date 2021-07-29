package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-29-11:24 下午
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        //二维数组的遍历
        int[][] arr = {{1, 2, 3}, {4, 6}, {7}};


        /**
         * 外层普通for循环+内层普通for循环
         */
//        for (int i = 0; i < arr.length;i++){
//            for (int j = 0; j < arr[i].length; j ++){
//                System.out.print(arr[i][j]+"\t");
//            }
//        }

        /**
         * 外层普通for循环+内层增强for循环
         */
//        for (int i = 0; i < arr.length; i++) {
//            for (int num : arr[i]) {
//                System.out.print(num + "\t");
//            }
//        }


        /**
         * 外层增强for循环+内层增强for循环
         */
//        for (int[] a : arr){
//            for (int num : a){
//                System.out.print(num+"\t");
//            }
//        }

        /**
         * 外层增强for循环+内层普通for循环
         */
//        for (int[] a : arr){
//            for (int i = 0; i < a.length;i++){
//                System.out.print(arr[i]+"\t");
//            }
//        }

    }
}
