package ADJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

 class ItemListenerExample implements ItemListener {
    JCheckBox cb1,cb2;
    JLabel l1;
    ItemListenerExample(){
        JFrame f= new JFrame("CheckBox Example");
        l1 = new JLabel();
        l1.setSize(400,100);
        cb1 = new JCheckBox("C++",true);
        cb1.setBounds(100,100, 50,50);
        cb2 = new JCheckBox("Java");
        cb2.setBounds(100,150, 50,50);
        f.add(cb1);
        f.add(cb2);
        f.add(l1);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

     @Override
     public void itemStateChanged(ItemEvent e) {
         if(e.getSource()==cb1)
             l1.setText("C++ Checkbox: "
                     + (e.getStateChange()==1?"checked":"unchecked"));

         if(e.getSource()==cb2)
             l1.setText("Java Checkbox: "
                     + (e.getStateChange()==1?"checked":"unchecked"));
     }

     public static void main(String[] args) {
         ItemListenerExample el = new ItemListenerExample();
     }

 }
