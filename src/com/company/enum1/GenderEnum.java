package com.company.enum1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName GenderEnum
 * @company 公司
 * @Description 枚举案例的应用
 * @createTime 2021年08月26日 15:54:54
 */
public enum GenderEnum {
    男,
    女,
}


class Person{
    private String name;
    private int age;
    private GenderEnum sex;

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

    public GenderEnum getSex() {
        return sex;
    }

    public void setSex(GenderEnum sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

class  PersonTest{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(18);
        p.setSex(GenderEnum.女);
        System.out.println(p);
    }
}

class  PersonTest2{
    public static void main(String[] args) {
        //switch后面(）可以接入枚举类型 switch后面的(): int,short,byte,char,String,枚举
        GenderEnum sex = GenderEnum.女;
        switch (sex){
            case 女:
                System.out.println("我是女生");
                break;
            case 男:
                System.out.println("我是男生");
                break;
            default:
                System.out.println("不男不女的妖怪");
        }
    }
}