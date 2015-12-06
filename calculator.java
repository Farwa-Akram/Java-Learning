package jCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener {

    private JButton b1, b2, b3, b4, b5;
    private JTextField n1, n2, r;

    calculator() {
        setTitle("My Calculator");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("Enter first number :"));
        cp.add(n1 = new JTextField(20));
        cp.add(new JLabel("Enter  second  number"));
        cp.add(n2 = new JTextField(20));
        cp.add(new JLabel("     Result      "));
        cp.add(r = new JTextField(20));
        cp.add(b1 = new JButton(" Subtract "));
        cp.add(b2 = new JButton("Add"));
        cp.add(b3 = new JButton("Multiply"));
        cp.add(b4 = new JButton("Divide"));
        cp.add(b5 = new JButton(" Clear "));
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a1 = Integer.parseInt(n1.getText());
        int a2 = Integer.parseInt(n2.getText());
        if (e.getSource() == b1) {
            r.setText(String.valueOf(a1 - a2));
        }
        if (e.getSource() == b2) {
            r.setText(String.valueOf(a1 + a2));
        }
        if (e.getSource() == b3) {
            r.setText(String.valueOf(a1 * a2));
        }
        if (e.getSource() == b4) {
            r.setText(String.valueOf(a1 / a2));
        }
        if (e.getSource() == b5) {
            r.setText(" ");
            n1.setText(" ");
            n2.setText(" ");
        }
    }

    public static void main(String[] a) {
        JFrame jf = new calculator();
        jf.setSize(300, 300);
        jf.setVisible(true);

    }
}
