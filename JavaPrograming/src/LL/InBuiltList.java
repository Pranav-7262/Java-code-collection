package LL;

import java.util.LinkedList;

public class InBuiltList {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(45);
        list.add(67);
        list.add(34);
        list.add(23);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.getLast());
    }
}
