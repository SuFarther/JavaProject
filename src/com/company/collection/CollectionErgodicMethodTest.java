package com.company.collection;



/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicMethodTest3
 * @company 公司
 * @Description 自定义泛型结构-泛形方法
 * 1、泛型方法就是不带泛型的方法,换句话说就是跟类给的泛型不一样,也就是你随便给个值,这个值系统不能识别,前面就要给个值指定泛型
 *    泛型方法有要求:这个方法的泛型的参数类型与当前类的泛型无关
 *    换个角度:
 *    泛型方法对应的那个泛型参数类型和当前所在的这个类是否是泛型者类,泛型是啥无关
 * 2、泛型定义的时候,前面要加上<T>
 *    原因： 如果不加的化会把T当作一种数据类型,然而代码种没有T类型那么就会报错
 * 3、调用方法 T的类型是在调用方法的时候确定
 * 4、泛型方法是可否是静态方法？可以是静态方法
 *    public  void a(E e){
 *
 *     }
 *     这个不是抽象方法,因为里面的参数和类给的泛型一致,还有在void里面加static不行,static静态加在方法中,类中使用了
 *     泛型,假设这里给了static,类中在给类实例化指定类型创建对象,static就已经加载了,这里就调用不了方法了
 * @createTime 2021年08月11日 06:52:52
 */
public class CollectionErgodicMethodTest<E> {
    public static <T> void   d(T t){

    }

    public  void a(E e){

    }

//    public static void c(E e){
//
//    }

    public  <T> void   b(T t){

    }

}


class  CollectionErgodicMethodMainTest{
    public static void main(String[] args) {
        CollectionErgodicMethodTest<String>  cm = new CollectionErgodicMethodTest<>();
        cm.a("小明");
        cm.b("aa");
        cm.b(17);
        cm.b(18);
    }
}