package com.company.annotations;

import java.lang.annotation.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName DocumentedYuanAnnotation
 * @company 公司
 * @Description 元注解下的@Documented
 * @Documented
 * 　@Documented用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。Documented是一个标记注解，没有成员
 *   @Retention 指示带注释类型的注释将保留多长时间
 *   RetentionPolicy.RUNTIME
 * @createTime 2021年08月26日 02:32:32
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DocumentedYuanAnnotation {
    public String name() default "fieldName";
    public String setFunctionName() default "setField";
    public String getFunctionName() default "getField";
    public boolean defaultDBValue() default false;
}
