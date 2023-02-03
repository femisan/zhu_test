package testfeng;

public class Girl {
    private int age;
//    public int getAge() {
//        return age;
//    }

    public int setAge(int age) {
        if(age<0){
            return age;
        }
        this.age = age;
        return age;
    }
        public Girl(){}
    /*public Girl(int a){
        age =a;
    }*/
}
