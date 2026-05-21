package Collection.Sorting;

import java.util.*;

public class CollectionsSortComparatorOperatorInString {
    public static void main(String[] args) {

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if(i.length() > j.length()) return 1;
                else return -1;
            }
        };

        List<String> list = new ArrayList<>();
        list.add("Prathmesh");
        list.add("Sarthak");
        list.add("Tanmay");
        list.add("Dhiraj");
        list.add("Aastha");
        list.add("Dharmendra_Puri");
        list.add("Pankaja Bai");

        Collections.sort(list , c);
        System.out.println(list);


    }
}
