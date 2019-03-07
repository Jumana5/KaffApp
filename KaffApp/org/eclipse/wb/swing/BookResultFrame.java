package org.eclipse.wb.swing;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
public class BookResultFrame extends JFrame {
 
 
 JLabel label1;
 JLabel label2;
 JLabel label3;
 JLabel label4;
 JLabel label5;
 JLabel label6;
 JLabel label7;
 JLabel label8;
 JLabel label9;
 JLabel label10;
 JButton button1;
 JButton button2;
 JButton button3;
 JRadioButton radio1;
 JRadioButton radio2;
 ButtonGroup group;
 JPanel panel1;
 JPanel panel2;
 
 Icon icon=new ImageIcon(getClass().getResource("search.png"));
 
 public BookResultFrame () {
  super("معلومات الكتاب");
  //setLayout(new GridLayout(5,2,10,5));
  GridLayout grid=new GridLayout(7,2,20,0);
  panel1=new JPanel();
  panel1.setLayout(grid);
  panel1.setBackground(Color.white);
    	add(panel1);
  
    	label1=new JLabel();
  label2=new JLabel("بحث");
  label3=new JLabel();
  label4=new JLabel("معلومات الكتاب:");
  label5=new JLabel("",10);
  label6=new JLabel("اسم الكتاب:");
  label7=new JLabel("",10);
  label8=new JLabel("المستوى:");
  label9=new JLabel("",10);
  label10=new JLabel("السعر:");
  button3=new JButton(icon);
  button2=new JButton("غير متوفر");
  button1=new JButton("متوفر");
  radio1=new JRadioButton("للبيع",true);
  radio2=new JRadioButton("للاعاره",false);
  group=new ButtonGroup();
  
  add(panel1);
  group.add(radio1);
  group.add(radio2);
  //panel1.add(label1);
  panel1.add(button3);
  panel1.add(label2);
  panel1.add(label3);
  panel1.add(label4);
  panel1.add(button2);
  panel1.add(button1);
  panel1.add(radio2);
  panel1.add(radio1);
  panel1.add(label5);
  panel1.add(label6);
  panel1.add(label7);
  panel1.add(label8);
  panel1.add(label9);
  panel1.add(label10);
  label3.setHorizontalAlignment(SwingConstants.RIGHT);
  label4.setHorizontalAlignment(SwingConstants.CENTER);
  label5.setHorizontalAlignment(SwingConstants.RIGHT);
  label6.setHorizontalAlignment(SwingConstants.CENTER);
  label7.setHorizontalAlignment(SwingConstants.RIGHT);
  label8.setHorizontalAlignment(SwingConstants.CENTER);
  label9.setHorizontalAlignment(SwingConstants.RIGHT);
  label10.setHorizontalAlignment(SwingConstants.CENTER);
  radio1.setHorizontalAlignment(SwingConstants.CENTER);
  radio2.setHorizontalAlignment(SwingConstants.CENTER);
  button1.setBackground(Color.GREEN);
  button2.setBackground(Color.orange);
  radio1.setBackground(Color.white);
  radio2.setBackground(Color.white);
  radio1.setEnabled(true);
  radio2.setEnabled(false);
  //panel.setLayout(new GridLayout(5,2,10,10));
  
  getContentPane().setBackground(Color.white);
 }
}
