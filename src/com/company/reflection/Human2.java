package com.company.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Human2
 * @company 公司
 * @Description 动态代理就是给出一个被代理类,动态生成代理类
 * @createTime 2021年08月27日 14:39:39
 */
public interface Human2 {
    /**
     * 人要有信仰
     * @return
     */
    String belief();

    /**
     * 人要吃饭
     * @param food
     */
    void eat(String food);
}

class SuperMan2 implements  Human2{

    @Override
    public String belief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我想吃:"+food);
    }
}


/**
 * 代理类工厂
 */
class ProxyFactory2{

    /**
     * 提供一个静态的生产代理类对象的方法,obj为被代理的对象
     * @param obj
     */
    public   static  Object getProxyInstance(Object obj){
        MyInvocationHandler2  handler = new MyInvocationHandler2();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler2 implements InvocationHandler {

    /**
     * 传入被代理类的对象
     */
    private Object obj;

    public void bind(Object obj){
        this.obj  = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}

class  ProxyTest2{
    public static void main(String[] args) {
        /**
         * 传入被代理类的对象
         * 多态的一种表现
         * 这里传入的是被代理类对象,我们传入的Human2接口的实现类，也就是superMan2实现类
         */
        Human2 superMan2 = new SuperMan2();
        Human2 human2 = (Human2) ProxyFactory2.getProxyInstance(superMan2);
        System.out.println(human2.belief());
        human2.eat("我想要吃火锅");

        ClothesFactory clothesFactory = new NickClothesFactory();
        //传入被处理类的对象生成的类当作代理类,代理类调用这个方法比较方便
        ClothesFactory clothesFactory2 = (ClothesFactory) ProxyFactory2.getProxyInstance(clothesFactory);
        clothesFactory2.produceClothes();
    }
}