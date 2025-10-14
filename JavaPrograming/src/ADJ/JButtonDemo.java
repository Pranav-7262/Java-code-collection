package ADJ;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo extends JFrame {
    public JButtonDemo() {
        JButton button = new JButton("Example 1");
        JButton button2 = new JButton("Example 2");
        setLayout(new FlowLayout());
        add(button);
        add(button2);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
         new JButtonDemo();
    }
}
