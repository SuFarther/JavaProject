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
public class PizzaTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("你选择想要制作的披萨：1、培根披萨 2、水果披萨");
        int choice = s.nextInt();
        //通过工厂获取披萨
        Pizza p = PizzaFactory.getPizza(choice);
        System.out.println(p.showPizza());
    }
}
