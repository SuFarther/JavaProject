package com.company.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TreeSetStudentWithExternalComparator3
 * @company 公司
 * @Description TreeSet实现外部器
 * 匿名内部类的写法
 * @createTime 2021年08月15日 16:19:19
 */
public class TreeSetStudentWithExternalComparator3  {
    private String name;
    private int age;
    private double height;

    public TreeSetStudentWithExternalComparator3(String name, int age, double height) {
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
        return "TreeSetStudentWithExternalComparator3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


}

class  TreeSetStudentWithExternalComparator3Test{
    public static void main(String[] args) {
        TreeSet<TreeSetStudentWithExternalComparator3>  t = new TreeSet<>(new Comparator<TreeSetStudentWithExternalComparator3>() {
            @Override
            public int compare(TreeSetStudentWithExternalComparator3 o1, TreeSetStudentWithExternalComparator3 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        t.add(new TreeSetStudentWithExternalComparator3("dlili",20,172.3));
        t.add(new TreeSetStudentWithExternalComparator3("alili",21,167));
        System.out.println(t.size());
        System.out.println(t);
    }
}
