package com.company.object.two;

/**
 * @version 1.0
 * @ClassName ConstructorReload
 * @company 公司
 * @Description 构造器重载
 * @createTime 2021年07月31日 01:50:50
 */
public class Constructor {

    String name;
    int age;

   public Constructor(){

   }
   public Constructor(String name, int age){
       this.name = name;
       this.age = age;
   }

    public void  eat(){
        System.out.println("我喜欢吃饭");
    }
}
