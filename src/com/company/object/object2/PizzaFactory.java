package com.company.object.object2;

import java.util.Scanner;

/**
 * @author pizsa工厂
 * @version 1.0
 * @ClassName PizzaFactory
 * @company 公司
 * @Description 生产模式的披萨
 * @createTime 2021年08月04日 22:33:33
 */
public class PizzaFactory {

    public static  Pizza getPizza(int choice){
        Pizza p = null;
        Scanner s = new Scanner(System.in);
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
                p = bp;
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
                p = fp;
            }
            break;
            default:
                System.out.println("没有选择的披萨种类");
        }
        return  p;
    }
}
