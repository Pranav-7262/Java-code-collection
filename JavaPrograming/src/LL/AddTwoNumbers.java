package LL;


class ListNodeAdd {
    int val;
    ListNodeAdd next;

    // Default constructor



    ListNodeAdd(int val) {
        this.val = val;
    }


    ListNodeAdd(int val, ListNodeAdd next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNodeAdd addTwoNumbers(ListNodeAdd l1, ListNodeAdd l2) {
        ListNodeAdd head = null; // Head of the resulting linked list
        ListNodeAdd temp = null; // Temporary pointer to build the list
        int carry = 0;        // Variable to hold the carry value

        // Loop until both lists are exhausted and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from the nodes, or 0 if the node is null
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;

            // Calculate the sum and the carry
            int value = val1 + val2 + carry;
            ListNodeAdd Node = new ListNodeAdd(value % 10); // Create a new node with the digit
            carry = value / 10;                      // Update the carry


            if (head == null) {
                head = Node;
                temp = Node;
            } else {
                temp.next = Node;
                temp = temp.next;
            }

            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return head; // Return the head of the resulting list
    }

    public static void main(String[] args) {
        // Create the first linked list: 2 -> 4 -> 3
        ListNodeAdd l1 = new ListNodeAdd(2);
        l1.next = new ListNodeAdd(4);
        l1.next.next = new ListNodeAdd(3);

        // Create the second linked list: 5 -> 6 -> 4
        ListNodeAdd l2 = new ListNodeAdd(5);
        l2.next = new ListNodeAdd(6);
        l2.next.next = new ListNodeAdd(4);

        // Solve the problem
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNodeAdd result = solution.addTwoNumbers(l1, l2);

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

