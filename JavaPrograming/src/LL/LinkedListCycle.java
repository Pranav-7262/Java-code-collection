package LL;

class ListNodecycle {
    int val;
    ListNodecycle next;

    ListNodecycle(int val) {
        this.val = val;
    }
}

class Solutioncycle {
    public ListNodecycle middleNode(ListNodecycle head) {
        // Using fast and slow pointers
        ListNodecycle start = head; // Moves at 1x speed
        ListNodecycle end = head;   // Moves at 2x speed
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
        }
        return start;
    }

    public boolean hasCycle(ListNodecycle head) {
        ListNodecycle f = head;
        ListNodecycle s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }
        }
        return false;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNodecycle head = new ListNodecycle(1);
        head.next = new ListNodecycle(2);
        head.next.next = new ListNodecycle(3);
        head.next.next.next = new ListNodecycle(4);
        head.next.next.next.next = new ListNodecycle(5);

        // Print the original list
        System.out.print("Original List: ");
        printList(head);

        // Call the middleNode method
        Solutioncycle solution = new Solutioncycle();
        ListNodecycle middle = solution.middleNode(head);

        // Print the middle node
        System.out.println("Middle Node: " + middle.val);

        // Check for a cycle
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("Has Cycle: " + hasCycle);

        // Create a cycle for testing
        head.next.next.next.next = head.next;
        hasCycle = solution.hasCycle(head);
        System.out.println("Has Cycle (after introducing a cycle): " + hasCycle);
    }

    // Helper method to print a linked list
    public static void printList(ListNodecycle head) {
        ListNodecycle current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

