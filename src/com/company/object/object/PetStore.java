package com.company.object.object;

import com.company.object.polymorphic.Animal;
import com.company.object.polymorphic.Cat;
import com.company.object.polymorphic.Dog;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName PetStore
 * @company 公司
 * @Description 简单工厂设计模式
 * @createTime 2021年08月03日 21:40:40
 */
public class PetStore {
    /**
     * 多态的一种体现
     */
    public static Animal getAnimal(String animalName) {
        Animal animal = null;

        if ("猫".equals(animalName)) {
            animal = new Cat();
        }

        if ("狗".equals(animalName)) {
            animal = new Dog();
        }
        return animal;
    }
}
