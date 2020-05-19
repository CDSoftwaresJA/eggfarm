package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;
import java.awt.Window;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class LOGINFRAME {

	JFrame frmSupervisorLogin;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINFRAME window = new LOGINFRAME();
					window.frmSupervisorLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGINFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSupervisorLogin = new JFrame();
		frmSupervisorLogin.setTitle("SUPERVISOR LOGIN");
		frmSupervisorLogin.getContentPane().setBackground(new Color(30, 144, 255));
		frmSupervisorLogin.setBounds(100, 100, 597, 394);
		frmSupervisorLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupervisorLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME ");
		lblNewLabel.setBounds(140, 108, 116, 31);
		frmSupervisorLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD\r\n");
		lblNewLabel_1.setBounds(140, 163, 90, 31);
		frmSupervisorLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLEASE LOGIN OH NOBEL SUPERVISOR ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(125, 26, 399, 31);
		frmSupervisorLogin.getContentPane().add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(241, 113, 193, 20);
		frmSupervisorLogin.getContentPane().add(username);
		username.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Database DB =new Database();
				if (DB.verifySupervisor(username.getText(), passwordField.getText())==true){
					
					try {
						SUPERVISORMENU window = new SUPERVISORMENU();
						window.frmSupervisorMenu.setVisible(true);
						frmSupervisorLogin.setVisible(false);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					//JOptionPane.showMessageDialog(new JFrame(), ("verified "));		
					
				}else{
					
					JOptionPane.showMessageDialog(new JFrame(), ("Invalid Username or Password "));		
					
				}
				
				
			}
		});
		btnNewButton.setBounds(369, 262, 127, 23);
		frmSupervisorLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MAIN MENU");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					FRAME1 window = new FRAME1();
					window.frmTheEggFarm.setVisible(true);
					frmSupervisorLogin.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(76, 262, 154, 23);
		frmSupervisorLogin.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(240, 168, 194, 20);
		frmSupervisorLogin.getContentPane().add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 68, 549, 22);
		frmSupervisorLogin.getContentPane().add(separator);
		
		Date d= new Date();
		JTextArea textArea = new JTextArea(d.toString());
		textArea.setBackground(new Color(30, 144, 255));
		textArea.setEditable(false);
		textArea.setBounds(350, 8, 236, 33);
		frmSupervisorLogin.getContentPane().add(textArea);
	}
}
