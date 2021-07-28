package com.company.array;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @company 公司
 * @create 2021-07-28-8:30 上午
 *
 * 方式1：将数组中的每个元素进行查看----》数组的遍历
 * 方式2： 增强for循环:
 * 对scores数组进行遍历:遍历出来每个元素都用int类型的num接收
 * 增强for循环:
 *  优点: 代码简单
 *  缺点: 单纯的增强for循环不能设计跟索引相关的操作
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //键盘录入十个学生的成绩,求和,求平均数
        int[] scores = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);


        for (int i = 1;i<=10;i++){
            System.out.print("请录入第"+i+"个学生的成绩");
            int  score = sc.nextInt();
            //数组的索引从0开始 每个学生对应的成绩
            scores[i-1] += score;
            sum += score;
        }
        System.out.println("十个学生的成绩的和为:"+sum);
        System.out.println("十个学生的成绩的平均数为:"+sum/10);

        //求第6个学生的成绩
        //循环遍历每个学生的成绩
        for(int i = 0; i<=9;i++){
            System.out.println("第"+(i+1)+"学生的成绩为:"+scores[i]);
        }

//        for (int i : scores){
//            System.out.println(i);
//        }
    }
}
