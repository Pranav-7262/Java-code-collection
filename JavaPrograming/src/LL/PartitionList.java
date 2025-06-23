package LL;

class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode more = new ListNode(-1);
        ListNode curr = head;
        ListNode t1 = less;
        ListNode t2 = more;

        while (curr != null) {
            if (curr.val < x) {
                t1.next = curr;
                t1 = t1.next;
            } else {
                t2.next = curr;
                t2 = t2.next;
            }
            curr = curr.next;
        }

        t1.next = more.next;
        t2.next = null;
        return less.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PartitionList obj = new PartitionList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        System.out.println("Original List:");
        printList(head);

        int x = 3;
        ListNode newHead = obj.partition(head, x);

        System.out.println("Partitioned List:");
        printList(newHead);
    }
}

