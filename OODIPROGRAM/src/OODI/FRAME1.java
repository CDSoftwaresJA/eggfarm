package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.UIManager;

import java.awt.Font;
import java.util.Date;

import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class FRAME1 {

	JFrame frmTheEggFarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRAME1 window = new FRAME1();
					window.frmTheEggFarm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FRAME1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheEggFarm = new JFrame();
		frmTheEggFarm.setTitle("THE EGG FARM ");
		frmTheEggFarm.getContentPane().setBackground(new Color(135, 206, 235));
		frmTheEggFarm.setBounds(100, 100, 595, 335);
		frmTheEggFarm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheEggFarm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME,PLEASE VERIFY YOUR IDENTITY ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(109, 8, 368, 66);
		frmTheEggFarm.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SUPERVISOR\r\n");
		btnNewButton.setBackground(UIManager.getColor("Button.light"));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					LOGINFRAME window = new LOGINFRAME();
					window.frmSupervisorLogin.setVisible(true);
					frmTheEggFarm.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(186, 85, 189, 33);
		frmTheEggFarm.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NEWBIE");
		btnNewButton_1.setBackground(UIManager.getColor("Button.light"));
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					REGISTERUSERFRAME window = new REGISTERUSERFRAME();
					window.frmEggFarmRegestration.setVisible(true);
					frmTheEggFarm.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(186, 200, 189, 33);
		frmTheEggFarm.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SUBORDINATE ");
		btnNewButton_2.setForeground(new Color(0, 153, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					LOGINFRAME2 window = new LOGINFRAME2();
					window.frmSubordinateLogin.setVisible(true);
					frmTheEggFarm.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(186, 144, 189, 33);
		frmTheEggFarm.getContentPane().add(btnNewButton_2);
		
		Date d= new Date();
		JTextArea textArea = new JTextArea(d.toString());
		textArea.setBackground(new Color(135, 206, 250));
		textArea.setEditable(false);
		textArea.setBounds(350, 8, 236, 33);
		frmTheEggFarm.getContentPane().add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(427, 72, 176, 16);
		frmTheEggFarm.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(422, 85, 19, 187);
		frmTheEggFarm.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 72, 131, 24);
		frmTheEggFarm.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(140, 85, 19, 187);
		frmTheEggFarm.getContentPane().add(separator_3);
		
			
	}
}
