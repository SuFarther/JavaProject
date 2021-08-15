package com.company.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MapTreeMapStudent
 * @company 公司
 * @Description 自定义类型TreeSet 创建一个类实现外部比较器 定义一个类的化,就必须使用这个外部比较器
 * @createTime 2021年08月15日 21:46:46
 */
public class MapTreeMapStudent2{
    private String name;
    private int age;
    private double height;

    public MapTreeMapStudent2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "MapTreeMapStudent2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class BiJiaoQi5 implements Comparator<MapTreeMapStudent2>{

    @Override
    public int compare(MapTreeMapStudent2 o1, MapTreeMapStudent2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class MapTreeMapStudent2Test{
    public static void main(String[] args) {
        Comparator<MapTreeMapStudent2> com = new BiJiaoQi5();
        Map<MapTreeMapStudent2,Integer> map = new TreeMap<>(com);
        map.put(new MapTreeMapStudent2("alili",20,173.2),1001);
        map.put(new MapTreeMapStudent2("dlili",17,167.2),1003);
        map.put(new MapTreeMapStudent2("glili",12,180.0),1004);
        map.put(new MapTreeMapStudent2("blili",23,157.0),1002);
        System.out.println(map.size());
        System.out.println(map);
    }
}