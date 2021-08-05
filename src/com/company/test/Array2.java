package com.company.test;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

/**
 * @version 1.0
 * @ClassName Array2
 * @company 公司
 * @Description 合并数组
 *
 * @createTime 2021年08月05日 09:01:01
 */
public class Array2 {
    public static void main(String[] args) {
        String[] arr1 = {"1","7","9","11","13","15","17","19"};
        String[] arr2 = {"2","4","6","8","10"};
        String[] arr3 = new String[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println("合并后的数组");
        System.out.println(Arrays.toString(arr3));
    }
}
