package LL;

class ListNode {
    int val;
    ListNodecycle next;

    ListNode(int val) {
        this.val = val;
    }
}
class SolutionLL {
    public ListNodecycle reverseList(ListNodecycle head) {
        ListNodecycle prev = null;
        ListNodecycle present = head;

        while (present != null) {
            ListNodecycle next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }

        return prev;
    }
}

public class ReverseLL {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNodecycle head = new ListNodecycle(1);
        head.next = new ListNodecycle(2);
        head.next.next = new ListNodecycle(3);
        head.next.next.next = new ListNodecycle(4);
        head.next.next.next.next = new ListNodecycle(5);
        printList(head);
        SolutionLL solution = new SolutionLL();
        head = solution.reverseList(head);
        printList(head);
    }
    public static void printList(ListNodecycle head) {
        ListNodecycle current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


