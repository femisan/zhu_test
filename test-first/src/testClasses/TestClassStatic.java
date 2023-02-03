package testClasses;

class Animal{
    public static void ppp(){
        System.out.println("GRRRR");
    }
}
class Cow extends Animal {
    public static void ppp() {
        System.out.println("GGGAAA");
    }
}
public class TestClassStatic {
    public static void main(String[] args) {
//        Cow cow = (Cow) new Animal();
        Animal[] animals = {  new Animal(), new Cow()};
        for(Animal b : animals){
            b.ppp();
        }
        new Cow().ppp();
    }

}
