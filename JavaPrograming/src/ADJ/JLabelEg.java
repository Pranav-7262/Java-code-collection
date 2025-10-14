package ADJ;

import javax.swing.*;

public class JLabelEg {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Jlabel exmaple");
        JLabel l1,l2;
        l1 = new JLabel("first label");
        l1.setBounds(70,50,100,30);
        l2 = new JLabel("second label");
        l2.setBounds(60,100, 100,30);
        frame.add(l1);
        frame.add(l2);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
