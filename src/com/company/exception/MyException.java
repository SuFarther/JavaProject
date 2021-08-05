package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MyException
 * @company 公司
 * @Description 自定义异常
 * 自定义异常可以定义运行时异常也可以定义检查时异常
 * @createTime 2021年08月05日 21:38:38
 */
public class MyException  extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public MyException(){

    }

    public MyException(String message){
        super(message);
    }
}


 class ExceptionDemoTest4 {
    private String name;
    private int age;
    private String sex;

    public ExceptionDemoTest4() {
    }

    public ExceptionDemoTest4(String name, int age, String sex) {
        this.name = name;
        this.age = age;
//        this.sex = sex;
        this.setSex(sex);
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("男".equals(sex) || "女".equals(sex) ){
            this.sex = sex;
        }else{
            try {
                throw new MyException("对不起,性别不对!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String toString() {
        return "ExceptionDemoTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class Test2{
    public static void main(String[] args){
        ExceptionDemoTest4 e2 = new ExceptionDemoTest4("娜娜",19,"aaaaa");
        System.out.println(e2);
    }
}