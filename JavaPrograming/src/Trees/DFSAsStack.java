package Trees;

import java.util.*;

public class DFSAsStack {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(TreeNode left , TreeNode right){
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(dfsTraversal(root)) ;
    }
    public static List<Integer> dfsTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            int n = stack.size();
            for (int i = 0; i < n; i++) {
                TreeNode curr = stack.pop();
                list.add(curr.val);

                if (curr.right != null){
                    stack.push(curr.right);
                }
                if (curr.left != null){
                    stack.push(curr.left);
                }
            }
        }
        return list;
    }

}
