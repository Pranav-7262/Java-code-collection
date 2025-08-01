package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubTrees {
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
    private static void printTreeNodeList(List<TreeNode> nodes) {
        for (TreeNode node : nodes) {
            System.out.println("Duplicate subtree root value: " + node.val);
        }
    }


    public static void main(String[] args) {
       TreeNode root = new TreeNode(2);
       root.left = new TreeNode(1);
       root.right = new TreeNode(1);

        List<TreeNode> duplicates = findDuplicateSubtrees(root);
        printTreeNodeList(duplicates);
    }
    static List<TreeNode> list = new ArrayList<>();
    static Map<String,Integer> map = new HashMap<>();
    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        list.clear();
        map.clear();
        helper(root);
        return list;
    }

    private static String helper(TreeNode root) {
        if (root == null){
            return "#";
        }
        String post = root.val + "," + helper(root.left) + "," + helper(root.right);
        map.put(post,map.getOrDefault(post,0)+1);
        if (map.get(post) == 2) {
            list.add(root);
        }
        return post;
    }

}
