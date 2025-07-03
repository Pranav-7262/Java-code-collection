package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelDisplay {
        public static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            public TreeNode(int val) {
                this.val = val;
            }
            public TreeNode(int val, TreeNode left,  TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        public static void main(String[] args) {
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);

            System.out.println("Average of each level => " + averageOfLevels(root));
        }
        public static List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new ArrayList<>();

            if (root == null) {
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()) {
                int levelSize = queue.size();
                Double levelAverage = (double) 0;
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode = queue.poll();
                    levelAverage += currentNode.val;
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                levelAverage = levelAverage / levelSize;
                result.add(levelAverage);
            }

            return result;
        }
//

}
