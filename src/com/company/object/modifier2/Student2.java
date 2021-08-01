package com.company.object.modifier2;

import com.company.object.modifier.Student;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student2
 * @company 公司
 * @Description 权限修饰符 protected可以到子类中
 * @createTime 2021年08月01日 22:40:40
 */
public class Student2 extends Student {

    public void go(){
        System.out.println(age);
    }
}
