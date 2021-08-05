package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionDemoTest
 * @company 公司
 * @Description 异常小demo
 * @createTime 2021年08月05日 21:08:08
 */
public class ExceptionDemoTest {
    private String name;
    private int age;
    private String sex;

    public ExceptionDemoTest() {
    }

    public ExceptionDemoTest(String name, int age, String sex) {
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
           //自己制造运行时异常
//           throw new RuntimeException();

           //制造检查时异常,自己捕获
           try {
               throw new Exception();
           } catch (Exception e) {
               e.printStackTrace();
           }

           //往外抛异常
//           throw new Exception();
//           System.out.println("你输入的不是一个性别");
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

class Test{
    public static void main(String[] args){
//        ExceptionDemoTest e = new ExceptionDemoTest();
//        e.setName("张三");
//        e.setAge(18);
//        e.setSex("aaaaa");
//        System.out.println(e);


        ExceptionDemoTest e2 = new ExceptionDemoTest("娜娜",19,"aaaaa");
        System.out.println(e2);
    }
}