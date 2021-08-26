package com.company.enum1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SeasonEnum4
 * @company 公司
 * @Description 枚举类实现接口
 * @createTime 2021年08月26日 15:42:42
 */
public enum SeasonEnum4 implements SeasonEnum4Interfaces{
    SPRING{
        @Override
        public void show() {
            System.out.println("我是春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("我是夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("我是秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("我是冬天");
        }
    };
}

interface SeasonEnum4Interfaces{
    /**
     * return show()主要用来展示季节的方法
     */
     void show();
}

class SeasonEnum4Test{
    public static void main(String[] args) {
        SeasonEnum4 season = SeasonEnum4.SPRING;
        season.show();

        SeasonEnum4 season2 = SeasonEnum4.WINTER;
        season2.show();
    }
}