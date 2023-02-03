package testfeng;

import java.util.ArrayList;


public class testList {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(10);
        array.add(0); array.add(1); array.add(3);
        System.out.println(array.get(array.size()));
    }
}
