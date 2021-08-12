package com.company.collection;

/**
 * @author 节点类
 * @version 1.0
 * @ClassName SimulationLinkedListCode
 * @company 公司
 * @Description 模拟LinkedList源码
 * @createTime 2021年08月12日 20:39:39
 */
public class SimulationLinkedListCode {
    public static void main(String[] args) {
        //创建一个myLinedList的对象
        MyLinkedList m = new MyLinkedList();
        m.add("aa");
        m.add("bb");
        m.add("cc");
        System.out.println(m.getSize());
        System.out.println(m.get(0));
    }
}

/**
 * 节点类
 */
class Node {
    /**
     * 上一个节点的地址
     */
    private Node pre;
    /**
     * 当前存入的元素
     */
    private Object obj;
    /**
     * 下一个元素的地址
     */
    private Node next;


    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}

class MyLinkedList {
    //链中一定有子节点
    Node first;

    //链中一定有尾节点
    Node last;


    //计数器
    int count = 0;
    public MyLinkedList() {

    }

    public void add(Object obj) {
        //证明你添加的是第一个节点
        if (first == null) {
            //将添加的元素添加Node对象
            Node n = new Node();
            n.setPre(null);
            n.setObj(obj);
            n.setNext(null);
            //当前链中的第一个节点变为n
            first = n;
            //当前链中的最后节点也变成n
            last = n;
        } else {
            //证明已经不是链中的第一个节点了
            //将添加的元素封装为一个Node对象
            Node n = new Node();
            //n的上一个节点一定是当前链中的最后一个节点last
            n.setPre(last);
            n.setObj(obj);
            n.setNext(null);
            //当前链中的最后的一个节点的下一个元素,要指向n
            last.setNext(n);
            //将最后一个节点变为n
            last = n;
        }
        //链中元素数量加1
        count++;
    }

    //得到集合中元素的数量
    public int getSize(){
        return  count;
    }

    //通过下标得到元素
    public Object get(int index) {
        //获取链表的头元素
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return  n.getObj();
    }
}