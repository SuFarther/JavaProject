package com.company.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author MapTreeMapStudent3
 * @version 1.0
 * @ClassName MapTreeMapStudent3
 * @company 公司
 * @Description TreeSet外部比较器做法
 * @createTime 2021年08月15日 22:04:04
 */
public class MapTreeMapStudent3 {
    private  String name;
    private  int age;
    private  double height;

    public MapTreeMapStudent3(String name, int age, double height) {
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
        return "MapTreeMapStudent3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class  MapTreeMapStudent3Test{
    public static void main(String[] args) {
        //第一种写法
//        Comparator<MapTreeMapStudent3> com = new Comparator<MapTreeMapStudent3>() {
//            @Override
//            public int compare(MapTreeMapStudent3 o1, MapTreeMapStudent3 o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//        Map<MapTreeMapStudent3,Integer> map = new TreeMap<>(com);


        Map<MapTreeMapStudent3,Integer> map = new TreeMap<>(new Comparator<MapTreeMapStudent3>() {
            @Override
            public int compare(MapTreeMapStudent3 o1, MapTreeMapStudent3 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map.put(new MapTreeMapStudent3("alili",19,187.2),1002);
        map.put(new MapTreeMapStudent3("clili",14,167.0),1001);
        map.put(new MapTreeMapStudent3("blili",16,172.0),1007);
        map.put(new MapTreeMapStudent3("flili",13,155.2),1008);
        System.out.println(map.size());
        System.out.println(map);
    }
}