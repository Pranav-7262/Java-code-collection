package Trees;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestEleTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(TreeNode left , TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(10);

        System.out.println(kthSmallest(root,4));
    }
    public static int kthSmallest(TreeNode root, int k) {
//        List<Integer> res =  inorderTraversal(root);
//        return res.get(k-1);
//    }
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//
//        inOrder(root, ans);
//        return ans;
//    }
//    static void inOrder(TreeNode node, List<Integer> ans) {
//        if(node != null) {
//            inOrder(node.left , ans);
//            ans.add(node.val);
//            inOrder(node.right , ans);
//        }

        //call function

        count = 0;
        TreeNode result = helper(root, k);
        return (result != null) ? result.val : -1;
    }
    static int count = 0;
    public static TreeNode helper(TreeNode root , int k) {
        if (root == null)  return null;

        TreeNode left = helper(root.left,k);
        if (left  != null) {
            return left;
        }
        count++;

        if (count == k){
            return root;
        }
        return helper(root.right,k);
    }

}
