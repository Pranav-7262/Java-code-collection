package ADJ;

import javax.swing.*;

public class FrameEg2 {
    JFrame jf;
    public FrameEg2(String s){
        jf = new JFrame(s);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(400,300);

    }
    public static void main(String[] args) {
      FrameEg2 frameEg2 = new FrameEg2("pranav");
    }
}
