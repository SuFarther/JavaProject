package com.company.array;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-29-11:48 下午
 */
public class ThreeArrayTest1 {
    public static void main(String[] args) {
        /**
         * 三维数组的遍历
         *
         */
        int[][][] arr = {{{1, 2, 3}, {4, 5}, {6}}};

        /**
         * 第一层普通for
         * 第二层普通for
         * 第三层普通for
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
            }
            System.out.println();
        }

        /**
         * 第一层普通for
         * 第二层普通for
         * 增强for
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int num : arr[i][j]) {
                    System.out.print(num+"\t");
                }
            }
            System.out.println();
        }

        /**
         * 第一层增强for
         * 第二层增强for
         * 第三层增强for
         */
        for (int[][] a : arr){
            for (int[]  b : a){
                for (int  num : b){
                    System.out.print(num+"\t");
                }
            }
        }
    }
}
