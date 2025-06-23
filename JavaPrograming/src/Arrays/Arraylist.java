package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {//store in heap
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();//arraylist of Integers
        //add element
        list.add(0);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(8);
        System.out.println(list);


        //get element
        int element=list.get(0);
        System.out.println(element);
        int ans=list.get(4);
        System.out.println(ans);

        //Add between
        list.add(1,100);
        System.out.println(list);

        //addlast
        list.addLast(122);
        System.out.println(list);

        //set element
        list.set(0,9);
        System.out.println(list);



        //delete elements
        list.remove(1);
        System.out.println(list);

        //size
        int size= list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

        list.add(100);
        System.out.println(list);

        list.remove(7);
        System.out.println(list);

        list.get(4);
        System.out.println(list);
        
    }
}
