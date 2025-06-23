package LL;

class DeleteNodeInLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Cannot delete the last node with this approach.");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Deleting node with value 3 (We provide reference to node 3)
        ListNode nodeToDelete = head.next.next; // Node with value 3
        DeleteNodeInLL obj = new DeleteNodeInLL();
        obj.deleteNode(nodeToDelete);

        System.out.println("List after deleting node with value 3:");
        printList(head);
    }
}

