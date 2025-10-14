package ADJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame  extends JFrame implements KeyListener, ActionListener {
    JTextField tf;
    JLabel lbl;
    JButton btn;

    MyFrame(){

        lbl = new JLabel();
        lbl.setBounds(100, 200, 150, 250);
        tf = new JTextField(15);
        tf.addKeyListener(this);
        btn = new JButton("Clear");
        btn.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(tf);
        panel.add(btn);
        setLayout(new BorderLayout());
        add(lbl, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("hello");

    }

    @Override
    public void keyTyped(KeyEvent e) {
        lbl.setText("You have typed "+e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        lbl.setText("You have pressed "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        lbl.setText("You have released "+e.getKeyChar());

    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
