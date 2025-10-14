package ADJ;

import javax.swing.*;

public class TableExample {
    TableExample(){
        JFrame jf = new JFrame("example");
        String [][]data = {{"100","pranav","6000"} , {"100","varpe","6000"} , {"100","hello","6000"}};
         String []col = {"ID","NAME","SALARY"};
         JTable jt = new JTable(data,col);
        jt.setBounds(30,40,200,300);
         jf.add(jt);
        jf.setSize(300,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
