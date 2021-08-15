package com.company.collection;

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
        TreeSetStudent t1 = new TreeSetStudent("lili",20,162.7);
        TreeSetStudent t2 = new TreeSetStudent("lili2",32,170);
        System.out.println(t1.compareTo(t2));
    }
}