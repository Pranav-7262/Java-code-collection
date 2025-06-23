//package LL;
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int val) {
//        this.val = val;
//        this.next = null;
//    }
//}
//
//public class RemoveDuplicates {
//    public ListNode1 deleteDuplicates(ListNode1 node) {
//        if (node == null) return node;
//        ListNode1 head = node;
//        while (node.next != null) {
//            if (node.val == node.next.val) {
//                node.next = node.next.next; // Skip the duplicate node
//            } else {
//                node = node.next; // Move to the next node
//            }
//        }
//        return head;
//    }
//
//    public static void main(String[] args) {
//        // Create a sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
//        ListNode1 head = new ListNode1(1);
//        head.next = new ListNode1(1);
//        head.next.next = new ListNode1(2);
//        head.next.next.next = new ListNode1(3);
//        head.next.next.next.next = new ListNode1(3);
//
//        // Print the original list
//        System.out.println("Original list:");
//        printList(head);
//
//        // Call the deleteDuplicates method
//        RemoveDuplicates solution = new RemoveDuplicates();
//        ListNode1 result = solution.deleteDuplicates(head);
//
//        // Print the modified list
//        System.out.println("List after removing duplicates:");
//        printList(result);
//    }
//
//    // Helper method to print a linked list
//    public static void printList(ListNode1 node) {
//        while (node != null) {
//            System.out.print(node.val + " -> ");
//            node = node.next;
//        }
//        System.out.println("null");
//    }
//}
//
