package com.company.object.three;



/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName EncapsulationStudent
 * @company 公司
 * @Description 封装小案例
 * 封装的快捷键 快速生成get set
 * mac下是 command+n
 * window下是 alt+insert
 * @createTime 2021年08月01日 13:47:47
 */
public class EncapsulationStudent {

    private int age;
    private String name;
    private String sex;

    public EncapsulationStudent() {

    }

    public EncapsulationStudent(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.setSex(sex);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            this.sex = "男";
        }
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "EncapsulationStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
