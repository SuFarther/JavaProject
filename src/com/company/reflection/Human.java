package com.company.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Human
 * @company 公司
 * @Description 动态代理
 * 需要知道被代理类的对象,动态获取代理类的对象
 * @createTime 2021年08月27日 13:47:47
 */
public interface Human {
    /**
     * 信仰
     * @return
     */
    String getBelief();

    /**
     * return eat
     * @param food
     */
    void eat(String food);
}

/**
 * 被代理类对象
 */
class SuperMan implements Human{


    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃的东西: "+food);
    }
}


/**
 * 代理类对象动态生成,实现动态代理,需要解决问题？
 * 问题一： 如何根据加载到内存中的被代理类,动态的创建一个代理类及其对象
 * 问题二： 当通过代理类对象调用方法时，如何动态创建代理类中的同名方法
 */
class ProxyFactory{
    /**
     * 调用此方法，返回一个代理类对象,o为被代理类的对象，Object是代理类的类型
     * @param obj
     * @return
     */
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements  InvocationHandler{
    /**
     * 需要使用被代理对象赋值
     */
    private Object obj;

    public void bind(Object obj){
        this.obj = obj;
    }

    /**
     * 当我们通过代理类对象,调用方法a时,就会自动调用方法如下方法:invoke()
     * 将被代理类要执行方法a的功能声明在invoke()中
     *
     * method：即为调代理类对象调用的方法也就作为被代理类要调用的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}


class ProxyTest{
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human  human = (Human) ProxyFactory.getProxyInstance(superMan);
        System.out.println(human.getBelief());
        human.eat("我喜欢吃火锅");

       NickClothesFactory nickClothesFactory = new NickClothesFactory();
       ClothesFactory clothesFactory = (ClothesFactory) ProxyFactory.getProxyInstance(nickClothesFactory);
       clothesFactory.produceClothes();
    }
}
