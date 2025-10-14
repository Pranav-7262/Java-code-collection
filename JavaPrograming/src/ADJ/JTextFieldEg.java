package ADJ;

import javax.swing.*;

public class JTextFieldEg extends JFrame {
    public JTextFieldEg(){
        JTextField jt = new JTextField("Welcome in AJP..");
        jt.setBounds(50,100,70,30);
        add(jt);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new JTextFieldEg();

    }
}
