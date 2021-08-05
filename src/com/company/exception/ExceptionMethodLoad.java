package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName ExceptionMethodWrite
 * @company 公司
 * @Description 方法重载 异常无关
 * 同一各类中,方法名相同，形态列表不同构成重载
 * @createTime 2021年08月05日 21:24:24
 */
public class ExceptionMethodLoad {

    public void a() throws Exception{
        System.out.println("无参的重载方法");
    }

    public void  a(int age) throws RuntimeException{
        System.out.println("有参的重载方法");
    }
}
