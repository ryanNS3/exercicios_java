package org.example;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame a = new JFrame();
        a.setSize(400,300);
        a.setBackground(Color.darkGray);
        new JPanel() {{
            add(new JPanel("Center"));
            setBackground(Color.CYAN);
        }}.add(a)

        a.setVisible(true);
    }
}