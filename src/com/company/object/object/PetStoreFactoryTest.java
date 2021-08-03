package com.company.object.object;

import com.company.object.polymorphic.Animal;

import java.sql.SQLOutput;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName PetStoreFactoryTest
 * @company 公司
 * @Description TODO 简单工厂设计模式
 *
 * 简单工厂模式的实现,它是解决大量创建对象问题的一个解决方案,将创建和使用分开,工厂负责创建,使用者直接调用即可。简单工厂
 * 模式的基本要求是
 *     1、定义一个static方法,通过类名直接调用
 *     2、返回值类型是父类类型,返回的可以是任意子类类型
 *     3、传入一个字符串类型的参数,工厂根据参数创建对应的子类产品
 *
 * @createTime 2021年08月03日 21:44:44
 */
public class PetStoreFactoryTest {


    public static void main(String[] args) {
        Animal cat = PetStore.getAnimal("猫");
        Animal dog = PetStore.getAnimal("狗");
        cat.shout();
        dog.shout();

    }

}
