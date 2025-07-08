package Trees;


public class CousinsInTree {
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
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.left.right = new TreeNode(4);
         root.right = new TreeNode(3);
         root.right.right = new TreeNode(5);

        System.out.println(isCousins(root,5,4));
    }
    public static boolean isCousins(TreeNode root , int x , int y) {
         TreeNode first = findNode(root , x);
         TreeNode second = findNode(root , y);

         return (
                 (level(root,first,0) == level(root,second,0)) && (!isSibling(root,first,second))
                 );

    }

    private static int level(TreeNode node, TreeNode x, int lev) {
        if (node == null) {
            return 0;
        }
        if (node==x) {
            return lev;
        }
        int level = level(node.left,x,lev+1);
        if (level!=0) {
            return level;
        }
        return level(node.right,x,lev+1);
    }

    private static boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }
        return (
                (node.left == x && node.right==y) ||  (node.left == y && node.right==x) ||
                isSibling(node.left,x,y) || isSibling(node.right,x,y)
                );
    }
    private static TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        TreeNode check = findNode(node.left,x);
        if (check!=null) {
            return check;
        }
        return findNode(node.right,x);
    }
}
