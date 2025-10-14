package ADJ;

import javax.swing.*;
import java.awt.*;

public class JProgressBarDemo {
    JProgressBarDemo() {
        JFrame jf = new JFrame();
        jf.setLayout(new FlowLayout());
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar jp = new JProgressBar(0,100);
        jf.add(jp);
        jp.setStringPainted(true);

        int i=0;
        while (i<=100) {
            if(i>=0 && i<50)
            jp.setString("Processing…..");
   else if(i>50 && i<=70) {
       jp.setString("Wait for some time");
            }
   else if (i==100)  jp.setString("Finished.");

            jp.setValue(i);
            try{
                Thread.sleep(1000);   }
            catch(Exception  e){
                System.out.println(e.getMessage());
            }
            i=i+10;   }   }
    public static void main(String[] args) {
        new JProgressBarDemo();
    }
}
