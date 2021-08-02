package com.company.object.object;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Test
 * @company 公司
 * @Description Object下面的toString();
 * @createTime 2021年08月02日 20:28:28
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三",19,172);
        System.out.println(s);
        System.out.println(s.toString());
    }
}
