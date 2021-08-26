package com.company.reflection;

import java.lang.reflect.Method;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BeautyGroup
 * @company 公司
 * @Description 通过一个案例感受反射的好处和反射的概念原理
 * 1.反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法。
 *
 * 2.反射可以在一个类运行的时候获取类的信息的机制，可以获取在编译期不可能获得的类的信息。
 *
 * 3.对于任意一个对象，都能调用它的任意一个方法和属性。
 *
 * 4.因为类的信息是保存在Class对象中的，而这个Class对象是在程序运行时被类加载器（ClassLoader）动态加载的。
 *
 * 5.当类加载器装载运行了类后，动态获取Class对象的信息以及动态操作Class对象的属性和方法的功能称为Java语音的反射机制。
 *
 *
 * 作用：
 * 1.反编译：.class —> .java。
 *
 * 2.通过反射机制访问Java对象中的属性、方法、构造方法等。
 *
 * 反射原理
 * Java反射的原理:java类的执行需要经历以下过程
 *
 * 类加载
 *
 * 编译：.java文件编译后生成.class字节码文件
 *
 * 加载：类加载器负责根据一个类的全限定名来读取此类的二进制字节流到JVM内部，并存储在运行时内存区的方法区，然后将其转换为一个与目标类型对应的java.lang.Class对象实例
 *
 * 连接：细分三步
 *
 * 验证：格式（class文件规范） 语义（final类是否有子类） 操作
 *
 * 准备：静态变量赋初值和内存空间，final修饰的内存空间直接赋原值，此处不是用户指定的初值。
 *
 * 解析：符号引用转化为直接引用，分配地址
 *
 * 初始化：有父类先初始化父类，然后初始化自己；将static修饰代码执行一遍，如果是静态变量，则用用户指定值覆盖原有初值；如果是代码块，则执行一遍操作。
 *
 * Java的反射就是利用上面第二步加载到jvm中的.class文件来进行操作的。.class文件中包含java类的所有信息，当你不知道某个类具体信息时，可以使用反射获取class，然后进行各种操作。
 *
 *
 * Java反射就是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性；并且能改变它的属性。
 *
 * 总结说：反射就是把java类中的各种成分映射成一个个的Java对象，并且可以进行操作。
 *
 *
 *
 *
 * @createTime 2021年08月26日 19:35:35
 */
public interface BeautyGroup {
    /**
     * 支付方式的统一方法
     */
    void paymentOnline();
}


/**
 * 微信支付
 */
class Wechat implements BeautyGroup{

    @Override
    public void paymentOnline() {
        System.out.println("我已经点了外卖了,请使用微信支付");
    }
}

/**
 * 支付宝支付
 */
class  AliPay implements BeautyGroup{

    @Override
    public void paymentOnline() {
        System.out.println("我已经点了外卖了,请使用支付宝支付");
    }
}

class  BeautyGroupTest{
    public static void main(String[] args) {
        String str = "支付宝";
        if("微信".equals(str)){
         //构造方法实现   pay(new Wechat());
         pay(new Wechat());
        }
        if("支付宝".equals(str)){
            //构造方法实现  pay(new Wechat());
            pay(new AliPay());
        }
    }
    /**
     * 方法封装一个方法,方法行参是接口,具体传入的接口实现类对象,多态的一种方法，多态确实可以提高代码扩展性,但是要手动删除
     */
    public static void pay(BeautyGroup bg){
        bg.paymentOnline();
    }
}

/**
 * 利用反射实现
 */
class   BeautyGroupTest2{
    public static void main(String[] args) throws Exception {
        //获取字节码
        Class cl = Class.forName("com.company.reflection.Wechat");
        //获取对象
        Object o = cl.newInstance();
        //获取方法
        Method m = cl.getMethod("paymentOnline");
        //方法调用对象
        Object invoke = m.invoke(o);
    }
}