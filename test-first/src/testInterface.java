interface MyInter1{
    double methodA(int num);
    default void methodB(){
        System.out.println("mehtodB");
    }
    static void methodD(){
        System.out.println("mehtod D");
    }
}

interface MyInter2{
    int mehtodC(int val1, int val2);
    static void methodD(){
        System.out.println("mehtod D");
    }
}
class MyClass implements MyInter1,MyInter2{
    public double methodA(int num){return num*0.3;}
    public int mehtodC(int val1, int val2){return val1 + val2;}
}

abstract class SuperClass{
    static void method(){
        System.out.println("abstract ");
    };
}

class SubClass extends SuperClass{

}



public class testInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodB();
        MyInter2.methodD();
        SubClass obj2 = new SubClass();
//        MyClass.methodD();
        SubClass.method();
    }

}
