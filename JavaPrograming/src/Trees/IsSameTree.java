package Trees;

import com.sun.source.tree.Tree;

public class IsSameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(TreeNode left,TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
           TreeNode root1 = new TreeNode(1);
           root1.left = new TreeNode(2);
           root1.right = new TreeNode(3);

           TreeNode root2 = new TreeNode(1);
           root2.left = new TreeNode(2);
           root2.right = new TreeNode(3);

        System.out.println(isSameTree(root1,root2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
