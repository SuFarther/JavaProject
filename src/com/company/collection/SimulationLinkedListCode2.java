package com.company.collection;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SimulationLinkedListCode2
 * @company 公司
 * @Description 模拟LinkedList源码
 *
 * 思路:
 *   1、SimulationLinkedListCode2这个类
 *   （1）先定义2个节点地址还有中间的当前元素,分别为Node pre,Object o，Node next,get、set方法和toString方法
 *   2、MyLinkedList2类中
 *     我们知道LinkedList的遍历是通过找到首节点和尾节点的,然后他们的数量怎么定义呢？定义一个计数器count
 *     里面分别有Node first首节点,Node last尾节点,int count计数器
 *     第一步: 我们判断first是否为空,如果为空那么就是从第一个数开始
 *     那么它的首节点是空的,元素就是当前的元素,尾节点也是空的,但是最后整个节点也就是Node n =new Node();
 *     所以把n的节点对象赋值给first,last,因为下一个节点的指向必须是一个整体节点
 *     第二步: 如果我们是第二个节点了,创建n对象,这个n的对象首节点设置为上一个元素的last节点
 *     object就是当前的第二个节点的obj,尾节点是为空节点,然后下一个节点的对象赋值给尾节点 last= n.setNext(n);
 *     然后last = n;最后在判断完之后，count++计算增加的元素
 *
 *     获取链表的大小
 *      public int getSize(){
 *         return  count;
 *     }
 *
 *     获取元素,其实Linkedlist没有索引的,我们就给它创建一个索引函数,我们给首节点是整个对象n，然后循环遍历这个对象的n的索引index
 *     ,最终获取到下一个元素，然后在赋值给这个n对象,如果没有返回,就直接获取到obj
 *     public Object get(int index){
 *         Node n = first;
 *         for (int i = 0; i < index; i++) {
 *             n = n.getNext();
 *         }
 *         return n.getObj();
 *     }
 *
 * @createTime 2021年08月13日 15:26:26
 */
class SimulationLinkedListCode2Test {
    public static void main(String[] args) {
        MyLinkedList2 m2 = new MyLinkedList2();
        m2.add("aaa");
        m2.add("bbb");
        m2.add("ccc");
        System.out.println(m2.getSize());
        System.out.println(m2.get(1));
    }
}

/**
 * @author 苏东坡
 */
public class SimulationLinkedListCode2 {
    private Node pre;
    private Object o;
    private Node next;

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SimulationLinkedListCode2{" +
                "pre=" + pre +
                ", o=" + o +
                ", next=" + next +
                '}';
    }
}


class MyLinkedList2 {
    Node first;
    Node last;
    int count;

    public MyLinkedList2() {
    }

    public void add(Object o) {
        if (first == null) {
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            first = n;
            last = n;
        }else{
            Node n = new Node();
            n.setPre(last);
            n.setObj(o);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }
        count++;
    }

    public int getSize(){
        return  count;
    }

    public Object get(int index){
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getObj();
    }
}