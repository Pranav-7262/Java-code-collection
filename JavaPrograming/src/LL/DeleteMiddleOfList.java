package LL;

class ListNode4 {
    int val;
    ListNode4 next;

    ListNode4(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode4 deleteMiddle(ListNode4 head) {
        if (head == null || head.next == null) {
            return null; // If the list is empty or has only one node, return null
        }

        ListNode4 slow = head;
        ListNode4 fast = head;
        ListNode4 prev = null;

        // Use two pointers to find the middle node
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Remove the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}

public class DeleteMiddleOfList {
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

        // Call the deleteMiddle method
        Solution solution = new Solution();
        head = solution.deleteMiddle(head);

        // Print the modified list
        System.out.print("Modified List: ");
        printList(head);
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

