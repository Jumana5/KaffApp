package app;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.border.MatteBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class App extends JFrame {

	private final JLabel welcome;
	private final JButton enter;
	private final JButton search;
	private final JPanel menuPnl;
	private final JPanel displayPnl;
	private JLabel logoLbl;
	private Icon logo = new ImageIcon("C:/Users/al5an/OneDrive/Pictures/logo kaff.png");
	private JPanel MainMenuPanel;
	private JLabel label;
	private JLabel label_1;
	private JPanel SearchPanel;
	private JPanel LoginPanel;
	private JLabel signInlbl;
	private JTextField usernameTxtfld;
	private JPasswordField password;
	private JButton signInBtn;
	private JLabel label_2;
	private JLabel booklbl;
	private JLabel pricelbl;
	private JLabel lvllbl;
	private JTextField searchtxtfld;
	private JTextField pricetxtfld;
	private JTextField resName;
	private JButton searchbtn;
	private JTextField resLvl;
	private JLabel headerPic2;

	App() {
		super(" منصة كـاف");
		menuPnl = new JPanel();
		displayPnl = new JPanel();
		logoLbl = new JLabel(logo);
		label = new JLabel("");
		enter = new JButton(" دخول ");
		search = new JButton(" بحث");
		welcome = new JLabel("مرحباً بكم في منصة كـاف");
		
		showMainMenu();
		
		LoginPanel = new JPanel();
		getContentPane().add(LoginPanel);
		LoginPanel.setLayout(null);
		
		JLabel headerPic1 = new JLabel("");
		headerPic1.setIcon(new ImageIcon("C:\\Users\\al5an\\Desktop\\iau\\منصة كاف.jpg"));
		headerPic1.setBounds(0, 13, 713, 116);
		headerPic1.setHorizontalAlignment(SwingConstants.CENTER);
		LoginPanel.add(headerPic1);
		
		showLoginImage();
		
		showResultBook();
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	
	public void showMainMenu(){
		
		getContentPane().setLayout(new java.awt.GridLayout(3, 1, 5, 5));

		MainMenuPanel = new JPanel();
		MainMenuPanel.setBackground(Color.WHITE);
		MainMenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		getContentPane().add(MainMenuPanel);

		
		
		enter.setFont(new Font("B Badr", enter.getFont().getStyle(), enter.getFont().getSize()));
		
		search.setFont(new Font("B Badr", search.getFont().getStyle(), 27));

		welcome.setForeground(Color.DARK_GRAY);
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("AGT Zarghona Mangal", welcome.getFont().getStyle(), 27));
		getContentPane().setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { logoLbl, welcome, enter, search }));

		label_1 = new JLabel("");
		GroupLayout gl_MainMenuPanel = new GroupLayout(MainMenuPanel);
		gl_MainMenuPanel.setHorizontalGroup(
			gl_MainMenuPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MainMenuPanel.createSequentialGroup()
					.addGroup(gl_MainMenuPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(label))
					.addContainerGap(678, Short.MAX_VALUE))
				.addGroup(gl_MainMenuPanel.createSequentialGroup()
					.addContainerGap(133, Short.MAX_VALUE)
					.addComponent(logoLbl)
					.addGap(133))
				.addGroup(gl_MainMenuPanel.createSequentialGroup()
					.addGap(214)
					.addComponent(search, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(enter, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(222, Short.MAX_VALUE))
				.addGroup(gl_MainMenuPanel.createSequentialGroup()
					.addGap(193)
					.addComponent(welcome, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
					.addGap(204))
		);
		gl_MainMenuPanel.setVerticalGroup(
			gl_MainMenuPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MainMenuPanel.createSequentialGroup()
					.addGap(0)
					.addGroup(gl_MainMenuPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(logoLbl, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(welcome, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_MainMenuPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(search, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(enter, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		MainMenuPanel.setLayout(gl_MainMenuPanel);
		
	}
	
	public void showLoginImage(){
		signInlbl = new JLabel("سجلي دخولك من هنا");
		signInlbl.setFont(new Font("Tahoma", Font.ITALIC, 22));
		signInlbl.setBounds(173, 114, 366, 61);
		signInlbl.setHorizontalAlignment(SwingConstants.CENTER);
		LoginPanel.add(signInlbl);
		
		usernameTxtfld = new JTextField();
		usernameTxtfld.setFont(new Font("B Badr", usernameTxtfld.getFont().getStyle(), usernameTxtfld.getFont().getSize()));
		usernameTxtfld.setBounds(67, 173, 545, 61);
		usernameTxtfld.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameTxtfld.setText(":اسم المستخدم");
		LoginPanel.add(usernameTxtfld);
		usernameTxtfld.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(67, 246, 545, 61);
		password.setHorizontalAlignment(SwingConstants.RIGHT);
		password.setText("الرقم السري:");
		LoginPanel.add(password);
		
		signInBtn = new JButton("دخول");
		signInBtn.setFont(new Font("B Badr", signInBtn.getFont().getStyle(), signInBtn.getFont().getSize()));
		signInBtn.setBounds(67, 321, 545, 61);
		LoginPanel.add(signInBtn);
		
	}
	
	public void showResultBook(){

		SearchPanel = new JPanel();
		getContentPane().add(SearchPanel);
		SearchPanel.setLayout(null);
		
		label_2 = new JLabel("ابحثي عن أي كتاب");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("B Badr", label_2.getFont().getStyle(), label_2.getFont().getSize()));
		label_2.setBounds(234, 131, 227, 45);
		SearchPanel.add(label_2);
		
		booklbl = new JLabel("اسم الكتاب: ");
		booklbl.setFont(new Font("B Badr", booklbl.getFont().getStyle(), booklbl.getFont().getSize()));
		booklbl.setBounds(519, 273, 163, 33);
		SearchPanel.add(booklbl);
		
		pricelbl = new JLabel("السعر:");
		pricelbl.setFont(new Font("B Badr", pricelbl.getFont().getStyle(), pricelbl.getFont().getSize()));
		pricelbl.setBounds(558, 461, 63, 33);
		SearchPanel.add(pricelbl);
		
		lvllbl = new JLabel("المستوى:");
		lvllbl.setFont(new Font("B Badr", lvllbl.getFont().getStyle(), lvllbl.getFont().getSize()));
		lvllbl.setBounds(542, 327, 106, 33);
		SearchPanel.add(lvllbl);
		
		JButton resAvailable = new JButton("متوفر");
		resAvailable.setBackground(new Color(0, 206, 209));
		resAvailable.setFont(new Font("B Badr", resAvailable.getFont().getStyle(), resAvailable.getFont().getSize()));
		resAvailable.setBounds(379, 388, 133, 45);
		SearchPanel.add(resAvailable);
		
		JButton resNotAvaliable = new JButton("غير متوفر");
		resNotAvaliable.setBackground(new Color(178, 34, 34));
		resNotAvaliable.setFont(new Font("B Badr", resNotAvaliable.getFont().getStyle(), resNotAvaliable.getFont().getSize()));
		resNotAvaliable.setBounds(215, 388, 134, 44);
		SearchPanel.add(resNotAvaliable);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(413, 295, 115, 33);
		SearchPanel.add(label_5);
		
		JRadioButton radioSell = new JRadioButton("للبيع");
		radioSell.setFont(new Font("B Badr", radioSell.getFont().getStyle(), radioSell.getFont().getSize()));
		radioSell.setBounds(234, 457, 115, 41);
		SearchPanel.add(radioSell);
		
		JRadioButton radioBorrow = new JRadioButton("للإعارة");
		radioBorrow.setFont(new Font("B Badr", radioBorrow.getFont().getStyle(), radioBorrow.getFont().getSize()));
		radioBorrow.setBounds(92, 457, 124, 41);
		SearchPanel.add(radioBorrow);
		
		searchtxtfld = new JTextField();
		searchtxtfld.setFont(new Font("B Badr", searchtxtfld.getFont().getStyle(), searchtxtfld.getFont().getSize()));
		searchtxtfld.setText("العنوان، المستوى، أو رمز الكتاب");
		searchtxtfld.setBounds(100, 175, 564, 39);
		SearchPanel.add(searchtxtfld);
		searchtxtfld.setColumns(10);
		
		pricetxtfld = new JTextField();
		pricetxtfld.setText("0");
		pricetxtfld.setBounds(364, 457, 146, 39);
		SearchPanel.add(pricetxtfld);
		pricetxtfld.setColumns(10);
		
		resName = new JTextField();
		resName.setBounds(99, 261, 413, 39);
		SearchPanel.add(resName);
		resName.setColumns(10);
		
		searchbtn = new JButton("");
		searchbtn.setBounds(26, 173, 63, 41);
		SearchPanel.add(searchbtn);
		
		resLvl = new JTextField();
		resLvl.setBounds(99, 321, 413, 39);
		SearchPanel.add(resLvl);
		resLvl.setColumns(10);
		
		headerPic2 = new JLabel("");
		headerPic2.setHorizontalAlignment(SwingConstants.CENTER);
		headerPic2.setIcon(new ImageIcon("C:\\Users\\al5an\\Desktop\\iau\\منصة كاف.jpg"));
		headerPic2.setBackground(Color.WHITE);
		headerPic2.setBounds(0, 0, 721, 118);
		SearchPanel.add(headerPic2);
	}
	
	public static void main(String[] args) {

		App app = new App();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		app.setSize(900, 900);

	}
}
