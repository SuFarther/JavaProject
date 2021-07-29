package com.company.array;

import java.util.Arrays;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-29-2:39 下午
 *
 * 数组复制
 *   src - 源数组
 *   srcPos - 源数组中的起始位置
 *   dest - 目标数组
 *   destPos - 目标数组的起始位置
 *   length - 要复制数组元素的位置
 *
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //给一个源数组
        int[] scrArr= {11,22,33,44,55,66,77,88};

        //给一个目标数组
        int[] destArr = new int[10];

        //复制
        System.arraycopy(scrArr,2,destArr,3,3);
        System.out.println(Arrays.toString(destArr));
    }
}
