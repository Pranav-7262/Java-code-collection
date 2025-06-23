package LL;

class ListNodeRotate {
    int val;
    ListNodeRotate next;

    ListNodeRotate(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateList {
    public ListNodeRotate rotateRight(ListNodeRotate head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNodeRotate tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0) return head;

        ListNodeRotate newTail = head;
        for (int i = 1; i < Math.abs(length - k); i++) {
            newTail = newTail.next;
        }
        ListNodeRotate newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }

    public static void printList(ListNodeRotate head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNodeRotate head = new ListNodeRotate(1);
        head.next = new ListNodeRotate(2);
        head.next.next = new ListNodeRotate(3);
        head.next.next.next = new ListNodeRotate(4);
        head.next.next.next.next = new ListNodeRotate(5);

        System.out.println("Original List:");
        printList(head);

        RotateList solution = new RotateList();
        int k = 3; // Number of rotations
        ListNodeRotate rotatedList = solution.rotateRight(head, k);

        System.out.println("Rotated List:");
        printList(rotatedList);
    }
}

