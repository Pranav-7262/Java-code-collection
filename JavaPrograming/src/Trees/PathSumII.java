package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        int targetSum = 7;
        System.out.println(pathSum(root,targetSum));
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        hasPathSum( root , result ,list , targetSum);
        return result;
    }

    private static void hasPathSum(TreeNode root, List<List<Integer>> result, List<Integer> list, int targetSum) {
        if (root == null) return;
        list.add(root.val);

        if (root.val == targetSum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
        int remainsSum = targetSum - root.val;

        hasPathSum(root.left,result,list,remainsSum);
        hasPathSum(root.right,result,list,remainsSum);

        list.remove(list.size()-1);
    }
}
