package com.company.collection;

import java.util.HashSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionHashSetCustom
 * @company 公司
 * @Description HashSet自定义类型 不满足唯一、无序特点
 * @createTime 2021年08月14日 23:31:31
 */
public class CollectionHashSetCustom {
    private int age;
    private  String  name;

    public CollectionHashSetCustom() {
    }

    public CollectionHashSetCustom(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "CollectionHashSetCustom{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


class CollectionHashSetCustomTest{
    public static void main(String[] args) {
        HashSet<CollectionHashSetCustom> chs = new HashSet<>();
        chs.add(new CollectionHashSetCustom(19,"lili"));
        chs.add(new CollectionHashSetCustom(24,"wangwu"));
        chs.add(new CollectionHashSetCustom(19,"lili"));
        chs.add(new CollectionHashSetCustom(18,"zhangsan"));
        chs.add(new CollectionHashSetCustom(17,"tianqi"));
        System.out.println(chs.size());
        System.out.println(chs);
    }
}