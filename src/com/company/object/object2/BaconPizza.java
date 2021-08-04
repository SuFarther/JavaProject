package com.company.object.object2;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BaconPizza
 * @company 公司
 * @Description 培根披萨
 * @createTime 2021年08月04日 21:36:36
 */
public class BaconPizza extends Pizza{

    private double  weight;

    public BaconPizza(){

    }

    public BaconPizza(double weight) {
        this.weight = weight;
    }

    public BaconPizza(String name, int size, Double price, double weight) {
        super(name, size, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //重写父类的showpizza

    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根的克数："+weight+"克";
    }
}
