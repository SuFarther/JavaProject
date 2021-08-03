package com.company.object.classes;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Girl
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月03日 14:47:47
 */
public class Girl {
    private  String name;
    private  double weight;
    /**
     * 赋值的话,初始值为null,会报空指针
     */
//    Mon mon;

    /**
     * 直接new一个对象
     */
    Mon mon = new Mon();

    public Girl() {
    }

    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void love(Boy b){
        System.out.println("男朋友的名字为:"+b.getName()+",男朋友的年龄为:"+b.getAge());
        b.buy();
    }

    public void wechat(){
        mon.say();
    }
}
