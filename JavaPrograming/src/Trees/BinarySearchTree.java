package Trees;

public class BinarySearchTree {
    public BinarySearchTree() {}
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root==null;
    }
    public void insert(int value) {
        root = insert(value , root);
    }
    private Node insert(int value , Node node) {
        if (node == null ) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value,node.left);  //recursive call for small num than parent
        }
        if (value  > node.value) {
            node.right = insert(value,node.right);  //recursive call for big num than parent
        }
        node.height = Math.max(height(node.left) , height(node.right)) + 1;
        return node;
    }
    public String isBalancedTree() {
        return isBalanced(root) ? "Tree is Balanced" : "Tree is not Balanced";
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }
    public void populateSorted(int []arr) {
        populateSorted(arr , 0 , arr.length);
    }
    private void populateSorted(int []arr , int start , int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end)/2;
        this.insert(arr[mid]);
        populateSorted(arr,start,mid);
        populateSorted(arr,mid+1,end);
    }
    public void display() {
        display(this.root , "Root value : ");
    }
    private void display(Node node , String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left , "Left of "+node.value +" : ");
        display(node.right , "Right of "+node.value +" : ");
    }
    //traversals --------->

    public void preOrder(){
        System.out.println("Preorder traversal : ");
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "-> ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        System.out.println("Inorder traversal : ");
        inOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " -> ");
        inOrder(node.right);
    }
    public void postOrder(){
        System.out.println("Postorder traversal : ");
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " -> ");
    }

    //main method ---------->

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int [] arr = {12,13,14,15,17};
        System.out.println("Numbers to add : ");
        System.out.println();
        for (int num : arr) {
            System.out.print("  "+num);
        }
        System.out.println();
//        bst.populate(arr);
      bst.populateSorted(arr); // this populates a tree divide and conquer wise or BS , used for sorted arr
        bst.display();
        System.out.println();
        System.out.println(bst.isBalancedTree());
        System.out.println();
        System.out.println("traversals :");
        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
    }
}
