package com.company.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MapTreeMapStudent
 * @company 公司
 * @Description 自定义类型TreeMap 使用
 * @createTime 2021年08月15日 21:46:46
 */
public class MapTreeMapStudent implements  Comparable<MapTreeMapStudent>{
    private String name;
    private int age;
    private double height;

    public MapTreeMapStudent(String name, int age, double height) {
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
        return "MapTreeMapStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(MapTreeMapStudent o) {
        return this.name.compareTo(o.name);
    }
}


class MapTreeMapStudentTest{
    public static void main(String[] args) {
        Map<MapTreeMapStudent,Integer> map = new TreeMap<>();
        map.put(new MapTreeMapStudent("alili",20,173.2),1001);
        map.put(new MapTreeMapStudent("dlili",17,167.2),1003);
        map.put(new MapTreeMapStudent("glili",12,180.0),1004);
        map.put(new MapTreeMapStudent("blili",23,157.0),1002);
        System.out.println(map.size());
        System.out.println(map);
    }
}