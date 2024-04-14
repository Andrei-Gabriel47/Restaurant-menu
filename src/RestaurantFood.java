import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class RestaurantFood {

	private JFrame frmBdRestaurant;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	
	Double b1,b2,b3,b4,b5,b6,b7,b8,bt;
	Double s1,s2,s3,s4,s5,s6,s7,s8,st;
	Double p1,p2,p3,p4,p5,p6,p7,p8,pt;
	Double d1,d2,d3,d4,d5,d6,d7,d8,dt;
	Double t1,t2,t3,t4,t5,t6,t7,t8,tt;
	Double sd1,sd2,sd3,sd4,sd5,sd6,sd7,sd8,sdt;
	Double stt,tva,ttt;
	JLabel lblNewLabel_2_1_2;
	JLabel lblNewLabel_2_1;
	JLabel lblNewLabel_2_1_1;
	String x1,x2,x3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantFood window = new RestaurantFood();
					window.frmBdRestaurant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RestaurantFood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBdRestaurant = new JFrame();
		frmBdRestaurant.setResizable(false);
		frmBdRestaurant.getContentPane().setBackground(new Color(230, 230, 250));
		frmBdRestaurant.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(10, 10, 600, 175);
		frmBdRestaurant.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Burgers");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 60, 100, 25);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Beef ");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { textField.setEditable(true);
				
			}
		});
		chckbxNewCheckBox.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox.setBounds(120, 10, 142, 25);
		panel.add(chckbxNewCheckBox);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setBounds(268, 10, 75, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxElkBurger = new JCheckBox("Elk ");
		chckbxElkBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEditable(true);
			}
		});
		chckbxElkBurger.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxElkBurger.setBackground(new Color(100, 149, 237));
		chckbxElkBurger.setBounds(120, 45, 142, 25);
		panel.add(chckbxElkBurger);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(268, 45, 75, 25);
		panel.add(textField_1);
		
		JCheckBox chckbxMushroomBurger = new JCheckBox("Mushroom ");
		chckbxMushroomBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setEditable(true);
			}
		});
		chckbxMushroomBurger.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxMushroomBurger.setBackground(new Color(100, 149, 237));
		chckbxMushroomBurger.setBounds(120, 80, 142, 25);
		panel.add(chckbxMushroomBurger);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(268, 80, 75, 25);
		panel.add(textField_2);
		
		JCheckBox chckbxTurkeyBurger = new JCheckBox("Turkey ");
		chckbxTurkeyBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setEditable(true);
			}
		});
		chckbxTurkeyBurger.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxTurkeyBurger.setBackground(new Color(100, 149, 237));
		chckbxTurkeyBurger.setBounds(120, 115, 142, 25);
		panel.add(chckbxTurkeyBurger);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(268, 115, 75, 25);
		panel.add(textField_3);
		
		JCheckBox chckbxVeggieBurger = new JCheckBox("Veggie ");
		chckbxVeggieBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_7.setEditable(true);
			}
		});
		chckbxVeggieBurger.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxVeggieBurger.setBackground(new Color(100, 149, 237));
		chckbxVeggieBurger.setBounds(353, 10, 142, 25);
		panel.add(chckbxVeggieBurger);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Bison ");
		chckbxNewCheckBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_1.setBounds(353, 45, 142, 25);
		panel.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Salmon ");
		chckbxNewCheckBox_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_1.setBounds(353, 80, 142, 25);
		panel.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("Chicken");
		chckbxNewCheckBox_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_1.setBounds(353, 115, 142, 25);
		panel.add(chckbxNewCheckBox_3_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(501, 115, 75, 25);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(501, 80, 75, 25);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(501, 45, 75, 25);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(501, 10, 75, 25);
		panel.add(textField_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(676, 10, 600, 175);
		frmBdRestaurant.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSandwiches = new JLabel("Sandwiches");
		lblSandwiches.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblSandwiches.setBounds(10, 60, 125, 25);
		panel_1.add(lblSandwiches);
		
		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("Greek Gyros");
		chckbxNewCheckBox_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setEditable(true);
			}
		});
		chckbxNewCheckBox_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_4_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_4_1.setBounds(367, 16, 125, 25);
		panel_1.add(chckbxNewCheckBox_4_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Ham");
		chckbxNewCheckBox_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_10.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_1_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_1_1.setBounds(367, 51, 125, 25);
		panel_1.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("Italian");
		chckbxNewCheckBox_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_9.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_1_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_1_1.setBounds(367, 86, 125, 25);
		panel_1.add(chckbxNewCheckBox_2_1_1);
		
		JCheckBox chckbxNewCheckBox_3_1_1 = new JCheckBox("Tuna");
		chckbxNewCheckBox_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_1_1.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_1_1.setBounds(367, 121, 125, 25);
		panel_1.add(chckbxNewCheckBox_3_1_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(515, 121, 75, 25);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(515, 86, 75, 25);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(515, 51, 75, 25);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setColumns(10);
		textField_11.setBounds(515, 16, 75, 25);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(282, 121, 75, 25);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(282, 86, 75, 25);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(282, 51, 75, 25);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(282, 16, 75, 25);
		panel_1.add(textField_15);
		
		JCheckBox chckbxAmerican = new JCheckBox("American");
		chckbxAmerican.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_15.setEditable(true);
			}
		});
		chckbxAmerican.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxAmerican.setBackground(new Color(100, 149, 237));
		chckbxAmerican.setBounds(134, 16, 125, 25);
		panel_1.add(chckbxAmerican);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Bologna");
		chckbxNewCheckBox_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_14.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_2.setBounds(134, 51, 125, 25);
		panel_1.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("Egg");
		chckbxNewCheckBox_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_13.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_2.setBounds(134, 86, 125, 25);
		panel_1.add(chckbxNewCheckBox_2_2);
		
		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("Fried Chicken");
		chckbxNewCheckBox_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_12.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_2.setBounds(134, 121, 125, 25);
		panel_1.add(chckbxNewCheckBox_3_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 195, 600, 175);
		frmBdRestaurant.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSoups = new JLabel("Soups");
		lblSoups.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblSoups.setBounds(10, 60, 100, 25);
		panel_2.add(lblSoups);
		
		JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("Potato");
		chckbxNewCheckBox_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_19.setEditable(true);
			}
		});
		chckbxNewCheckBox_4_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_4_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_4_2.setBounds(353, 22, 125, 25);
		panel_2.add(chckbxNewCheckBox_4_2);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("Beet");
		chckbxNewCheckBox_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_18.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_1_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_1_2.setBounds(353, 57, 125, 25);
		panel_2.add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_2_1_2 = new JCheckBox("Beans");
		chckbxNewCheckBox_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_17.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_1_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_1_2.setBounds(353, 92, 125, 25);
		panel_2.add(chckbxNewCheckBox_2_1_2);
		
		JCheckBox chckbxNewCheckBox_3_1_2 = new JCheckBox("Mushroom");
		chckbxNewCheckBox_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_16.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_1_2.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_1_2.setBounds(353, 127, 125, 25);
		panel_2.add(chckbxNewCheckBox_3_1_2);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(501, 127, 75, 25);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(501, 92, 75, 25);
		panel_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setText("0");
		textField_18.setColumns(10);
		textField_18.setBounds(501, 57, 75, 25);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setText("0");
		textField_19.setColumns(10);
		textField_19.setBounds(501, 22, 75, 25);
		panel_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setText("0");
		textField_20.setColumns(10);
		textField_20.setBounds(268, 127, 75, 25);
		panel_2.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(268, 92, 75, 25);
		panel_2.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setText("0");
		textField_22.setColumns(10);
		textField_22.setBounds(268, 57, 75, 25);
		panel_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setText("0");
		textField_23.setColumns(10);
		textField_23.setBounds(268, 22, 75, 25);
		panel_2.add(textField_23);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		chckbxChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_23.setEditable(true);
			}
		});
		chckbxChicken.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxChicken.setBackground(new Color(100, 149, 237));
		chckbxChicken.setBounds(120, 22, 125, 25);
		panel_2.add(chckbxChicken);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Beef");
		chckbxNewCheckBox_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_22.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_3.setBounds(120, 57, 125, 25);
		panel_2.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("Cream of Celery");
		chckbxNewCheckBox_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_21.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_3.setBounds(120, 92, 125, 25);
		panel_2.add(chckbxNewCheckBox_2_3);
		
		JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("Carrot");
		chckbxNewCheckBox_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_20.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_3.setBounds(120, 127, 125, 25);
		panel_2.add(chckbxNewCheckBox_3_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBounds(676, 195, 600, 175);
		frmBdRestaurant.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblSideDish = new JLabel("Side dishes");
		lblSideDish.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblSideDish.setBounds(10, 60, 118, 25);
		panel_1_1.add(lblSideDish);
		
		JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("Mushrooms");
		chckbxNewCheckBox_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_27.setEditable(true);
			}
		});
		chckbxNewCheckBox_4_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_4_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_4_3.setBounds(367, 22, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_4_3);
		
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("French Fries");
		chckbxNewCheckBox_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_26.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_1_1_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_1_3.setBounds(367, 57, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_1_1_3);
		
		JCheckBox chckbxNewCheckBox_2_1_3 = new JCheckBox("Onion Rings");
		chckbxNewCheckBox_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_25.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_2_1_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_1_3.setBounds(367, 92, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_2_1_3);
		
		JCheckBox chckbxNewCheckBox_3_1_3 = new JCheckBox("Broccoli");
		chckbxNewCheckBox_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_24.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_3_1_3.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_1_3.setBounds(367, 127, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_3_1_3);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(515, 127, 75, 25);
		panel_1_1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setText("0");
		textField_25.setColumns(10);
		textField_25.setBounds(515, 92, 75, 25);
		panel_1_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setText("0");
		textField_26.setColumns(10);
		textField_26.setBounds(515, 57, 75, 25);
		panel_1_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setText("0");
		textField_27.setColumns(10);
		textField_27.setBounds(515, 22, 75, 25);
		panel_1_1.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setText("0");
		textField_28.setColumns(10);
		textField_28.setBounds(282, 127, 75, 25);
		panel_1_1.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setText("0");
		textField_29.setColumns(10);
		textField_29.setBounds(282, 92, 75, 25);
		panel_1_1.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setText("0");
		textField_30.setColumns(10);
		textField_30.setBounds(282, 57, 75, 25);
		panel_1_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setText("0");
		textField_31.setColumns(10);
		textField_31.setBounds(282, 22, 75, 25);
		panel_1_1.add(textField_31);
		
		JCheckBox chckbxGreekSalad = new JCheckBox("Greek Salad");
		chckbxGreekSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_31.setEditable(true);
			}
		});
		chckbxGreekSalad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxGreekSalad.setBackground(new Color(100, 149, 237));
		chckbxGreekSalad.setBounds(134, 22, 125, 25);
		panel_1_1.add(chckbxGreekSalad);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("Fried Rice");
		chckbxNewCheckBox_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_30.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_1_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_4.setBounds(134, 57, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_2_4 = new JCheckBox("Mashed Potatoes");
		chckbxNewCheckBox_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_29.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_2_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_4.setBounds(134, 92, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_2_4);
		
		JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("Red Potatoes");
		chckbxNewCheckBox_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_28.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox_3_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_4.setBounds(134, 127, 125, 25);
		panel_1_1.add(chckbxNewCheckBox_3_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(224, 255, 255));
		panel_3.setBounds(10, 380, 600, 175);
		frmBdRestaurant.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDeserts = new JLabel("Desserts");
		lblDeserts.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblDeserts.setBounds(10, 60, 100, 25);
		panel_3.add(lblDeserts);
		
		JCheckBox chckbxNewCheckBox_4_4 = new JCheckBox("Almond cake");
		chckbxNewCheckBox_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_35.setEditable(true);
			}
		});
		chckbxNewCheckBox_4_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_4_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_4_4.setBounds(353, 19, 125, 25);
		panel_3.add(chckbxNewCheckBox_4_4);
		
		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("strawberry crumble");
		chckbxNewCheckBox_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_34.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_1_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_1_4.setBounds(353, 54, 125, 25);
		panel_3.add(chckbxNewCheckBox_1_1_4);
		
		JCheckBox chckbxNewCheckBox_2_1_4 = new JCheckBox("ice-cream");
		chckbxNewCheckBox_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_33.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_1_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_1_4.setBounds(353, 89, 125, 25);
		panel_3.add(chckbxNewCheckBox_2_1_4);
		
		JCheckBox chckbxNewCheckBox_3_1_4 = new JCheckBox("Ecler");
		chckbxNewCheckBox_3_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_32.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_1_4.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_1_4.setBounds(353, 124, 125, 25);
		panel_3.add(chckbxNewCheckBox_3_1_4);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setText("0");
		textField_32.setColumns(10);
		textField_32.setBounds(501, 124, 75, 25);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setText("0");
		textField_33.setColumns(10);
		textField_33.setBounds(501, 89, 75, 25);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setText("0");
		textField_34.setColumns(10);
		textField_34.setBounds(501, 54, 75, 25);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setText("0");
		textField_35.setColumns(10);
		textField_35.setBounds(501, 19, 75, 25);
		panel_3.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setText("0");
		textField_36.setColumns(10);
		textField_36.setBounds(268, 124, 75, 25);
		panel_3.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setText("0");
		textField_37.setColumns(10);
		textField_37.setBounds(268, 89, 75, 25);
		panel_3.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setText("0");
		textField_38.setColumns(10);
		textField_38.setBounds(268, 54, 75, 25);
		panel_3.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setText("0");
		textField_39.setColumns(10);
		textField_39.setBounds(268, 19, 75, 25);
		panel_3.add(textField_39);
		
		JCheckBox chckbxTiramisu = new JCheckBox("Tiramisu");
		chckbxTiramisu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_39.setEditable(true);
			}
		});
		chckbxTiramisu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxTiramisu.setBackground(new Color(100, 149, 237));
		chckbxTiramisu.setBounds(120, 19, 125, 25);
		panel_3.add(chckbxTiramisu);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("Apple cinnamon");
		chckbxNewCheckBox_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_38.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_5.setBounds(120, 54, 125, 25);
		panel_3.add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_2_5 = new JCheckBox("honey cheesecake");
		chckbxNewCheckBox_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_37.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_5.setBounds(120, 89, 125, 25);
		panel_3.add(chckbxNewCheckBox_2_5);
		
		JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("berry crumble");
		chckbxNewCheckBox_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_36.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_5.setBounds(120, 124, 125, 25);
		panel_3.add(chckbxNewCheckBox_3_5);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(224, 255, 255));
		panel_1_2.setBounds(676, 380, 600, 175);
		frmBdRestaurant.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblDrinks.setBounds(10, 60, 100, 25);
		panel_1_2.add(lblDrinks);
		
		JCheckBox chckbxNewCheckBox_4_5 = new JCheckBox("Strongbow");
		chckbxNewCheckBox_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_43.setEditable(true);
			}
		});
		chckbxNewCheckBox_4_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_4_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_4_5.setBounds(367, 21, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_4_5);
		
		JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("Vine");
		chckbxNewCheckBox_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_42.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_1_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_1_5.setBounds(367, 56, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_1_1_5);
		
		JCheckBox chckbxNewCheckBox_2_1_5 = new JCheckBox("Beer");
		chckbxNewCheckBox_2_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_41.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_1_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_1_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_1_5.setBounds(367, 91, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_2_1_5);
		
		JCheckBox chckbxNewCheckBox_3_1_5 = new JCheckBox("Tea");
		chckbxNewCheckBox_3_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_40.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_1_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_1_5.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_1_5.setBounds(367, 126, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_3_1_5);
		
		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setText("0");
		textField_40.setColumns(10);
		textField_40.setBounds(515, 126, 75, 25);
		panel_1_2.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setText("0");
		textField_41.setColumns(10);
		textField_41.setBounds(515, 91, 75, 25);
		panel_1_2.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setText("0");
		textField_42.setColumns(10);
		textField_42.setBounds(515, 56, 75, 25);
		panel_1_2.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setText("0");
		textField_43.setColumns(10);
		textField_43.setBounds(515, 21, 75, 25);
		panel_1_2.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setText("0");
		textField_44.setColumns(10);
		textField_44.setBounds(282, 126, 75, 25);
		panel_1_2.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setText("0");
		textField_45.setColumns(10);
		textField_45.setBounds(282, 91, 75, 25);
		panel_1_2.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setText("0");
		textField_46.setColumns(10);
		textField_46.setBounds(282, 56, 75, 25);
		panel_1_2.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setText("0");
		textField_47.setColumns(10);
		textField_47.setBounds(282, 21, 75, 25);
		panel_1_2.add(textField_47);
		
		JCheckBox chckbxCola = new JCheckBox("Cola");
		chckbxCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_47.setEditable(true);
			}
		});
		chckbxCola.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxCola.setBackground(new Color(100, 149, 237));
		chckbxCola.setBounds(134, 21, 125, 25);
		panel_1_2.add(chckbxCola);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("Pepsi");
		chckbxNewCheckBox_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_46.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_1_6.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_1_6.setBounds(134, 56, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_2_6 = new JCheckBox("Fanta");
		chckbxNewCheckBox_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_45.setEditable(true);
			}
		});
		chckbxNewCheckBox_2_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_2_6.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_2_6.setBounds(134, 91, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_2_6);
		
		JCheckBox chckbxNewCheckBox_3_6 = new JCheckBox("Sprite");
		chckbxNewCheckBox_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_44.setEditable(true);
			}
		});
		chckbxNewCheckBox_3_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		chckbxNewCheckBox_3_6.setBackground(new Color(100, 149, 237));
		chckbxNewCheckBox_3_6.setBounds(134, 126, 125, 25);
		panel_1_2.add(chckbxNewCheckBox_3_6);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(224, 255, 255));
		panel_3_1.setBounds(150, 570, 1000, 125);
		frmBdRestaurant.getContentPane().add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Billing");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(10, 10, 240, 25);
		panel_3_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TVA");
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(300, 45, 150, 25);
		panel_3_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(510, 45, 150, 25);
		panel_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total");
		lblNewLabel_2_2.setBackground(Color.RED);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(300, 80, 150, 25);
		panel_3_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(510, 80, 150, 25);
		panel_3_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("SubTotal");
		lblNewLabel_2_3.setBackground(Color.RED);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(300, 10, 150, 25);
		panel_3_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_2.setBounds(510, 10, 150, 25);
		panel_3_1.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1 = Double.parseDouble(textField.getText()) * 27.5;
				b2 = Double.parseDouble(textField_1.getText()) * 20;
				b3 = Double.parseDouble(textField_2.getText()) * 22.5;
				b4 = Double.parseDouble(textField_3.getText()) * 24.5;
				b5 = Double.parseDouble(textField_7.getText()) * 20.5;
				b6 = Double.parseDouble(textField_6.getText()) * 35;
				b7 = Double.parseDouble(textField_5.getText()) * 32.5;
				b8 = Double.parseDouble(textField_4.getText()) * 25;
				bt = b1 + b2 + b3 +b4 +b5+b6+b7+b8;
				
				s1 = Double.parseDouble(textField_8.getText()) * 17.5;
				s2 = Double.parseDouble(textField_9.getText()) * 15;
				s3 = Double.parseDouble(textField_10.getText()) * 12.5;
				s4 = Double.parseDouble(textField_11.getText()) * 20;
				s5 = Double.parseDouble(textField_12.getText()) * 18.5;
				s6 = Double.parseDouble(textField_13.getText()) * 12.5;
				s7 = Double.parseDouble(textField_14.getText()) * 14.5;
				s8 = Double.parseDouble(textField_15.getText()) * 16.5;
				st = s1+s2+s3+s4+s5+s6+s7+s8;
				
				p1 = Double.parseDouble(textField_16.getText()) * 17.5;
				p2 = Double.parseDouble(textField_17.getText()) * 15;
				p3 = Double.parseDouble(textField_18.getText()) * 12.5;
				p4 = Double.parseDouble(textField_19.getText()) * 14.5;
				p5 = Double.parseDouble(textField_20.getText()) * 13.5;
				p6 = Double.parseDouble(textField_21.getText()) * 18.5;
				p7 = Double.parseDouble(textField_22.getText()) * 22.5;
				p8 = Double.parseDouble(textField_23.getText()) * 19.5;
				pt = p1+p2+p3+p4+p5+p6+p7+p8;
				
				sd1 = Double.parseDouble(textField_24.getText()) * 9.5;
				sd2 = Double.parseDouble(textField_25.getText()) * 10.5;
				sd3 = Double.parseDouble(textField_26.getText()) * 8.5;
				sd4 = Double.parseDouble(textField_27.getText()) * 10;
				sd5 = Double.parseDouble(textField_28.getText()) * 10.5;
				sd6 = Double.parseDouble(textField_29.getText()) * 11;
				sd7 = Double.parseDouble(textField_30.getText()) * 12.5;
				sd8 = Double.parseDouble(textField_31.getText()) * 16.5;
				sdt=sd1+sd2+sd3+sd4+sd5+sd6+sd7+sd8;
				
				t1 = Double.parseDouble(textField_32.getText()) * 8.5;
				t2 = Double.parseDouble(textField_33.getText()) * 6;
				t3 = Double.parseDouble(textField_34.getText()) * 9;
				t4 = Double.parseDouble(textField_35.getText()) * 10;
				t5 = Double.parseDouble(textField_36.getText()) * 10.5;
				t6 = Double.parseDouble(textField_37.getText()) * 11;
				t7 = Double.parseDouble(textField_38.getText()) * 12.5;
				t8 = Double.parseDouble(textField_39.getText()) * 14.5;
				tt = t1+t2+t3+t4+t5+t6+t7+t8;
				
				d1 = Double.parseDouble(textField_40.getText()) * 8.5;
				d2 = Double.parseDouble(textField_41.getText()) * 8.5;
				d3 = Double.parseDouble(textField_42.getText()) * 12;
				d4 = Double.parseDouble(textField_43.getText()) * 8.5;
				d5 = Double.parseDouble(textField_44.getText()) * 7;
				d6 = Double.parseDouble(textField_45.getText()) * 7;
				d7 = Double.parseDouble(textField_46.getText()) * 7.5;
				d8 = Double.parseDouble(textField_47.getText()) * 7.5;
				dt = d1+d2+d3+d4+d5+d6+d7+d8;
				
				stt= bt+st+sdt+tt+dt+pt;
				tva= stt * 4/100;
				ttt=stt+tva;
				
				x1 =String.format(" %.2f",stt);
				lblNewLabel_2_1_2.setText(x1 + " RON");
				
				x2 =String.format(" %.2f",tva);
				lblNewLabel_2_1.setText(x2 + " RON");
				
				x3 =String.format(" %.2f",ttt);
				lblNewLabel_2_1_1.setText(x3 + " RON");
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(20, 45, 200, 59);
		panel_3_1.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(620, 10, 46, 545);
		frmBdRestaurant.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(176, 224, 230));
		panel_5.setBounds(10, 565, 128, 138);
		frmBdRestaurant.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(176, 224, 230));
		panel_6.setBounds(1160, 570, 116, 133);
		frmBdRestaurant.getContentPane().add(panel_6);
		frmBdRestaurant.setBackground(new Color(255, 255, 255));
		frmBdRestaurant.setTitle("B&D - Restaurant ");
		frmBdRestaurant.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andre\\Desktop\\B&D.png"));
		frmBdRestaurant.setBounds(100, 100, 1300, 750);
		frmBdRestaurant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
