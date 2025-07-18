package Trees;

public class CountNodesEqualsAverage {
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
     TreeNode root = new TreeNode(3);
     root.left = new TreeNode(2);
     root.right = new TreeNode(5);

        System.out.println(averageOfSubtree(root));
    }
    static int count = 0;
    public static int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
    private static int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0,0};
        }
        int left[] = helper(root.left);
        int right[] = helper(root.right);

        int sum = left[0] + right[0] + root.val;
        int nodes = left[1] + right[1] + 1;

        int average = sum / nodes;

        if (root.val == average) {
            count++;
        }
        return new int[]{sum , nodes};
    }

}
