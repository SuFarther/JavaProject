package com.company.commonclass;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName StringBuilderMethodTest
 * @company 公司
 * @Description StringBuilderMethod
 * @createTime 2021年08月07日 20:58:58
 */
public class StringBuilderAndStringBufferMethodTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("nihaojavaasdadasdasdassada");
        //增
        sb.append("这是梦想1");
        System.out.println(sb);
        //删
        //删除位置在[3,6）上的字符
        sb.delete(3,6);
        System.out.println(sb);

        //删除位置在16的字符
        sb.deleteCharAt(16);
        System.out.println(sb);

        //改----》插入
        StringBuilder sb1 = new StringBuilder("1111213123113");
        sb1.insert(3,",");
        System.out.println(sb1);

        //改----》替换
        StringBuilder sb2 = new StringBuilder("1111213123113");
        sb2.replace(3,5,"我好累");
        System.out.println(sb2);
        sb.setCharAt(3,'!');
        System.out.println(sb);

        //查
        StringBuilder sb3 = new StringBuilder("adasd");
        for (int i = 0; i < sb3.length(); i++) {
            System.out.print(sb3.charAt(i)+"\t");
        }
        System.out.println();

        //截取
        String str = sb3.substring(2,4);
        System.out.println(str);
        System.out.println(sb3);

        StringBuffer sf = new StringBuffer();
        System.out.println(sf.append(3));;

    }
}
