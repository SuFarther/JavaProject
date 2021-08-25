package com.company.annotations;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MyAnnotation2
 * @company 公司
 * @Description 自定义注解
 * 给定的默认初始值
 * @createTime 2021年08月26日 02:02:02
 */
public @interface MyAnnotation2 {
    String value() default "abc";
}
