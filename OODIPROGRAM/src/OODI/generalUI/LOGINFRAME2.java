package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class LOGINFRAME2 {

	JFrame frmSubordinateLogin;
	private JTextField username;
	private JPasswordField passwordField;
	 Database DB =new Database();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINFRAME2 window = new LOGINFRAME2();
					window.frmSubordinateLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public LOGINFRAME2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubordinateLogin = new JFrame();
		frmSubordinateLogin.getContentPane().setBackground(new Color(144, 238, 144));
		frmSubordinateLogin.setTitle("SUBORDINATE LOGIN");
		frmSubordinateLogin.setBounds(100, 100, 576, 384);
		frmSubordinateLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubordinateLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(107, 101, 110, 28);
		frmSubordinateLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(107, 157, 110, 28);
		frmSubordinateLogin.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(236, 105, 171, 20);
		frmSubordinateLogin.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(236, 161, 171, 20);
		frmSubordinateLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("MAINMENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					FRAME1 window = new FRAME1();
					window.frmTheEggFarm.setVisible(true);
					frmSubordinateLogin.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(67, 259, 150, 23);
		frmSubordinateLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (DB.verifySubordinate(username.getText(), passwordField.getText())==true){
					
					//JOptionPane.showMessageDialog(new JFrame(), ("verified "));	
					try {
						SUBORDINATEMENUFRAME window = new SUBORDINATEMENUFRAME();
						window.frmSupplyProvisionsUnits.setVisible(true);
						frmSubordinateLogin.setVisible(false);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(new JFrame(), (	e));
					}
					
				}else{
					
					JOptionPane.showMessageDialog(new JFrame(), ("Invalid Username or Password "));		
					
				}
				
				
			}
		});
		btnNewButton_1.setBounds(330, 259, 150, 23);
		frmSubordinateLogin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("SUBORDINATE, PLEASE LOGIN AND GET TO WORK ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(46, 22, 470, 42);
		frmSubordinateLogin.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 75, 526, 14);
		frmSubordinateLogin.getContentPane().add(separator);
		
		Date d= new Date();
		JTextArea textArea = new JTextArea(d.toString());
		textArea.setBackground(new Color(144, 238, 144));
		textArea.setEditable(false);
		textArea.setBounds(324, 11, 236, 33);
		frmSubordinateLogin.getContentPane().add(textArea);
	}
}
