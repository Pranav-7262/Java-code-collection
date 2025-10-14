package ADJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEx implements ActionListener  {
    JFrame jf;
    JButton button1 , button2;
    JLabel label;

    ActionEx() {
        jf = new JFrame("Button click events!");
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        label = new JLabel();
        jf.add(button1);
        jf.add(button2);
        jf.add(label);
        button1.addActionListener(this);
        button2.addActionListener(this);
        jf.setLayout(new FlowLayout(FlowLayout.CENTER,60,10));
        jf.setSize(250,150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Button1")){
            label.setText("You've clicked Button1");
            jf.add(label);
            jf.setVisible(true);
        }
        if (e.getActionCommand().equals("Button2")){
            label.setText("You've clicked Button2");
            jf.add(label);
            jf.setVisible(true);
        }
    }

    public static void main(String[] args) {
         new ActionEx();
    }
}
