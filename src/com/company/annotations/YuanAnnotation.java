package com.company.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName YuanAnnotaion
 * @company 公司
 * @Description 元注解说明
 * 元注解：
 *   元注解的作用就是负责注解其他注解。Java5.0定义了4个标准的meta-annotation类型，它们被用来提供对其它 annotation类型作说明。Java5.0定义的元注解：
 *   1.@Target,
 * 　2.@Retention,
 * 　3.@Documented,
 * 　4.@Inherited
 * 　@Target：
 *     @Target说明了Annotation所修饰的对象范围：Annotation可被用于
 *     packages、
 *     types（类、接口、枚举、Annotation类型）、
 *     类型成员（方法、构造方法、成员变量、枚举值）、
 *     方法参数和本地变量（如循环变量、catch参数）。
 *     在Annotation类型的声明中使用了target可更加明晰其修饰的目标。
 *
 *     作用：用于描述注解的使用范围（即：被描述的注解可以用在什么地方）
 *
 *     　取值(ElementType)有：
 *
 * 　　　　1.CONSTRUCTOR:用于描述构造器
 * 　　　　2.FIELD:用于描述域
 * 　　　　3.LOCAL_VARIABLE:用于描述局部变量
 * 　　　　4.METHOD:用于描述方法
 * 　　　　5.PACKAGE:用于描述包
 * 　　　　6.PARAMETER:用于描述参数
 * 　　　　7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
 * @createTime 2021年08月26日 02:23:23
 */
@Target(ElementType.TYPE)
public @interface YuanAnnotation {
    /**
     * 数据表名称注解，默认值为类名称
     */
    public String tableName() default "className";
}

