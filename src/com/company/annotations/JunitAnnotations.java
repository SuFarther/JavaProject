package com.company.annotations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName JunitAnnotations
 * @company 公司
 * @Description Junit注解
 * 注意 需要导junit的包,自行百度
 * @createTime 2021年08月25日 20:30:30
 */
public class JunitAnnotations {
    @Before
    public void init(){
        System.out.println("方法执行开始了。。。");
    }

    @After
    public void closs(){
        System.out.println("方法执行结束了。。。");
    }

    @Test
    public void testAdd(){
        System.out.println("测试add方法");
    }
}
