package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeElementsFromTrees {
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
         TreeNode root1 = new TreeNode(2);
         root1.left = new TreeNode(1);
         root1.right = new TreeNode(4);

         TreeNode root2 = new TreeNode(1);
         root2.left = new TreeNode(0);
         root2.right = new TreeNode(3);

        System.out.println(getAllElements(root1,root2));

    }
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        inorder(root1, l1);
        inorder(root2, l2);

        for (int n : l1) {
            if(l2.contains(n)){
                result.add(n);
            }
        }

        return result;

    }
    private static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
       if(!list.contains(root.val)) {
           list.add(root.val);
       }
        inorder(root.right, list);
    }

}
