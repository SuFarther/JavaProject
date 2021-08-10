package com.company.collection;



/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName CollectionErgodicClassTest
 * @company 公司
 * @Description 自定义泛型结构-泛型类
 * <>里面就是一个参数类型,但是类型是什么呢？这个类型现在是不确定的,相当于一个占为,但是现在确定的这个类型一定是引用数据类型,
 * 而不是基本数据类型
 *
 * 应用场合:
 *    public class ArrayList<E> extends AbstractList<E>
 *         implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 *
 *
 * @createTime 2021年08月10日 22:29:29
 */
public class CollectionErgodicClassTest<E> {
  String name;
  int  age;
  E sex;

  public void a(E e){
      System.out.println("a");
  }

  public void b(E[] e){
      System.out.println("b");
  }
}

/**
 * 指定父类泛型,那么子类就不需要指定泛型类,可以直接使用
 */
class SonCollectionErgodicClass extends CollectionErgodicClassTest<Integer>{

}

class ExtendSonCollectionErgodicClassTest{
    public static void main(String[] args) {
        SonCollectionErgodicClass s = new SonCollectionErgodicClass();
        s.age = 19;
        s.name = "张三";
        System.out.println("子类泛型:"+s.age+"\t"+s.name);
    }
}


/**
 * 父类不指定泛型,如果父类不指定泛型,那么子类也要变成泛型,那么这个E的类型在创建子类对象时候确定
 */
class SonCollectionErgodicClass2<E> extends CollectionErgodicClassTest<E>{

}
class ExtendSonCollectionErgodicClass2Test{
    public static void main(String[] args) {
        SonCollectionErgodicClass2<Integer> s2 = new SonCollectionErgodicClass2<>();
        s2.age = 19;
        s2.name = "张三";
        s2.a(17);
        s2.b(new Integer[]{1,2,3,4});
        System.out.println("子类泛型:"+s2.age+"\t"+s2.name);
    }
}



class ErgodicTest{
    public static void main(String[] args) {
        //实力话的时候不指定泛型:如果实力化时候不明确指定类的类型,那么默认为Object类型
        CollectionErgodicClassTest c1 = new CollectionErgodicClassTest();
        c1.name = "张三";
        c1.age = 20;
        c1.sex = "男";
        System.out.println(c1.name+"\t"+c1.age+"\t"+c1.sex);

        //实力化指定泛型-推荐
        CollectionErgodicClassTest<String> c2 = new CollectionErgodicClassTest<>();
        c2.sex = "男";
        c2.a("小二");
        c2.b(new String[]{"小吃","牛奶,面包"});
        System.out.println(c2.sex);
    }
}
