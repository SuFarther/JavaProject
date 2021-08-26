package com.company.junit;

import org.junit.Test;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CalculatorTest
 * @company 公司
 * @Description Junit使用
 * 建议：
 *   名字: testAdd() testSub 见名知意
 *   参数: 无参
 *   返回值: void
 *
 *   测试方法定义完之后,不能直接运行 必须在方法前加一个注解：@Test
 * @createTime 2021年08月26日 16:12:12
 */
public class CalculatorTest {
  @Test
  public  void addTest(){
      Calculator c = new Calculator();
      System.out.println(c.add(10,20));
  }

  @Test
  public  void addSub(){
      Calculator c = new Calculator();
      System.out.println(c.sub(10,20));;
  }
}

class Calculator{
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a>b?a-b:b-a;
    }
}