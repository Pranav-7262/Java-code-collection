package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectTreeRows {
    static class Node {
        int val;
        Node left, right, next;

        public Node(int val) {
            this.val = val;
            this.left = this.right = this.next = null;
        }
    }

    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();

                if (prev != null) {
                    prev.next = curr;
                }
                prev = curr;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }
        return root;
    }

    // Display the tree using next pointers level by level
    public void display(Node root) {
        Node levelStart = root;

        while (levelStart != null) {
            Node curr = levelStart;
            levelStart = null;

            while (curr != null) {
                System.out.print(curr.val + " -> ");
                if (levelStart == null) {
                    if (curr.left != null) levelStart = curr.left;
                    else if (curr.right != null) levelStart = curr.right;
                }
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ConnectTreeRows solution = new ConnectTreeRows();

        // Constructing the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        // Connect the nodes
        root = solution.connect(root);

        // Display the tree using next pointers
        System.out.println("Tree levels using 'next' pointers:");
        solution.display(root);
    }
}