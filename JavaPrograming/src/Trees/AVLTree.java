package Trees;

public class AVLTree {
    public AVLTree() {
    }

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

    public int height() {
        return height(root);
    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);  //recursive call for small num than parent
        }
        if (value > node.value) {
            node.right = insert(value, node.right);  //recursive call for big num than parent
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                //left-left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            //right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                //right-right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                //right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;
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

    public void populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void populateSorted(int[] arr) {
        populateSorted(arr, 0, arr.length);
    }

    private void populateSorted(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
//        for (int i = 0; i < 1000; i++) {
//            avl.insert(i);
//        }
        int [] arr = {10,9,8,7,12,6};
       for (int n : arr) {
           avl.insert(n);
       }
        System.out.println(avl.height());
        avl.display();
    }
}

