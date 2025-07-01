package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinaryTree {
    public  BinaryTree() {

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    //populate function ->
    public void populate(Scanner scanner)  {
        System.out.println("Enter Root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner , root);
    }
     public void populate(Scanner scanner , Node node) {
         System.out.println("Do you want to enter left of "+ node.value);
         boolean left = scanner.nextBoolean();
         if(left) {
             System.out.println("Enter value for left of " +node.value );
             int value = scanner.nextInt();
             node.left = new Node(value);
             populate(scanner , node.left); // this is a recursive call for the left side node about wanted left of this node or not !!
         }
         System.out.println("Do you want to enter right of "+ node.value);
         boolean right = scanner.nextBoolean();
         if(right) {
             System.out.println("Enter value for right of " +node.value );
             int value = scanner.nextInt();
             node.right = new Node(value);
             populate(scanner , node.right); // this is a recursive call for the right side node about wanted right of this node or not !!
         }
     }
     public void display() {
        display(root ,"");
     }
     private void display(Node node , String space){
        if (node==null) {
            return;
        }
         System.out.println(space+ node.value);
        display(node.left ,space + "\t" );
        display(node.right , space + "\t");
     }
     public void prettyDisplay() {
         System.out.println();
         System.out.println("Pretty display : ");
         System.out.println();
        prettyDisplay(root , 0);
     }
     private void prettyDisplay(Node node , int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right,level+1);
        if (level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value );
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left , level+1);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.prettyDisplay();

    }

}
