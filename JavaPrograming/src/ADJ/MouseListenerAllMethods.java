package ADJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerAllMethods extends JFrame implements MouseListener {
    JLabel label;

    MouseListenerAllMethods(){
        setTitle("MouseListener - All Methods Example");
        setLayout(null);
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Interact with the window using the mouse");
        label.setBounds(50, 80, 300, 30);
        add(label);

        addMouseListener(this);
        setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the window");
     }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the window");

    }

    public static void main(String[] args) {
        MouseListenerAllMethods mouseListenerAllMethods = new MouseListenerAllMethods();
    }
}
