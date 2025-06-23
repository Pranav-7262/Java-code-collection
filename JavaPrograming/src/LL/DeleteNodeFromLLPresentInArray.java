package LL;

import java.util.HashMap;
import java.util.HashSet;

class DeleteNodeFromLLPresentInArray {
    public static class ListNodeDel {
        int val;
        ListNodeDel next;

        ListNodeDel(int val) {
            this.val = val;
        }

        ListNodeDel(int val, ListNodeDel next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNodeDel modifiedList(ListNodeDel head, HashSet<Integer>nums) {
    if (head == null) {
        return null;
    }
    ListNodeDel dummy = new ListNodeDel(-1);
    dummy.next = head;
    ListNodeDel curr = dummy;
    while (curr.next!=null) {
        if(nums.contains(curr.next.val)){
            curr.next = curr.next.next;

        }
        else {
            curr = curr.next;
        }
    }
  return dummy.next;

    }
    public static void printList(DeleteNodeFromLLPresentInArray.ListNodeDel head) {
        DeleteNodeFromLLPresentInArray.ListNodeDel temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DeleteNodeFromLLPresentInArray obj = new DeleteNodeFromLLPresentInArray();
        ListNodeDel head = new ListNodeDel(1);
        head.next = new ListNodeDel(2);
        head.next.next = new ListNodeDel(3);
        head.next.next.next = new ListNodeDel(4);
        head.next.next.next.next = new ListNodeDel(5);

        HashSet<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(4);
        System.out.println("Original list:");
        printList(head);
        head = modifiedList(head,nums);
        System.out.println("updated list");
        printList(head);
    }
}