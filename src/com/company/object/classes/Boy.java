package com.company.object.classes;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName boy
 * @company 公司
 * @Description TODO
 * @createTime 2021年08月03日 14:44:44
 */
public class Boy {

    private  String name;
    private  int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
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


    public void buy(){
        System.out.println("跟我谈恋爱,我就跟帮你买买买！");
    }
}
