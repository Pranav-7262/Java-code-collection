package ADJ;

import javax.swing.*;

public class JCheckBoxDemo {
    public JCheckBoxDemo() {
        JFrame jf = new JFrame();
        JCheckBox c1 = new JCheckBox("C",true);
        c1.setBounds(100,50,70,30);
        JCheckBox c2 = new JCheckBox("CPP");
        c2.setBounds(100,90,70,30);
        JCheckBox c3 = new JCheckBox("Java");
        c3.setBounds(100,150,70,30);
         jf.add(c1);
         jf.add(c2);
         jf.add(c3);
         jf.setVisible(true);
         jf.setSize(500,500);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JCheckBoxDemo();
    }
}
