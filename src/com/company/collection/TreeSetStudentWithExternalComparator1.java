package com.company.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TreeSetStudentWithExternalComparator1
 * @company 公司
 * @Description TreeSet外部实现类 有三种写法
 * 方式一： 指定类来实现Comparator<T>接口,实现里面的方法
 * @createTime 2021年08月15日 15:49:49
 */
public class TreeSetStudentWithExternalComparator1 {
    private String  name;
    private int age;
    private double height;

    public TreeSetStudentWithExternalComparator1(String name, int age, double height) {
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
        return "TreeSetStudentWithExternalComparator1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}


class BiJiaoQi implements Comparator<TreeSetStudentWithExternalComparator1>{

    @Override
    public int compare(TreeSetStudentWithExternalComparator1 o1, TreeSetStudentWithExternalComparator1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class TreeSetStudentWithExternalComparator1Test{
    public static void main(String[] args) {
        //利用外部比较器,必须自己指定
        Comparator<TreeSetStudentWithExternalComparator1> com = new BiJiaoQi();
        //一旦执行外部比较器,那么就会按照外部比较器来实现
        TreeSet<TreeSetStudentWithExternalComparator1> t = new TreeSet<>(com);
        t.add(new TreeSetStudentWithExternalComparator1("dlili",18,172.0));
        t.add(new TreeSetStudentWithExternalComparator1("alili",20,168.0));
        System.out.println(t.size());
        System.out.println(t);
    }
}