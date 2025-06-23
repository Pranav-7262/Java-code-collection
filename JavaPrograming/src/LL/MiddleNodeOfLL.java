package LL;

class ListNode3 {
    int val;
    ListNode4 next;

    ListNode3(int val) {
        this.val = val;
    }
}

class Solution2 {
    public ListNode4 middleNode(ListNode4 head) {
        // Using fast and slow pointers
        ListNode4 start = head; // Moves at 1x speed
        ListNode4 end = head;   // Moves at 2x speed
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
        }
        return start;
    }
}

public class MiddleNodeOfLL {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode4 head = new ListNode4(1);
        head.next = new ListNode4(2);
        head.next.next = new ListNode4(3);
        head.next.next.next = new ListNode4(4);
        head.next.next.next.next = new ListNode4(5);

        // Print the original list
        System.out.print("Original List: ");
        printList(head);

        // Call the middleNode method
        Solution2 solution = new Solution2();
        ListNode4 middle = solution.middleNode(head);

        // Print the middle node
        System.out.println("Middle Node: " + middle.val);
    }

    // Helper method to print a linked list
    public static void printList(ListNode4 head) {
        ListNode4 current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
