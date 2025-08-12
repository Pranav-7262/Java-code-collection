package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeInTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }

    }
    private static Integer prev = null;
    private static int count = 0;
    private static int maxCount = 0;
    private static List<Integer>  list = new ArrayList<>();

    public static void main(String[] args) {
   TreeNode root = new TreeNode(1);
   root.right = new TreeNode(2);
   root.right.left = new TreeNode(2);
        System.out.println(Arrays.toString(findMode(root)));
    }
    public static int[] findMode(TreeNode root) {
        inOrder(root);
        int []res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    private static void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);
        if(prev != null){
            if(root.val == prev){
                count++;
            }else{
                count = 1;
            }
        } else{
            count=1;
        }
        if(count > maxCount){
            maxCount = count;
            list.clear();
            list.add(root.val);
        } else if(count == maxCount){
            list.add(root.val);
        }
        prev = root.val;
        inOrder(root.right);
    }

}
