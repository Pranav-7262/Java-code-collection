package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BalanceBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;

        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);


        System.out.println("Before balancing tree : ");
        printTree(root);
        TreeNode balance = balanceBST(root);
        System.out.println("After  balancing tree : ");
        printTree(balance);
    }
    static List<Integer> list = new ArrayList<>();
    public static TreeNode balanceBST(TreeNode root) {
        inOrder(root , list);
        return BalancedBST(0, list.size() - 1);
    }
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Empty tree.");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at current level

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current != null) {
                    System.out.print(current.val + " ");
                    queue.offer(current.left);
                    queue.offer(current.right);
                } else {
                    System.out.print("null ");
                }
            }
            System.out.println(); // Next level
        }
    }

    private static TreeNode BalancedBST(int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = BalancedBST(left,mid-1);
        node.right = BalancedBST(mid+1,right);
        return node;
    }

    private static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

}