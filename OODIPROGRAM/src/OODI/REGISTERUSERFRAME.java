package OODI;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JSeparator;

public class REGISTERUSERFRAME {

	JFrame frmEggFarmRegestration;
	private JTextField firstnameField;
	private JTextField lastnameField;
	private JTextField titleField_2;
	private JTextField emailField_3;
	private JTextField contactnumberField;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTERUSERFRAME window = new REGISTERUSERFRAME();
					window.frmEggFarmRegestration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public REGISTERUSERFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEggFarmRegestration = new JFrame();
		frmEggFarmRegestration.getContentPane().setBackground(new Color(175, 238, 238));
		frmEggFarmRegestration.setTitle("EGG FARM REGISTRATION");
		frmEggFarmRegestration.setBounds(100, 100, 555, 381);
		frmEggFarmRegestration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEggFarmRegestration.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER  THE  NEWBIE PLEASE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(122, 27, 325, 45);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("POSITION ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(52, 153, 91, 14);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_1);
		ButtonGroup G = new ButtonGroup();
		
		final JRadioButton supervisor = new JRadioButton("SUPERVISOR ");
		supervisor.setBackground(new Color(175, 238, 238));
		supervisor.setBounds(34, 174, 109, 23);
		frmEggFarmRegestration.getContentPane().add(supervisor);
		
		final JRadioButton subordinate = new JRadioButton("SUBORDINATE ");
		subordinate.setBackground(new Color(175, 238, 238));
		subordinate.setBounds(34, 200, 109, 23);
		frmEggFarmRegestration.getContentPane().add(subordinate);
		G.add(supervisor);
		G.add(subordinate);
		
		firstnameField = new JTextField();
		firstnameField.setBounds(199, 122, 127, 20);
		frmEggFarmRegestration.getContentPane().add(firstnameField);
		firstnameField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FIRST NAME \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(199, 97, 92, 14);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LAST NAME \r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(399, 95, 72, 14);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_3);
		
		lastnameField = new JTextField();
		lastnameField.setBounds(393, 122, 121, 20);
		frmEggFarmRegestration.getContentPane().add(lastnameField);
		lastnameField.setColumns(10);
		
		titleField_2 = new JTextField();
		titleField_2.setBounds(34, 122, 104, 20);
		frmEggFarmRegestration.getContentPane().add(titleField_2);
		titleField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("TITLE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(38, 95, 46, 14);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EMAIL ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(212, 153, 96, 37);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_5);
		
		emailField_3 = new JTextField();
		emailField_3.setBounds(199, 201, 127, 20);
		frmEggFarmRegestration.getContentPane().add(emailField_3);
		emailField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CONTACT NUMBER ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(393, 153, 121, 37);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_6);
		
		contactnumberField = new JTextField();
		contactnumberField.setBounds(393, 201, 121, 20);
		frmEggFarmRegestration.getContentPane().add(contactnumberField);
		contactnumberField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("USERNAME ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(34, 241, 91, 14);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("PASSWORD ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(199, 241, 109, 14);
		frmEggFarmRegestration.getContentPane().add(lblNewLabel_8);
		
		usernameField = new JTextField();
		usernameField.setBounds(34, 266, 109, 20);
		frmEggFarmRegestration.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (firstnameField.getText().isEmpty()||lastnameField.getText().isEmpty()||
						titleField_2.getText().isEmpty()||  emailField_3.getText().isEmpty()||
						contactnumberField.getText().isEmpty()|| usernameField.getText().isEmpty()||
						passwordField.getText().isEmpty() || (subordinate.isSelected()==false && supervisor.isSelected()==false)){
					JOptionPane.showMessageDialog(new JFrame(), "Please Fill out All the feilds");
					
				}else
				if (subordinate.isSelected()==true){
					Subordinate Subordinate1= new Subordinate(titleField_2.getText(),firstnameField.getText(),lastnameField.getText(),"Subordinate", emailField_3.getText(),contactnumberField.getText(),
							 usernameField.getText(),passwordField.getText());
					
					
				}
				if(supervisor.isSelected()==true){
					
					Supervisor Supervisor1 =new Supervisor(titleField_2.getText(),firstnameField.getText(),lastnameField.getText(),"Supervisor", emailField_3.getText(),contactnumberField.getText(),
							 usernameField.getText(),passwordField.getText());
				}
				
				firstnameField.setText(null);
				lastnameField.setText(null);
				titleField_2.setText(null);
				emailField_3.setText(null);
				contactnumberField.setText(null);
				usernameField.setText(null);
				passwordField.setText(null);
			}
				
			
			
			
			
			
			
		});
		btnNewButton.setBounds(417, 308, 89, 23);
		frmEggFarmRegestration.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(112, 256, 136, -51);
		frmEggFarmRegestration.getContentPane().add(list);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Do not forget this ");
		passwordField.setBounds(199, 266, 136, 20);
		frmEggFarmRegestration.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Main Menu ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					FRAME1 window = new FRAME1();
					window.frmTheEggFarm.setVisible(true);
					frmEggFarmRegestration.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(34, 308, 180, 23);
		frmEggFarmRegestration.getContentPane().add(btnNewButton_1);
		
		Date d= new Date();
		JTextArea textArea = new JTextArea(d.toString());
		textArea.setBackground(new Color(175, 238, 238));
		textArea.setEditable(false);
		textArea.setBounds(282, 11, 236, 33);
		frmEggFarmRegestration.getContentPane().add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 72, 519, 14);
		frmEggFarmRegestration.getContentPane().add(separator);
	}
}
