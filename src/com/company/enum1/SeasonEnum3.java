package com.company.enum1;

/**
 * @author  苏东坡
 * @version 1.0
 * @ClassName SeasonEnum3
 * @company 公司
 * @Description enum定义枚举类补充和Enum 类的常用方法
 * 因为这个枚举类底层没有属性,方法,构造器
 * Enum类常用方法
 * toString(): ----->获取对象名字
 * values: 枚举对象数组
 * valueOf: 对象名字必须传正确，否则出现异常。通过对象名字获取这个名字
 * @createTime 2021年08月26日 15:24:24
 */
public enum SeasonEnum3 {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;
}

class SeasonEnum3Test{
    public static void main(String[] args) {
        SeasonEnum3 season = SeasonEnum3.SPRING;
        System.out.println(season.toString());

        System.out.println("---------");
        SeasonEnum3[] values = SeasonEnum3.values();
        for(SeasonEnum3 se : values){
            System.out.println(se);
        }

        System.out.println("---------");
        SeasonEnum3 autumn = SeasonEnum3.valueOf("AUTUMN");
        System.out.println(autumn);
    }
}