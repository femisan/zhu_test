package testIF;

import com.sun.source.tree.Scope;

import java.util.SortedMap;

public class testFuzhi {
    int num = 20;
    int[] arr = {1,23,2};

    public static void main(String[] args) {
//        int[] aaa = {1,2,3,4,5};
//        for(int a: aaa){
//            System.out.println(a);
//        }
        int num=10;
        testFuzhi z = new testFuzhi();
        System.out.println(z.num);
        z.addNum(3);
        System.out.println(z.num);
        int[] arr = {233,233,333};
        for(int a:arr){

            System.out.println(a);
        }
    }
    public void addNum(int num){
        this.num += num;
    }

}
