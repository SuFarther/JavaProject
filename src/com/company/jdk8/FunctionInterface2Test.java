package com.company.jdk8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author 函数式接口应用
 * @version 1.0
 * @ClassName FunctionInterface2
 * @company 公司
 * @Description 函数式接口得到应用
 * Java内置四大函数式接口
 * Consumer<T>    void  accept<T t> 消费型接口
 * Supplier<T>     t get() 供给型接口
 * Function<T,R>  R apply(T t) 函数式接口
 * predicate<T>   boolean test(T t) 断定型接口
 * @createTime 2021年08月28日 12:14:14
 */
public class FunctionInterface2Test {

    @Test
    public void tstHappyTime(){
       happyTime(500, new Consumer<Double>() {
           @Override
           public void accept(Double aDouble) {
               System.out.println("学习太累了,我想买瓶矿泉水,价格为:"+aDouble);
           }
       });

       happyTime(600,money -> System.out.println("学习太累了,我想买瓶矿泉水,价格为:"+money));
    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }


    @Test
    public void tesFilerString(){
        List<String> list = Arrays.asList("北京", "南京", "天津", "东京", "西京");
        List<String> filerStrs = filerString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(filerStrs);

        List<String> filerStrs2 =filerString(list,s -> s.contains("京"));
        System.out.println(filerStrs2);
    }

    /**
     * 根据给定的规则,过滤集合中的字符串,此规则由Predicate的方法决定
     * @param list
     * @param pre
     * @return
     */
    public List<String> filerString(List<String>list, Predicate<String> pre){
        ArrayList<String>  filterList = new ArrayList<>();

        for (String s:list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }
}
