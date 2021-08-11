package com.company.collection;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionGenericParametersTest
 * @company 公司
 * @Description 泛型的参数不存在继承的关系
 * 总结:A和B是子类父类的关系,但是G(A)和G(B)不存在继承,并列关系
 * @createTime 2021年08月11日 19:50:50
 */
public class CollectionGenericParametersTest {
    public static void main(String[] args) {
        Object o = new Object();
        String s  =  new String();

        Object[] objArr = new Object[10];
        String[] strArr = new String[10];
        objArr = strArr;

//        List<Object> obj = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        obj= list2;

    }
}
