package ADJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventEx1 extends Frame implements TextListener {
    TextField t1, t2;

    public TextEventEx1(){
        setTitle("Text Event Demo");
        setLayout(new FlowLayout());
        setSize(400, 200);

        // Create two TextFields
        t1 = new TextField(20);
        t2 = new TextField(20);
       t1.addTextListener(this);
       add(t1);
       add(t2);
       setVisible(true);

    }

    @Override
    public void textValueChanged(TextEvent e) {
       t2.setText(t1.getText());
    }

    public static void main(String[] args) {
        TextEventEx1 ex1 = new TextEventEx1();
    }
}
