package com.company.reflection;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ClothesFactory
 * @company 公司
 * @Description 静态代理
 * 静态代理: 代理类和目标的对象类在编译期间确定下来,不利于程序的扩展。每一个代理类只能为一个接口服务。这样一来程序开发必须产生过多的代理功能
 * @createTime 2021年08月27日 13:15:15
 */
public interface ClothesFactory {
    /**
     * 生产衣服方法
     */
    void produceClothes();
}

/**
 * 代理类
 */
class   ProxyClothesFactory implements  ClothesFactory{

    /**
     * 用做被代理类的对象
     */
    private final ClothesFactory clothesFactory;

    public ProxyClothesFactory(ClothesFactory clothesFactory){
        this.clothesFactory = clothesFactory;
    }

    @Override
    public void produceClothes() {
        System.out.println("代理类开始生产衣服");
        clothesFactory.produceClothes();
        System.out.println("代理类结束生产衣服");
    }
}


class NickClothesFactory implements ClothesFactory{

    @Override
    public void produceClothes() {
        System.out.println("生产nick衣服");
    }
}

class ClothesFactoryTest{
    public static void main(String[] args) {
        ClothesFactory nick = new NickClothesFactory();
        ClothesFactory proxy = new ProxyClothesFactory(nick);
        proxy.produceClothes();
    }
}