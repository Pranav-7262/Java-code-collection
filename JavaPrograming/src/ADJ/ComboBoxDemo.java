package ADJ;

import javax.swing.*;

public class ComboBoxDemo {
    public ComboBoxDemo() {
        JFrame f = new JFrame();
        String []arr = {"India","USA","Japan","England"};
        JComboBox box = new JComboBox(arr);
        box.setBounds(50,70,100,80);
        f.add(box);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
