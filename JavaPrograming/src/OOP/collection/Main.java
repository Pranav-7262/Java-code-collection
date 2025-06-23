package OOP.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();//Arraylist is more faster than others
        list1.add(23);
        list1.add(26);
        list1.add(67);
        System.out.println(list1);

        List<Integer>list2 = new LinkedList<>();
        list2.add(23);
        list2.add(26);
        list2.add(57);
        System.out.println(list2);

        List<Integer>vector = new Vector<>();
        vector.add(35);
        vector.add(45);
        vector.add(2,4);
        System.out.println(vector);
    }
}
