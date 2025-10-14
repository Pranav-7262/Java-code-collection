package ADJ;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {
    JTreeDemo(){
        JFrame jf = new JFrame();
        DefaultMutableTreeNode m = new DefaultMutableTreeNode("Main");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode s = new DefaultMutableTreeNode("Style");
        m.add(c);
        m.add(s);
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode   c3 = new DefaultMutableTreeNode("Blue");
        c.add(c1);
        c.add(c2);
        c.add(c3);
        DefaultMutableTreeNode  s1 = new DefaultMutableTreeNode ("Time New Roman");
        DefaultMutableTreeNode  s2 = new DefaultMutableTreeNode ("Ariel");
        s.add(s1);
        s.add(s2);
        JTree  t = new JTree(m);
        jf.add(t);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }
    public static void main(String[] args) {
        new JTreeDemo();
    }
}
