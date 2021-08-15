package com.company.collection;

import java.util.Comparator;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExternalComparator
 * @company 公司
 * @Description 外部比较器 灵活，扩展性强,可以多个并列来写
 * 实现 Comparator<T> 比较两个值,compare方法
 * @createTime 2021年08月15日 14:20:20
 */
public class ExternalComparatorStudent {
    private String name;
    private int  age;
    private  Double height;


    public ExternalComparatorStudent(String name, int age, Double height) {
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ExternalComparatorStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

/**
 * 外部类实现另一个类的比较器 Comparator比较两个数值
 * 比较年龄
 */
class BiJiaoQi1 implements Comparator<ExternalComparatorStudent>{

    @Override
    public int compare(ExternalComparatorStudent o1, ExternalComparatorStudent o2) {
        return o1.getAge() - o2.getAge();
    }
}

/**
 * 外部类实现另一个类的比较器 Comparator比较两个数值
 * 比较名字
 */
class  BiJiaoQi2 implements Comparator<ExternalComparatorStudent>{

    @Override
    public int compare(ExternalComparatorStudent o1, ExternalComparatorStudent o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

/**
 * 外部类实现另一个类的比较器 Comparator比较两个数值
 * 比较身高
 */
class BiJiaoQi3 implements  Comparator<ExternalComparatorStudent>{

    @Override
    public int compare(ExternalComparatorStudent o1, ExternalComparatorStudent o2) {
       if((o1.getAge()-o2.getAge())== 0){
           return (((Double) o1.getHeight()).compareTo((Double) o2.getHeight()));
       }else{
           return o1.getAge()-o2.getAge();
       }
    }
}


class  ExternalComparatorStudentTest{
    public static void main(String[] args) {
        ExternalComparatorStudent s1 = new ExternalComparatorStudent("lili",20,165.2);
        ExternalComparatorStudent s2 = new ExternalComparatorStudent("lili",20,170.2);

        /**
         * 比较年龄
         */
        Comparator bjqage  = new BiJiaoQi1();
        System.out.println(bjqage.compare(s1,s2));

        /**
         * 比较名字
         */
        Comparator bjqname = new BiJiaoQi2();
        System.out.println(bjqname.compare(s1,s2));

        /**
         * 年龄相同,再比较身高
         */
        Comparator bjqheight = new BiJiaoQi3();
        System.out.println(bjqheight.compare(s1,s2));
    }
}
