package com.company.enum1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SeasonEnum
 * @company 公司
 * @Description 自定义枚举类
 * 枚举类： 一枚一枚列举出来。前提: 有限,确定
 * Java类, 类的对象是有限的,这个类可以定义的枚举类
 * 举例：
 *   星期: 一二三四五六日
 *   性别：男女
 *   季节：春夏秋冬
 * @createTime 2021年08月26日 14:50:50
 */
public class SeasonEnum {

    public static final SeasonEnum SPRING = new SeasonEnum("春天","春暖花开");
    public static final SeasonEnum SUMMER = new SeasonEnum("夏天","夏日炎炎");
    public static final SeasonEnum AUTUMN = new SeasonEnum("秋天","五谷丰登");
    public static final SeasonEnum WINTER = new SeasonEnum("冬天","冰天雪地");
    private  final String seasonName;
    private  final String seasonDesc;
    /**
     * 私有化构造函数
     * @param seasonName  季节名字
     * @param seasonDesc  季节描述
     */
    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

class  SeasonEnumTest{
    public static void main(String[] args) {
        SeasonEnum season = SeasonEnum.SPRING;
        System.out.println(season);
        System.out.println(season.getSeasonName());
    }
}