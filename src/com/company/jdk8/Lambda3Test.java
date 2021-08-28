package com.company.jdk8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Lambda3Test
 * @company 公司
 * @Description Lambda表达式测试
 * @createTime 2021年08月28日 09:33:33
 */
public class Lambda3Test {

    /**
     * 语法格式四： Lambda若只要一个参数时,参数的小括号可以省略
     * 语法格式五：Lambda需要两个或以上的参数,多条语句并且可以有返回值
     * 语法格式六：当Lambda只有一条语句时,return与大括号若有,都可以省略
     * 总结：
     *    ⬅️ 左边： Lambda形参列表可以省略(类型推断),如果lambda行参列表只有一个参数可以省略
     *    👉 右边：lambda体应该使用一对{}包裹;如果lambda体只有一条执行语句(可能是return语句),可以省略这个一对{}或return
     */
    @Test
    public void testConsmer(){
        Consumer<String> con = s -> {
            System.out.println(s);
        };
        con.accept("你好");
    }

    @Test
    public void testComparator(){
        Comparator<Integer> com = (x,y)  -> {
            System.out.println("比计较两个数哪个大");
            return  Integer.compare(x,y);
        };
        com.compare(20,10);
    }

    @Test
    public void testComparator2(){
        Comparator<Integer> com = (x,y)-> Integer.compare(x,y);
        System.out.println(com.compare(20,10));
    }


}
