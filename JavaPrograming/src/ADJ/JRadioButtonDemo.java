package ADJ;

import javax.swing.*;

public class JRadioButtonDemo {
    public JRadioButtonDemo(){
        JFrame f = new JFrame();
        JRadioButton r1 =new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton ("Female");
        r1.setBounds(50,60,70,40);
        r2.setBounds(50,110,70,40);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
