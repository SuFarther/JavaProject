package com.company.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Calculator2Test
 * @company 公司
 * @Description Junit使用 加入@Before, @After注解
 * @Before 某一个方法中,加入了@Before注解以后,那么这个方法中的功能会在测试方法执行前去执行
 * 一般会在@Before修饰的那个方法中加入: 加入一些申请资源的代码: 申请数据库资源,申请IO资源，申请网络资源
 * @After 某一个方法中,计入了@After注解以后,那么这个方法中的功能会在测试方法执行后去执行
 *一般会在@After修饰的那个方法中加入: 加入一些释放资源的代码: 释放数据库资源,释放IO资源，释放网络资源
 *
 * @createTime 2021年08月26日 16:12:12
 */
public class Calculator2Test {

  @Before
  public void init(){
      System.out.println("方法执行前");
  }

  @After
  public void end(){
     System.out.println("方法执行后");
  }

  @Test
  public  void addTest(){
      Calculator c = new Calculator();
      System.out.println(c.add(10,20));
  }

  @Test
  public  void addSub(){
      Calculator2 c = new Calculator2();
      System.out.println(c.sub(10,20));;
  }
}

class Calculator2{
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a>b?a-b:b-a;
    }
}