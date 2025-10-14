package ADJ;

import javax.swing.*;

public class JTextAreaDemo extends JFrame {
    public JTextAreaDemo(){
        JFrame jf = new JFrame ("Jtext area example…");
        JTextArea jt = new  JTextArea();
        jt.setBounds(30,40,80,30);
        setBounds(50,100,70,30);
        add(jt);
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new JTextAreaDemo();
    }
}
