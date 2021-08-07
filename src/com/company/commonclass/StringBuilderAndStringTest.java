package com.company.commonclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StringBuilderAndStringTest
 * @company 公司
 * @Description StringBuilderAndString
 * 什么是可变和什么是不变的
 *   不可变: 在地址不变情况下,想把"abc"变成"def"是不肯呢个的
 *   可变: StringBuilder是可变的
 *     在StringBuilder这个对象地址不变情况下,想把"abc"变成"def"是可能的，直接追加即可
 *
 * @createTime 2021年08月07日 20:50:50
 */
public class StringBuilderAndStringTest {
    public static void main(String[] args) {
        /**
         * 内存分析, String str = "abc";
         *   "abc"放到常量池中,常量池的abc的对象的地址为假设为0x99
         *   然后def又放入了方法区的常量池,这里就开辟了一个空间,常量池的def的对象假设为0x88
         *   然后栈中原先有个str的对象指向0x99，后面def放入常量池,原先的指向就断开了,直接从str指向def
         * StringBuilder创建的对象只要确保这个地址是一样的,无论你怎么追加都相等
         *
         */
        String str = "abc";
        str = "def";
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("abc") == sb.append("def"));
    }
}
