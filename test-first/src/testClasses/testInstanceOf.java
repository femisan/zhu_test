package testClasses;

import testfeng.Test;

class Parent{}
class Child extends Parent{
    int num;
}
public class testInstanceOf {
    public void check(Parent p){
        if (p instanceof Child){
            System.out.println("aaa");
        }
        if(p instanceof Parent){
            System.out.println("bbb");
        }
//        System.out.println(p.num);
    }

    public static void main(String[] args) {
        Parent p = new Child();
        new testInstanceOf().check(p);
    }
}
