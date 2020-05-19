package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ADDEXTERNALSUPPLIERFRAME {

	JFrame frmAddExternalSupply;
	private JTextField firstnametextField;
	private JTextField lastnametextField;
	private JTextField farmaddresstextField;
	private JTextField EScontacttextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDEXTERNALSUPPLIERFRAME window = new ADDEXTERNALSUPPLIERFRAME();
					window.frmAddExternalSupply.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ADDEXTERNALSUPPLIERFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddExternalSupply = new JFrame();
		frmAddExternalSupply.getContentPane().setBackground(new Color(144, 238, 144));
		frmAddExternalSupply.setTitle("ADD EXTERNAL SUPPLY ");
		frmAddExternalSupply.setBounds(100, 100, 593, 432);
		frmAddExternalSupply.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddExternalSupply.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIRST NAME ");
		lblNewLabel.setBounds(133, 108, 94, 43);
		frmAddExternalSupply.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PLEASE ADD THE  EXTERNAL SUPPLYER'S DETAILS ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(47, 52, 508, 43);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LAST NAME ");
		lblNewLabel_2.setBounds(133, 162, 94, 43);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FARM ADDRESS ");
		lblNewLabel_3.setBounds(133, 216, 94, 37);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CONTACT NUMBER ");
		lblNewLabel_4.setBounds(133, 279, 118, 29);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_4);
		
		firstnametextField = new JTextField();
		firstnametextField.setBounds(279, 113, 155, 29);
		frmAddExternalSupply.getContentPane().add(firstnametextField);
		firstnametextField.setColumns(10);
		
		lastnametextField = new JTextField();
		lastnametextField.setBounds(279, 167, 155, 29);
		frmAddExternalSupply.getContentPane().add(lastnametextField);
		lastnametextField.setColumns(10);
		
		farmaddresstextField = new JTextField();
		farmaddresstextField.setBounds(279, 218, 155, 29);
		frmAddExternalSupply.getContentPane().add(farmaddresstextField);
		farmaddresstextField.setColumns(10);
		
		EScontacttextField = new JTextField();
		EScontacttextField.setBounds(279, 277, 155, 29);
		frmAddExternalSupply.getContentPane().add(EScontacttextField);
		EScontacttextField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(firstnametextField.getText().isEmpty()||lastnametextField.getText().isEmpty()||farmaddresstextField.getText().isEmpty()
						||EScontacttextField.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "One or More Empty Feilds Detected ", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					
				} else{
					
					
					try{
						Integer.parseInt(EScontacttextField.getText());
						
						 new EXTERNALEGGSUPPLYER(firstnametextField.getText(),lastnametextField.getText(),farmaddresstextField.getText(),
								 EScontacttextField.getText());
						 firstnametextField.setText(null);
						 lastnametextField.setText(null);
						 farmaddresstextField.setText(null);
						 EScontacttextField.setText(null);
					}catch(NumberFormatException e)
					{
						
						JOptionPane.showMessageDialog(null, " Incorrect Data Type  in Contact Number Feild ", "ERROR",
								JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
			}
		});
		btnNewButton.setBounds(379, 346, 133, 29);
		frmAddExternalSupply.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUPERVISORMENU window = new SUPERVISORMENU();
					window.frmSupervisorMenu.setVisible(true);
					frmAddExternalSupply.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}

			
			}
		});
		btnNewButton_1.setBounds(62, 346, 140, 29);
		frmAddExternalSupply.getContentPane().add(btnNewButton_1);
	}
}
