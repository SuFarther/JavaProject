package com.company.collection;

import java.util.TreeSet;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName TreeSetInteger
 * @company 公司
 * @Description TreeSet
 *                 Set接口
 *                '
 *               '    、
 *              '       、
 *             '          、
 *          '                 、
 *      Hashset                   TreeSet
 *  (底层原理: 哈希表(数组+链表))       特点:唯一,无序(没有按照输入顺序进行输出,有序(按照升序进行遍历))
 *                                   底层原理: 二叉树(数据结构中的一个逻辑结构) 物理结构：跳转结构
 *                                   说明: 在数中放入数据的时候,最终于的事情就是比较: 比较实现: <0,=0,>0,实现内部比较器或外部比较器,所以向TreeSet放入数据的时候,自定义类型必须实现比较器
 *
 *   TreeSet在进行遍历时候得到升序的结果是怎么得到的？
 *   二叉树遍历:
 *      中序遍历: 左 根 右 ----当前二叉数的遍历方式
 *      先序遍历: 根 左 右
 *      后续遍历: 左 右 根
 *
 *  TreeSet底层二叉树遍历是按照升序结果出现的,这个升序是靠中序遍历得到的
 *  二叉树图：
 *       12
 *      '    、
 *      3       16
 *       、
 *         7
 *           、
 *             9
 * @createTime 2021年08月15日 15:23:23
 */
public class TreeSetInteger {
    public static void main(String[] args) {
        TreeSet<Integer> t =  new TreeSet<>();
        t.add(12);
        t.add(3);
        t.add(7);
        t.add(9);
        t.add(12);
        t.add(16);
        System.out.println(t.size());
        System.out.println(t);
    }
}
