package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
    public static void main(String[] args) {
        //creating
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set1 = new HashSet<>();


        //Insert (only contain unique elements)
        set.add(1);
        set.add(2);
        set.add(3);
//        set.add(1);

        //size
        System.out.println("The size of set is "+ set.size());

        //Print
        System.out.println(set);
        if (!set.add(4)){
            set.add(4);
        }
        System.out.println(set);

        //Iterator (sets are in  un-order manner)
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)){
            System.out.println("does not contain 6!!");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contains 1!!");
            System.out.println(set.toArray());

        }
    }
}
