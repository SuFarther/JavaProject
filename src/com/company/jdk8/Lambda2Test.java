package com.company.jdk8;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Lambda2Test
 * @company 公司
 * @Description lambda表达式的新特性6种情况介绍
 * Lambda表达式的本质: 作为接口的实例
 * @createTime 2021年08月27日 19:04:04
 */
public class Lambda2Test {
        /**
         * 语法格式一： 无参和无返回值
         */
        @Test
        public void tesRunnable(){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("我爱北京故宫");
                }
            };
            runnable.run();

            Runnable runnable1 = () -> System.out.println("我爱日月潭");
            runnable1.run();
        }


    /**
     * 语法格式二： Lambda需要一个数,但是没有返回值
     */
    @Test
    public void testConsumer(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("谎言和诺言");
            }
        };
        con.accept("谎言和诺言的区别");
        System.out.println("--------------");

        Consumer<String> con2 = (String s) -> System.out.println(s);
        con2.accept("咻咻咻");
        Consumer<String> con3 = (String s) -> {System.out.println(s);};
        con3.accept("喵喵喵");
    }


    /**
     * 语法格式三: 数据类型 可以省略,因为可由编译器推断得出,称为"类型维护"
     */
    @Test
    public void testConsumer2(){
        Consumer<String> con4 = (s) ->{System.out.println(s);};
        con4.accept("哈哈哈哈");
    }
}
