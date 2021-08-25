package com.company.annotations;

import java.lang.annotation.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName FruitName
 * @company 公司
 * @Description 水果名称注解
 * @createTime 2021年08月26日 02:49:49
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default  "";
}
