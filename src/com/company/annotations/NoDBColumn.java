package com.company.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName NoDBColumn
 * @company 公司
 * @Description 元注解：@Target
 * 注解Table 可以用于注解类、接口(包括注解类型) 或enum声明,而注解NoDBColumn仅可用于注解类的成员变量。
 * @createTime 2021年08月26日 02:28:28
 */
@Target(ElementType.FIELD)
public @interface NoDBColumn {
}
