package testIF;

public class Person {//类
   String name;
    int age;
    double height;

    public void study() {//方法method
        System.out.println("shui");
    }

    public Person() {//保证空构造器的存在
        System.out.println("空构造器");
    }

    public Person(int a, String b, double c) {
        age=a;
        name=b;
        height=c;
    }

    public static void main(String[] args) {
        /*Person p1 = new Person();
        p1.name = "zhao";
        p1.age = 30;
        p1.height = 160.3;
        System.out.println(p1.age);
        System.out.println(p1.name);
        p1.study();*/
        Person p = new Person(18, "lu", 150.4);
        System.out.println(p.age);
        Person p2 =new Person();
    }
}
