package testClasses;


 class Test11a  {
    private String msg;
    public Test11a(){ this("Good");}
    public Test11a(String msg) {msg = msg;}
    public String toString(){ return ("msg "+ msg);}
//    public int hashCode(){
//        return 123213;
//    }

    public static void main(String[] args) {
//        String a = String.valueOf(new Test11a());
        System.out.println(new Test11a());
    }
}
