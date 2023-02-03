import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Objects;

class Animal{
    public static void ppp(){
        System.out.println("GRRRR");
    }
    protected void print(){
        System.out.println("AAAA");
    }
}
interface bbb{
    void zzz();
}
 class A extends Animal {
   public void zzz(){};

}

class B extends Animal {}


public class TestClassStatic {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = null;
        a.equals(b);
//       Animal obj1 = new A();
//       A obj2 = new A();
//       Animal obj3 = (Animal) obj2;
//       Animal obj4 = (A)obj1;
    }

}
