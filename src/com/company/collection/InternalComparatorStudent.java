package com.company.collection;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName InternalComparatorStudent
 * @company 公司
 * @Description 内部比较器
 * 扩展性差,每次都要自己比,自定义比较器
 * 内部比较器 就是   类实现Comparable<T>这里是 Comparable<InternalComparatorStudent>
 *    就得实现这个方法
 *    @Override
 *     public int compareTo(InternalComparatorStudent o) {
 *         return 0;
 *     }
 * @createTime 2021年08月15日 14:07:07
 */
public class InternalComparatorStudent implements Comparable<InternalComparatorStudent>{
    private String name;
    private int age;
    private double height;


    public InternalComparatorStudent(String name, int age, double height) {
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
        return "InternalComparatorStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    /**
     * 比较年龄
     *  return this.age - o.age;
     * 比较年龄
     *   return this.name.compareTo(o.name);
     *  比较身高
     */
    @Override
    public int compareTo(InternalComparatorStudent o) {
        return (((Double) this.height).compareTo((Double) o.height));
    }
}


class  InternalComparatorStudentTest{
    public static void main(String[] args) {
        InternalComparatorStudent s1 = new InternalComparatorStudent("lili",20,165.2);
        InternalComparatorStudent s2 = new InternalComparatorStudent("lili",21,170.2);
        System.out.println(s1.compareTo(s2));
    }
}