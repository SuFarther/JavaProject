package com.company.object.two;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CodeBlock
 * @company 公司
 * @Description 代码块
 * （1）类组成: 属性、方法、构造器、代码块、内部类
 *  (2) 代码块组成: 普通块、构造块、静态块、同步块(多线程)
 *  (3) 普通块: 方法中,普通代码块限制了局部变量作用范围
 *      构造块: 写在方法外
 *      静态块: 用static修饰块,静态块中访问静态属性和方法
 *
 *   总结: 代码块的执行顺序
 *     静态块>构造块>构造器> 普通方法
 *
 * @createTime 2021年08月01日 12:49:49
 */
public class CodeBlock {
    int id;
    static int sid;


    public CodeBlock() {

    }

    public CodeBlock(int id){
        this.id = id;
    }

    public void eat() {
        {
            int num = 10;
            System.out.println("我是普通代码块-放在类中");
            System.out.println("普通代码块的值:"+num);
        }
        System.out.println("吃饭");
    }

    public static void sleep() {
        System.out.println("睡觉");
    }

    {
        int num2 = 10;
        System.out.println("我是构造代码块");
        System.out.println("构造代码块的值:"+num2);
    }

    static{
        System.out.println("我是静态代码块,由于类的对象使用");
        System.out.println(CodeBlock.sid);
    }


    public static void main(String[] args) {
        CodeBlock b = new CodeBlock();
        b.eat();
        CodeBlock.sleep();
    }

}
