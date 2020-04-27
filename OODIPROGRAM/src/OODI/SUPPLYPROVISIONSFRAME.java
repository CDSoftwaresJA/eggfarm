package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

public class SUPPLYPROVISIONSFRAME {

	JFrame frmSupplyProvissioned;
	private JTextField workstationtextField;
	private JTextField collectedeggstextField_1;
	private JTextField brokeneggstextField_2;
	private JTextField spoilteggstextField_3;
	private JTextField usernametextField_4;
	private JTextArea textArea;
	private JPasswordField passwordField;
	private String employeeid=null;
	private String Fullname=null;
	private String collected=null;
	private String spoilt=null;
	private String broken=null;
	private String section=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUPPLYPROVISIONSFRAME window = new SUPPLYPROVISIONSFRAME();
					window.frmSupplyProvissioned.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SUPPLYPROVISIONSFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSupplyProvissioned = new JFrame();
		frmSupplyProvissioned.setTitle("SUPPLY PROVISSIONED ");
		frmSupplyProvissioned.setBounds(100, 100, 670, 440);
		frmSupplyProvissioned.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupplyProvissioned.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER  SUPPLY PROVISIONS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(176, 11, 341, 26);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WORK STATION ");
		lblNewLabel_1.setBounds(59, 69, 111, 26);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_1);
		
		workstationtextField = new JTextField();
		workstationtextField.setBounds(176, 72, 103, 20);
		frmSupplyProvissioned.getContentPane().add(workstationtextField);
		workstationtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("COLLECTED EGGS");
		lblNewLabel_2.setToolTipText("NUMBERS ONLY ");
		lblNewLabel_2.setBounds(59, 106, 111, 32);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_2);
		
		collectedeggstextField_1 = new JTextField();
		collectedeggstextField_1.setBounds(176, 112, 103, 20);
		frmSupplyProvissioned.getContentPane().add(collectedeggstextField_1);
		collectedeggstextField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BROKEN EGGS");
		lblNewLabel_3.setToolTipText("NUMBERS ONLY");
		lblNewLabel_3.setBounds(59, 146, 111, 26);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_3);
		
		brokeneggstextField_2 = new JTextField();
		brokeneggstextField_2.setBounds(176, 143, 103, 20);
		frmSupplyProvissioned.getContentPane().add(brokeneggstextField_2);
		brokeneggstextField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("SPOILT EGGS");
		lblNewLabel_4.setToolTipText("NUMBERS ONLY ");
		lblNewLabel_4.setBounds(59, 186, 111, 26);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_4);
		
		spoilteggstextField_3 = new JTextField();
		spoilteggstextField_3.setBounds(176, 183, 103, 20);
		frmSupplyProvissioned.getContentPane().add(spoilteggstextField_3);
		spoilteggstextField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("USERNAME");
		lblNewLabel_5.setBounds(59, 253, 86, 26);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_5);
		
		usernametextField_4 = new JTextField();
		usernametextField_4.setBounds(176, 259, 103, 20);
		frmSupplyProvissioned.getContentPane().add(usernametextField_4);
		usernametextField_4.setColumns(10);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("PASSWORD");
		lblNewLabel_6.setBounds(59, 290, 111, 20);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("SUBMIT ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Database DB = new  Database();
				if (workstationtextField.getText().isEmpty()||collectedeggstextField_1.getText().isEmpty()||brokeneggstextField_2.getText().isEmpty()
						||spoilteggstextField_3.getText().isEmpty()||usernametextField_4.getText().isEmpty()||passwordField.getText().isEmpty()){
					JOptionPane.showMessageDialog(new JFrame(), ("Please Complete all Feilds "));
					
				}else{
					try{
						int col = Integer.parseInt(collectedeggstextField_1.getText());
						int bro = Integer.parseInt(brokeneggstextField_2.getText());
						int spo = Integer.parseInt(spoilteggstextField_3.getText());
						if (col<0||bro<0||spo<0){
							JOptionPane.showMessageDialog(new JFrame(), "Please enter positive numbers only ");
							
							}else{
								if(DB.verifySubordinate(usernametextField_4.getText(), passwordField.getText())==true){
									Fullname=DB.getSubordinateFullName(usernametextField_4.getText(), passwordField.getText());
									employeeid=DB.getSubordinateEmployeeID(usernametextField_4.getText(), passwordField.getText());
									collected=collectedeggstextField_1.getText();
									broken=brokeneggstextField_2.getText();
									spoilt=spoilteggstextField_3.getText();
									section=workstationtextField.getText();
								     textArea.append("\tName "+Fullname+"\n");
									 textArea.append("\tID  "+employeeid+"\n");
									 textArea.append("\tWork Station  "+section+"\n");
									 textArea.append("\tCollected Eggs  "+collected+"\n");
									 textArea.append("\tBroken Eggs  "+broken+"\n");
									 textArea.append("\tSpoiled Eggs  "+spoilt+"\n");
								 
							}else{
								JOptionPane.showMessageDialog(new JFrame(), ("Invalid Username or Password "));
								
							}
								
								
							
							
						}
						}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(new JFrame(), "Please Ensure that you "
								+ "enterd an Integer  for amounts Collected, Spoilt and Broken");
						
						}
					
				}
				 
				
			}
		});
		btnNewButton.setBounds(193, 337, 89, 23);
		frmSupplyProvissioned.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("VERIFY IDENTITY");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_7.setBounds(106, 234, 105, 14);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 232, 270, 14);
		frmSupplyProvissioned.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(305, 48, 11, 312);
		frmSupplyProvissioned.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("SAVE  DATA ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(employeeid==null || Fullname==null||collected==null||spoilt==null||broken==null||section==null){
					JOptionPane.showMessageDialog(new JFrame(), "Please Submit Data set Before Saving");
					
				}else{
					InternalEggsSupply IES =new InternalEggsSupply(Fullname, section, employeeid, collected, spoilt, broken);
					String employeeid=null;
					String Fullname=null;
				    String collected=null;
					String spoilt=null;
					String broken=null;
					String section=null;
					usernametextField_4.setText(null);
					passwordField.setText(null);
					collectedeggstextField_1.setText(null);
					brokeneggstextField_2.setText(null);
					spoilteggstextField_3.setText(null);
					workstationtextField.setText(null);
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(513, 367, 131, 23);
		frmSupplyProvissioned.getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(333, 55, 311, 255);
		frmSupplyProvissioned.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_8 = new JLabel("PREVIEW ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(446, 28, 105, 32);
		frmSupplyProvissioned.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("BACK ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUBORDINATEMENUFRAME window = new SUBORDINATEMENUFRAME();
					window.frmSupplyProvisionsUnits.setVisible(true);
					frmSupplyProvissioned.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setBounds(14, 367, 168, 23);
		frmSupplyProvissioned.getContentPane().add(btnNewButton_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 290, 103, 20);
		frmSupplyProvissioned.getContentPane().add(passwordField);
	}
}
