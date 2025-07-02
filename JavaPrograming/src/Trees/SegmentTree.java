package Trees;

public class SegmentTree {

    public static class Node {
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        int value;

        public Node(int startInterval , int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    private Node root;

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        SegmentTree segmentTree = new SegmentTree(arr);
        segmentTree.display();
    }

    public SegmentTree(int [] arr) {
        //create a tree using this array !
        this.root = constructTree(arr , 0 , arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start,end);
            leaf.value = arr[start];
            return leaf;
        }
        //create a new node with index you are at :
        Node node  = new Node(start , end);
        int mid = (start + end) / 2;

        node.left =  this.constructTree(arr,start,mid);
        node.right =  this.constructTree(arr,mid+1,end);

        node.value = node.left.value + node.right.value;
        return node;
     }
     public void display() {
        display(this.root);
     }
     private void display(Node node) {
        String str = "";
        //for the left nodes  ->

        if (node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data : " + node.left.value + "=> ";
        } else {
            str = str + "No left child";
        }

        //for current nodes  ->
         if (node != null) {
             str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data : " + node.value + "=> ";
         }

         //for the right nodes  ->

         if (node.right != null) {
             str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data : " + node.right.value;
         } else {
             str = str + "No right child";
         }
         System.out.println(str + "\n");

         //call recursion ->
         if (node.left != null) {
             display(node.left);
         }
         if (node.right != null) {
             display(node.right);
         }

     }

}
