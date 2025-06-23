package LL;

import java.util.ArrayList;
import java.util.Collections;

class ListNodeSort {
      int val;
    ListNodeSort next;
    ListNodeSort(int val){
        this.val = val;
        this.next = null;
    }

}
public class SortList {

    public ListNodeSort sortListSort(ListNodeSort head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNodeSort temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        ListNodeSort dummy = new ListNodeSort(0);
        ListNodeSort start = dummy;
        for (int val : list) {
            start.next = new ListNodeSort(val);
            start = start.next;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        ListNodeSort node1 = new ListNodeSort(4);
        ListNodeSort node2 = new ListNodeSort(2);
        ListNodeSort node3 = new ListNodeSort(1);
        ListNodeSort node4 = new ListNodeSort(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNodeSort s= node1;
        System.out.println("At Initial:");
    while (s!=null){
        System.out.print(s.val + " ");
        s = s.next;
    }
        SortList obj = new SortList();
        ListNodeSort sorted = obj.sortListSort(node1);
        System.out.println();
        System.out.println("Sorted List: ");

        while (sorted != null) {
            System.out.print(sorted.val + " ");
            sorted = sorted.next;
        }
    }
}