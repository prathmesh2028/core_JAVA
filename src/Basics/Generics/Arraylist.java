package Basics.Generics;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(3);
        al.add(100);
        al.add(498);
        al.add(33);
        al.add(24);
        al.add(24);
//        int[] a = new int[999999999]; // this gives us memory out error
//        System.out.println(al.capacity()); error

//        System.out.println(al.get(0));
//        al.set(0,44);
//        for(int i:al) System.out.println(i);
////        al.remove(0);
//        for(int i:al) System.out.println(i);


        System.out.println(al.contains(24));
        System.out.println(al.indexOf(24));
        System.out.println(al.lastIndexOf(24));
        System.out.println(al.size());
        System.out.println(al.isEmpty());

    }
}
