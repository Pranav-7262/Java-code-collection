package ADJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEx extends JFrame implements WindowListener {
    WindowEx() {
        setTitle("WindowListener Example");
        JLabel label = new JLabel("Welcome to SIT");
        label.setBounds(100, 90, 140, 20);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Serif", Font.BOLD, 22));
        add(label);
        addWindowListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window is opened!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing.. !");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window is closed!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window is iconified!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window is deiconified!");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window is activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is deactivated!");
    }

    public static void main(String[] args) {
        WindowEx ex = new WindowEx();
    }
}
