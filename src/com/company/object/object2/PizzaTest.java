package com.company.object.object2;

import java.util.Scanner;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName PizzaTest
 * @company 公司
 * @Description 披萨测试类
 * @createTime 2021年08月04日 21:52:52
 */
public class PizzaTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("你选择想要制作的披萨：1、培根披萨 2、水果披萨");
        int choice = s.nextInt();
        switch (choice){
            case 1:
            {
                System.out.println("请录入培根的克数:");
                int weight = s.nextInt();
                System.out.println("请录入培根的大小:");
                int size = s.nextInt();
                System.out.println("请录入培根的价格:");
                double price = s.nextDouble();
                //将录入的信息封装为培根披萨的对象
                BaconPizza bp = new BaconPizza("培根披萨",size,price,weight);
                System.out.println(bp.showPizza());;
            }
            break;
            case  2:
            {
                System.out.println("请录入你想要输入的水果配料:");
                String burdening = s.next();
                System.out.println("请录入培根的大小:");
                int size = s.nextInt();
                System.out.println("请录入培根的价格:");
                double price = s.nextDouble();
                //将录入的信息封装为水果披萨的对象:
                FruitsPizza fp =new FruitsPizza("水果披萨",size,price,burdening);
                System.out.println(fp.showPizza());
            }
            break;
            default:
                System.out.println("没有选择的披萨种类");
        }


    }
}
