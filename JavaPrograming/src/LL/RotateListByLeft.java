package LL;

public class RotateListByLeft {
    public static class Node {
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original List:");
        printList(head);
        int k = 6; // Number of rotations
        Node node = rotate(head,k);

        System.out.println("Rotated List:");
        printList(node);
    }
    public static Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null || k==0){
            return head;
        }
        Node tail = head;
        int len = 1;
        while(tail.next != null) {
            tail = tail.next;
            len++;
        }
        k = k%len;
        if(k == 0) return head;
        Node newTail = head;
        for(int i=1;i<k;i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
