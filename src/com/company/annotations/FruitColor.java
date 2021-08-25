package com.company.annotations;

import java.lang.annotation.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FruitColor
 * @company 公司
 * @Description 水果颜色注解
 * @createTime 2021年08月26日 02:51:51
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色属性
     */
    Color fruitColor() default  Color.GREEN;


    /**
     * 颜色枚举
     */
    public enum  Color{BLUE,READ,GREEN}

}
