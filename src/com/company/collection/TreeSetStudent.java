package com.company.collection;

import java.util.TreeSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TreeSetStudent
 * @company 公司
 * @Description TreeSet内部比较器
 * @createTime 2021年08月15日 15:42:42
 */
public class TreeSetStudent implements Comparable<TreeSetStudent>{
    private String name;
    private int  age;
    private double height;

    public TreeSetStudent(String name, int age, double height) {
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
        return "TreeSetStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(TreeSetStudent o) {
        return this.age - o.age;
    }
}


class  TreeSetStudentTest{
    public static void main(String[] args) {
        TreeSet<TreeSetStudent> t = new TreeSet<>();
        t.add(new TreeSetStudent("lili",19,167.9));
        t.add(new TreeSetStudent("lili2",12,203.4));
        System.out.println(t.size());
        System.out.println(t);
    }
}