package com.company.enum1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SeasonEnum2
 * @company 公司
 * @Description JDK1.5后引入enum关键字
 * enum枚举类要求对象(常量)放在最开始的位置
 * 多个对象之间用都好分开连接对象,最后用;结束
 * enum关键字对应的枚举类的上层父类是: java.lang.Enum
 * 但是我们自定义的枚举类的上层父类：java.lang.Object
 * @createTime 2021年08月26日 15:11:11
 */
public enum SeasonEnum2 {
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","五谷丰登"),
    WINTER("冬天","冰天雪地");


    private final String seasonName;
    private final String seasonDesc;



    private SeasonEnum2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "SeasonEnum2{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}

class SeasonEnum2Test{
    public static void main(String[] args) {
        SeasonEnum2 season = SeasonEnum2.SPRING;
        System.out.println(season);

        //获取Season的父类
        System.out.println(SeasonEnum2.class.getSuperclass().getName());
    }
}