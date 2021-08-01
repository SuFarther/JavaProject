package com.company.object.extend;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Teacher
 * @company 公司
 * @Description 教师类 子类
 * @createTime 2021年08月01日 14:44:44
 */
public class Teacher extends Person {

    private int teano;

    public int getTeano() {
        return teano;
    }

    public void setTeano(int teano) {
        this.teano = teano;
    }


    public void teach(){
        System.out.println("教师可以教书");
    }
}
