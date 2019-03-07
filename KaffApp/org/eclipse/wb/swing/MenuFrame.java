package org.eclipse.wb.swing;



import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class MenuFrame extends JFrame {
   	JLabel labelMenu;
   	JLabel showLbl;
     	JComboBox functions;
	String[] functionsArray={"إضافة كتاب جديد","تعديل معلومات كتاب","عرض معلومات الكتب او المستخدمين"};
   	JButton booksButton;
   	JButton usersButton;
   	BorderLayout border;
   	GridLayout grid;
   	//JPanel buttonHolder;
   	JPanel showPnl;
   	JPanel menupnl;
   	
	MenuFrame()
	{
    	super("منصة كاف");
    	functions=new JComboBox(functionsArray);
    	labelMenu=new JLabel("========== قائمة منصة كاف ==========",SwingConstants.CENTER);
    	functions.setSelectedIndex(0);
    	setLayout(new GridLayout(3,4));
   	menupnl  = new JPanel();
   	menupnl.add(labelMenu);
   	menupnl.add(functions);	
   	add(menupnl);
   	
  	
   	showPnl = new JPanel();
   	showPnl.setLayout(new GridLayout(3,1, 10, 10));
   	showLbl = new JLabel("عرض المعلومات",SwingConstants.CENTER);
   	//displayButtons.setLayout(new GridLayout(1,2));
   	booksButton= new JButton("الكتب");
   	usersButton= new JButton("المستخدمين");
   	showPnl.add(showLbl);
   	showPnl.add(booksButton);
   	showPnl.add(usersButton);
 	//menupnl.add(showPnl);
 	add(showPnl);
   	
	}
	public static void main(String[] args) {
    	MenuFrame f=new MenuFrame();
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setSize(300,300);
   	// f.setResizable(false);
    	f.setVisible(true);
	}
	
}
