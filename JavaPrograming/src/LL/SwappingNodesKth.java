package LL;

class SwappingNodesKth {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        ListNode slow = head;
        while (slow != null) {
            length++;
            slow = slow.next;
        }
        slow = head;
        ListNode fast = null;
        for (int i = 1; i < k; i++) {
            slow = slow.next;
        }
        fast = slow;
        slow = head;
        for (int i = 0; i < length - k; i++) {
            slow = slow.next;
        }
        ListNode second = slow;
        int temp = fast.val;
        fast.val = second.val;
        second.val = temp;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SwappingNodesKth obj = new SwappingNodesKth();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        int k = 1;
        head = obj.swapNodes(head, k);

        System.out.println("List after swapping " + k + "th nodes from start and end:");
        printList(head);
    }
}