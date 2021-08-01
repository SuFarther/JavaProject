package com.company.object.three;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName EncapsulationStudentTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月01日 14:00:00
 */
public class EncapsulationStudentTest {
    public static void main(String[] args) {
        EncapsulationStudent s = new EncapsulationStudent();
        s.setName("张三");
        s.setAge(19);
        s.setSex("女");
        System.out.println(s.getName()+"----"+s.getAge()+"----"+s.getSex());

        EncapsulationStudent s2 = new EncapsulationStudent(18,"菲菲","女");
        System.out.println(s2.getName()+"----"+s2.getAge()+"----"+s2.getSex());
    }
}
