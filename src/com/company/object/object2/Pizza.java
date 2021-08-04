package com.company.object.object2;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Pizza
 * @company 公司
 * @Description 披萨类
 * @createTime 2021年08月04日 21:35:35
 */
public class Pizza {

    /**
     * 名称
     */
    String name;

    /**
     * 大小
     */
    int size;

    /**
     * 价格
     */
    Double price;


    public Pizza() {
    }

    public Pizza(String name, int size, Double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    /**
     * 展示披萨信息
     */
     public String showPizza(){
         return "披萨的名字是:"+name+"\n披萨的大小是:"+size+"寸\n披萨的结果是:"+price+"元";
     }
}
