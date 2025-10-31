package Trees;

import java.util.ArrayList;

public class CollectOddLevelNodes {
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
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println("Odd level nodes are => "+ nodesAtOddLevels(root));
    }
    public static ArrayList<Integer> nodesAtOddLevels(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        collectOddLevelNodes(root, 1, result); // start with level 1
        return result;
    }

    private static void collectOddLevelNodes(TreeNode node, int level, ArrayList<Integer> list) {
        if (node == null) return;

        if ((level & 1) == 1) {
            list.add(node.val);
        }
        collectOddLevelNodes(node.left, level + 1, list);
        collectOddLevelNodes(node.right, level + 1, list);
    }

}
