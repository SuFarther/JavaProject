package com.company.annotations;

/**
 * @author 自定义注解
 * @version 1.0
 * @ClassName MyAnnotationPerson
 * @company 公司
 * @Description 实现MyAnnotation自定义注解
 * @createTime 2021年08月26日 01:58:58
 */
@MyAnnotation2
@MyAnnotation(value = {"abc","def","hij"})
public class MyAnnotationPerson {
}
