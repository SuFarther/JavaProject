package com.company.io;

import java.io.*;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SerializablePerson
 * @company 公司
 * @Description Serializable接口
 * 操作字符串对象:
 *  首先将一个字符串对象写到文件中去------》 序列化
 *  你想要序列化类,必须实现Serializable，这种接口内部，什么都没有,叫做标识接口,只要实现这个接口的对象才可以实现序列化
 *
 *  指向类alt+enter可以加SerializableUID
 * @createTime 2021年08月21日 22:19:19
 */
public class SerializablePerson implements Serializable {

    private static final long serialVersionUID = 2886401837760667314L;

    private String name;
    private  int age;

    public SerializablePerson() {
    }

    public SerializablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "SerializablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class  SerializableTest{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       SerializablePerson p = new SerializablePerson("lili",18);

//       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("文件路径的详细地址1")));
//       oos.writeObject(p);
//       oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("文件路径的详细地址1")));
        System.out.println(ois.readObject());
        ois.close();
    }
}
