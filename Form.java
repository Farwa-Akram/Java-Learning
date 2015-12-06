/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jCalculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Form extends JFrame implements ActionListener{
   JButton b1;
   JTextField T1,T2,T3;
    Form(){
         Container c=getContentPane();
         c.setLayout(new FlowLayout());
         setTitle("My form");
         c.add(new JLabel("Enter first Name:"));
         c.add(T1=new JTextField(20));
         c.add(new JLabel("Enter second Name :"));
         c.add(T2=new JTextField(20));
         c.add(new JLabel("Enter Email:"));
         c.add(T3=new JTextField(20));
         c.add(b1=new JButton("Clear"));
         b1.addActionListener(this);
    }
    public static void main(String[] args){
        JFrame js=new Form();
        js.setVisible(true);
        js.setSize(300, 300);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource() == b1)
{
    b1.setText(" ");
    T1.setText(" ");
    T2.setText(" ");
    T3.setText(" ");
}}
    
}
