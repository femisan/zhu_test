package testfeng;

class Foo{
    int x;
    int y;
    public void print(){};
    public void method(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class MyClass extends Foo{
    int saa;
    int bbb;
    public void print(){
        System.out.println("x, y "+ x +" " + y);
    }

}

public class testChildClass {
    public static void main(String[] args) {
        Foo f = new MyClass();
//        MyClass sub = (MyClas5c s) new Foo();
        f.method(10,20);
        f.print();
        int num2 = 100;
        method(num2);

    }
    static void method(long num){
        System.out.println("short");
    }
}
