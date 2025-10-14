package ADJ;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo {
    public JScrollPaneDemo(){
          JFrame jf = new JFrame("JscrollPane Demo");
            jf.setLayout(new FlowLayout());
            JTextArea  jt = new JTextArea(20,20);
            JScrollPane jp = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            jf.add(jp);
            jf.setSize(500,500);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setVisible(true);

        }
    public static void main(String[] args) {
        new JScrollPaneDemo();
    }
}
