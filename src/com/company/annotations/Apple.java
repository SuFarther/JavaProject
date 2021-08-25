package com.company.annotations;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Apple
 * @company 公司
 * @Description 实现自定义注解
 * 使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口，由编译程序自动完成其他细节。在定义注解时，不能继承其他的注解或接口。
 * @interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。
 * 可以通过default来声明参数的默认值。
 *
 * 定义注解格式：
 * 　　public @interface 注解名 {定义体}
 *
 * 　　注解参数的可支持数据类型：
 *
 * 　　　　1.所有基本数据类型（int,float,boolean,byte,double,char,long,short)
 * 　　　　2.String类型
 * 　　　　3.Class类型
 * 　　　　4.enum类型
 * 　　　　5.Annotation类型
 * 　　　　6.以上所有类型的数组
 *
 * 　　Annotation类型里面的参数该怎么设定:
 * 　　第一,只能用public或默认(default)这两个访问权修饰.例如,String value();这里把方法设为defaul默认类型；　 　
 * 　　第二,参数成员只能用基本类型byte,short,char,int,long,float,double,boolean八种基本数据类型和 String,Enum,Class,annotations等数据类型,以及这一些类型的数组.
 *     例如,String value();这里的参数成员就为String;　　
 * 　　第三,如果只有一个参数成员,最好把参数名称设为"value",后加小括号.例:下面的例子FruitName注解就只有一个参数成员。
 * @createTime 2021年08月26日 02:56:56
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.BLUE)
    private String appleColor;

    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}

class AppleTest{
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getAppleName());
        System.out.println(apple.getAppleColor());
        apple.displayName();
    }
}