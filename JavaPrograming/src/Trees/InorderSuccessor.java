package Trees;

import java.util.ArrayList;

public class InorderSuccessor {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
       TreeNode node = new TreeNode(2);
       node.left = new TreeNode(1);
       node.right = new TreeNode(3);

        System.out.println(inorderSuccessor(node,new TreeNode(2)));
    }
    public static int inorderSuccessor(TreeNode root, TreeNode x) {
        // add code here.
        TreeNode successor = null;

        while(root != null) {
            if(root.val <= x.val) {
                root = root.right;
            }else {
                successor = root;
                root = root.left;
            }
        }
        return successor == null ? -1 : successor.val;
    }
}
