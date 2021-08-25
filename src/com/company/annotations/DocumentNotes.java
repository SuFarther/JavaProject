package com.company.annotations;

/**
 * @author 文档注解
 * @version 1.0
 * @ClassName DocumentNotes
 * @company 公司
 * @Description 文档注解
 * @createTime 2021年08月26日 01:09:09
 */
public class DocumentNotes {
    /**
     *
     * @param num1 就餐人数1
     * @param num2 就餐人数2
     */
    public void eat(int num1,int num2){

    }

    /**
     * @param age 年龄
     * @return int
     * @see
     * @exception    RuntimeException 当年龄过大当时候
     * @exception    IndexOutOfBoundsException 当年龄过小的时候
     */
    public int sleep(int age){
         if(age > 100){
             throw  new RuntimeException();
         }
         if(age < 0){
           throw new IndexOutOfBoundsException();
         }
        return  10;
    }
}
