package com.company.object.modifier;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description 权限修饰符
 * 权限修饰符有4种
 *              同一个类  同一个包  子类  其他类
 *  public        *       *        *     *
 *  protected     *       *        *
 *  default       *       *
 *  private       *
 *
 *
 *  default修饰符 可以省略不写 default指的是age
 * @createTime 2021年08月01日 22:28:28
 */
public class Student {
    /**
     * private修饰符的类只能自己类访问
     */
//    private int age;

    protected  int age;

    public void eat(){
        System.out.println("吃饭");
        age = 10;
    }


}
