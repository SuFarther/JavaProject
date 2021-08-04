package com.company.object.outer;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TestOur
 * @company 公司
 * @Description 面向对象-局部内部类
 * 匿名内部类就是没有类，用类来当接口实现类和实现
 * @createTime 2021年08月04日 21:04:04
 */
public class TestOuter {
    /**
     * 1\在局部内部类中访问的变量必须是final修饰的
     */
    final int NUM = 10;
    class A{
        public void a(){
            System.out.println(NUM);
        }
    }

    /**
     * 如果类B在整个项目中使用一次,那么就没有单独创建一个B类,适应内部类就可以类
     * @return
     */
    public Comparable method(){
        class  B implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }


    public Comparable method3(){
        /**
         * 匿名内部类
         */
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
    }


    public void test(){
        Comparable com = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
        System.out.println(com.compareTo("abc"));
    }
}
