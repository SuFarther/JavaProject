package com.company.reflection;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Person
 * @company 公司
 * @Description 反射的综合案例
 * Class类的主要方法
 * getName()：获得类的完整名字。
 *
 * getFields()：获得类的public类型的属性。
 *
 * getDeclaredFields()：获得类的所有属性。包括private 声明的和继承类
 *
 * getMethods()：获得类的public类型的方法。
 *
 * getDeclaredMethods()：获得类的所有方法。包括private 声明的和继承类
 *
 * getMethod(String name, Class[] parameterTypes)：获得类的特定方法，name参数指定方法的名字，parameterTypes 参数指定方法的参数类型。
 *
 * getConstructors()：获得类的public类型的构造方法。
 *
 * getConstructor(Class[] parameterTypes)：获得类的特定构造方法，parameterTypes 参数指定构造方法的参数类型。
 *
 * newInstance()：通过类的构造方法创建这个类的一个对象。
 *
 *
 * 对于私有的成员变量来说，要操作其属性值的话，就需要设置setAccessible(true);
 * field.setAccessible(true)就是让我们在反射时可以操作私有成员属性的值
 *
 * getMethods() 能够获取Object类中的public方法。
 *
 * getDeclaredMethods()获取不到。
 *
 * Object类是一切java类的父类，对于普通的java类，即便不声明，也是默认继承了Object类。典型的，可以使用Object类中的toString()方法
 *
 * 动态操作属性
 * Class class1 = Class.forName("reflect.Person");
 *
 * Person person = new Person();
 *
 * Field field = class1.getDeclaredField("username");
 *
 * field.set(person,"pine");
 *
 * @createTime 2021年08月26日 20:21:21
 */
public class Person {
    public String nick;
    private String username;
    private  int age;

    public Person(){

    }

    private Person(String username) {
        this.username = username;
    }

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


    private void sayHello(){
        System.out.println("hello");
    }

    public void work(){
        System.out.println("work");
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}


class ReflectPersonTest{

    public static void main(String[] args) throws Exception{
        testClassEqual();
//        testMethodClass();
//        testNewInstance();
    }

    public static void testNewInstance() throws Exception {
        Person p = new Person();
        Class class2 = p.getClass();
        Object o = class2.newInstance();
        //强转前先用instanceOf判断
        if(o instanceof Person){
            ((Person) o).work();
        }
    }

    public static  void testClassEqual() throws ClassNotFoundException {
        //1、对象调用getClass()方法来获取，通常应用在： 比如你传进来一个Object
        // 类型的对象,而我不知道你具体是什么类,用这种方法
        Person p = new Person();
        Class c1 = p.getClass();

        //通过类名.class方式获取,此方法最为安全可靠,性能高
        // 这说明任何一个类都有一个隐含的静态成员变量 class
        Class c2 = Person.class;


        //3、通过Class对象的forName()静态方法来获取,用的最多,但可能抛出ClassNotFoundException异常
        Class c3 = null;
        try {
            c3 = Class.forName("com.company.reflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //利用类的加载器
        ClassLoader classLoader = Person.class.getClassLoader();
        Class c4 = classLoader.loadClass("com.company.reflection.Person");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c4));
    }


    public static  void testMethodClass() throws Exception {
        Person p = new Person();
        p.setUsername("张三");
        p.setAge(18);
        p.setNick("小张");
        Class c3 = null;
        try {
            c3 = Class.forName("com.company.reflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取类完整名字
        System.out.println(c3.getName());
        //获取类的public类型属性
        Field[] fields = c3.getFields();
        for (Field field: fields){
            System.out.println("成员属性:"+field.getName()+",成员修饰符:"+field.getModifiers());
        }

        System.out.println("获取类的类的属性,并且设置为可以访问------------");
        System.out.println();
        //获取类的所有属性 把私有改成公有属性
        Field[] declaredFields = c3.getDeclaredFields();
        for (Field field: declaredFields){
            //获取原来的访问控制权限
            boolean accessible = field.isAccessible();
            if (!field.isAccessible()){
                field.setAccessible(true);
            }
            System.out.println("成员属性:"+field.getName()+",成员修饰符:"+field.getModifiers()+" 成员属性值: "+field.get(p));
            field.setAccessible(accessible);
        }

        System.out.println("获取类的方法---------------");
        Method method = c3.getMethod("work");
        System.out.println("获取类中的单个方法public修饰的方法名："+method.getName());
//        Method[] methods = c3.getMethods();
//        for (Method m : methods){
//            System.out.println("循环遍历获取public修饰的方法名："+m.getName());
//        }
        System.out.println("获取类的私有方法---------------");
        Method declaredMethod = c3.getDeclaredMethod("sayHello");
        System.out.println("获取类中的单个方法private修饰的方法名："+declaredMethod.getName());

        System.out.println("获取类的public修饰构造器----------");
        Constructor[] constructors = c3.getConstructors();
        System.out.println("constructors: " + constructors);

        Constructor constructor = c3.getConstructor(String.class, int.class);
        System.out.println("获取类中的public修饰的构造器："+constructor.getName());
        Person person = (Person) constructors[0].newInstance("lili", 1);
        System.out.println("person: "+person);

        Constructor con = c3.getDeclaredConstructor(String.class);
        //暴力访问私有构造方法
        con.setAccessible(true);
        System.out.println("获取类中的private修饰的构造器："+con.getName());
    }
}