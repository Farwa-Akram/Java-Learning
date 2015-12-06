package jCalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculatorjava extends JFrame implements ActionListener {

    JTextField t;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, mul, sub, div, point, beq, clear;
    Double a, b, result;
    static int op;

    Calculatorjava() {
        Container c = getContentPane();
        setTitle("My Calculator");
        c.setLayout(null);
        t = new JTextField(15);
        t.setBounds(20, 20, 300, 30);
        c.add(t);
        b7 = new JButton("7");
        b7.setBounds(30, 90, 50, 40);
        c.add(b7);
        b8 = new JButton("8");
        b8.setBounds(100, 90, 50, 40);
        c.add(b8);
        b9 = new JButton("9");
        b9.setBounds(170, 90, 50, 40);
        c.add(b9);
        add = new JButton("+");
        add.setBounds(240, 90, 50, 40);
        c.add(add);
        b4 = new JButton("4");
        b4.setBounds(30, 160, 50, 40);
        c.add(b4);
        b5 = new JButton("5");
        b5.setBounds(100, 160, 50, 40);
        c.add(b5);
        b6 = new JButton("6");
        b6.setBounds(170, 160, 50, 40);
        c.add(b6);
        sub = new JButton("-");
        sub.setBounds(240, 160, 50, 40);
        c.add(sub);
        b1 = new JButton("1");
        b1.setBounds(30, 230, 50, 40);
        c.add(b1);
        b2 = new JButton("2");
        b2.setBounds(100, 230, 50, 40);
        c.add(b2);
        b3 = new JButton("3");
        b3.setBounds(170, 230, 50, 40);
        c.add(b3);
        div = new JButton("/");
        div.setBounds(240, 230, 50, 40);
        c.add(div);
        point = new JButton(".");
        point.setBounds(30, 300, 50, 40);
        c.add(point);
        b0 = new JButton("0");
        b0.setBounds(100, 300, 50, 40);
        c.add(b0);
        beq = new JButton("=");
        beq.setBounds(170, 300, 50, 40);
        c.add(beq);
        mul = new JButton("*");
        mul.setBounds(240, 300, 50, 40);
        c.add(mul);
        clear = new JButton("Clear");
        clear.setBounds(120, 360, 80, 40);
        c.add(clear);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        add.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        b9.addActionListener(this);
        sub.addActionListener(this);
        point.addActionListener(this);
        beq.addActionListener(this);
        clear.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame f = new Calculatorjava();
        f.setSize(350, 450);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == point) {
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == add) {
            a = Double.parseDouble(t.getText());
            op = 1;
            t.setText(" ");
        }
        if (e.getSource() == sub) {
            a = Double.parseDouble(t.getText());
            op = 2;
            t.setText(" ");
        }
        if (e.getSource() == div) {
            a = Double.parseDouble(t.getText());
            op = 3;
            t.setText(" ");
        }
        if (e.getSource() == mul) {
            a = Double.parseDouble(t.getText());
            op = 4;
            t.setText(" ");
        }
        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());
            switch (op) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a / b;
                    break;
                case 4:
                    result = a * b;
                    break;
                default:
                    result = 0.0;
            }
            t.setText("" + result);
        }
        if (e.getSource() == clear) {
            t.setText(" ");
        }
    }
}
