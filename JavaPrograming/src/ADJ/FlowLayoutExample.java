package ADJ;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);


        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));


        frame.setVisible(true);

    }
}
