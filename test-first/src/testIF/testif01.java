package testIF;

import javax.lang.model.util.ElementScanner6;

public class testif01 {
    public static void test(){
        int num = 1;
        int sum = 0;
        while (num++ <= 5) { //条件判断
            sum = sum + num;
            num++;
            System.out.println(num);
        }
        while ( num<=5){
            sum=sum+num;
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
    public static void main(String[] args) {
        /*byte num =10;
        if (num>=10){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
         */

//        byte score = 69;
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score>=70) {
//            System.out.println("C");
//        } else {
//            System.out.println("D");
//        }
        test();
    }
}












