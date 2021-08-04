package com.company.object.object2;

/**
 * @author 水果披萨
 * @version 1.0
 * @ClassName fruitPizza
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月04日 21:37:37
 */
public class FruitsPizza extends Pizza{
    //配料
    private  String burdening;

    public FruitsPizza() {
    }

    public FruitsPizza(String burdening) {
        this.burdening = burdening;
    }

    public FruitsPizza(String name, int size, Double price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果配料:"+burdening;
    }
}
