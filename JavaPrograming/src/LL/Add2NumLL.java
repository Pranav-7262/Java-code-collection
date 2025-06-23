package LL;

class ListNodeAdd2 {
    int val;
    ListNodeAdd2 next;

    ListNodeAdd2(int val){
        this.val = val;
    }
    ListNodeAdd2(int val,ListNodeAdd2 next){
        this.val = val;
        this.next = next;
    }
}



public class Add2NumLL {
    public ListNodeAdd2 addTwoNumbers(ListNodeAdd2 l1, ListNodeAdd2 l2) {
        // Step 1: Reverse both linked lists
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        // Step 2: Add the reversed lists
        ListNodeAdd2 dummy = new ListNodeAdd2(0);
        ListNodeAdd2 curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;

            curr.next = new ListNodeAdd2(sum % 10);
            carry = sum / 10;
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Step 3: Reverse the result to get the final answer
        return reverseList(dummy.next);
    }

    // Helper function to reverse a linked list
    private ListNodeAdd2 reverseList(ListNodeAdd2 head) {
        ListNodeAdd2 prev = null;
        while (head != null) {
            ListNodeAdd2 next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        // Create the first linked list: 2 -> 4 -> 3
        ListNodeAdd2 l1 = new ListNodeAdd2(2);
        l1.next = new ListNodeAdd2(4);
        l1.next.next = new ListNodeAdd2(3);

        // Create the second linked list: 5 -> 6 -> 4
        ListNodeAdd2 l2 = new ListNodeAdd2(5);
        l2.next = new ListNodeAdd2(6);
        l2.next.next = new ListNodeAdd2(4);

        // Solve the problem
        Add2NumLL solution = new Add2NumLL();
        ListNodeAdd2 result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}

