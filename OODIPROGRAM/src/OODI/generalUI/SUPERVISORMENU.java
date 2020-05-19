package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SUPERVISORMENU {

	JFrame frmSupervisorMenu;
	protected Object framei;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUPERVISORMENU window = new SUPERVISORMENU();
					window.frmSupervisorMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SUPERVISORMENU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSupervisorMenu = new JFrame();
		frmSupervisorMenu.setTitle("SUPERVISOR MENU");
		frmSupervisorMenu.getContentPane().setBackground(new Color(95, 158, 160));
		frmSupervisorMenu.setBounds(100, 100, 580, 460);
		frmSupervisorMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupervisorMenu.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT YOUR OPTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(168, 11, 302, 36);
		frmSupervisorMenu.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton(" ADD EXTERNAL \r\n EGG SUPPLYIER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ADDEXTERNALSUPPLIERFRAME window = new ADDEXTERNALSUPPLIERFRAME();
					window.frmAddExternalSupply.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(45, 68, 226, 51);
		frmSupervisorMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD EXTERNAL EGG SUPPLY ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ADDEXTERNALEGGSUPPLY window = new ADDEXTERNALEGGSUPPLY();
					window.frmAddExternalSupply.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(281, 68, 226, 51);
		frmSupervisorMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("CREATE REPORTS ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					INTERNALSUPPLY window = new INTERNALSUPPLY();
					window.frame.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setBounds(281, 127, 226, 54);
		frmSupervisorMenu.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("VIEW SUBORDINATE DATA");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUBORDINATEDATA window = new SUBORDINATEDATA();
					window.frmSubordinateData.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton_4.setBounds(45, 192, 226, 51);
		frmSupervisorMenu.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("VIEW SUPERVISOR DATA");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUPERVISORDATA window = new SUPERVISORDATA();
					window.frmSupervisorData.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		
		});
		btnNewButton_5.setBounds(281, 192, 226, 51);
		frmSupervisorMenu.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("LOGOUT");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					LOGINFRAME window = new LOGINFRAME();
					window.frmSupervisorLogin.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(411, 374, 116, 23);
		frmSupervisorMenu.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("MAIN MENU");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FRAME1 window = new FRAME1();
					window.frmTheEggFarm.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_7.setBounds(45, 374, 139, 23);
		frmSupervisorMenu.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("VIEW EXTERNAL EGG SUPPLYERS");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					EXTERNALSUPPLIERSDATA window = new EXTERNALSUPPLIERSDATA();
					window.frmExternalSuppliersData.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_8.setBounds(45, 254, 226, 56);
		frmSupervisorMenu.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("VIEW EXTERNAL EGG SUPPLY");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					VIEWEXTERNALSUPPLY window = new VIEWEXTERNALSUPPLY();
					window.frame.setVisible(true);
					frmSupervisorMenu.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_9.setBounds(45, 127, 226, 56);
		frmSupervisorMenu.getContentPane().add(btnNewButton_9);
	}
}
