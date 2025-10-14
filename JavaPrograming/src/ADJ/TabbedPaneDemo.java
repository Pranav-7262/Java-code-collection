package ADJ;

import javax.swing.*;

public class TabbedPaneDemo {
    public TabbedPaneDemo(){
        JFrame f = new JFrame();
        JTabbedPane jt =new JTabbedPane ();
        JPanel  p1 = new JPanel();
        JLabel l = new JLabel("Welcome…….");
        p1.add(l);
        jt.add("First Tab",p1);
        JPanel  p2 = new JPanel();
        JTextField t = new JTextField("SITCOE…….");
        p2.add(t);
        jt.add("Second Tab",p2);
        f.add(jt);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}
