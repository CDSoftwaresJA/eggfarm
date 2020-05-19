package OODI;

import java.awt.EventQueue;
import OOD.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Choice;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;

import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADDEXTERNALEGGSUPPLY {

	JFrame frmAddExternalSupply;
	private JTextField ESfirstnametextField;
	private JTextField ESlastnametextField;
	private JTextField EggsupplytextField;
	private Choice daychoice;
	private Choice monthchoice_1;
	private Choice yearchoice_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDEXTERNALEGGSUPPLY window = new ADDEXTERNALEGGSUPPLY();
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
	public ADDEXTERNALEGGSUPPLY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddExternalSupply = new JFrame();
		frmAddExternalSupply.setTitle("ADD EXTERNAL SUPPLY");
		frmAddExternalSupply.getContentPane().setBackground(new Color(72, 209, 204));
		frmAddExternalSupply.setBounds(100, 100, 581, 427);
		frmAddExternalSupply.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddExternalSupply.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD EXTERNAL EGG SUPPLY ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(147, 30, 347, 37);
		frmAddExternalSupply.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST NAME ");
		lblNewLabel_1.setBounds(113, 96, 104, 37);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_1);
		
		ESfirstnametextField = new JTextField();
		ESfirstnametextField.setBounds(249, 100, 137, 29);
		frmAddExternalSupply.getContentPane().add(ESfirstnametextField);
		ESfirstnametextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("LAST NAME");
		lblNewLabel_2.setBounds(113, 136, 93, 37);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_2);
		
		ESlastnametextField = new JTextField();
		ESlastnametextField.setBounds(249, 140, 137, 29);
		frmAddExternalSupply.getContentPane().add(ESlastnametextField);
		ESlastnametextField.setColumns(10);
		
		EggsupplytextField = new JTextField();
		EggsupplytextField.setBounds(249, 180, 137, 29);
		frmAddExternalSupply.getContentPane().add(EggsupplytextField);
		EggsupplytextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("EGG SUPPLY ");
		lblNewLabel_3.setBounds(113, 178, 127, 33);
		frmAddExternalSupply.getContentPane().add(lblNewLabel_3);
		
		daychoice = new Choice();
		daychoice.setBounds(181, 288, 61, 20);
		daychoice.add("1");
		daychoice.add("2");
		daychoice.add("3");
		daychoice.add("4");
		daychoice.add("5");
		daychoice.add("6");
		daychoice.add("7");
		daychoice.add("8");
		daychoice.add("9");
		daychoice.add("10");
		daychoice.add("11");
		daychoice.add("12");
		daychoice.add("13");
		daychoice.add("14");
		daychoice.add("15");
		daychoice.add("16");
		daychoice.add("17");
		daychoice.add("18");
		daychoice.add("17");
		daychoice.add("20");
		daychoice.add("21");
		daychoice.add("22");
		daychoice.add("23");
		daychoice.add("24");
		daychoice.add("25");
		daychoice.add("26");
		daychoice.add("27");
		daychoice.add("28");
		daychoice.add("29");
		daychoice.add("30");
		daychoice.add("31");
		frmAddExternalSupply.getContentPane().add(daychoice);
		
		monthchoice_1 = new Choice();
		monthchoice_1.setBounds(262, 288, 61, 20);
		monthchoice_1.add("1");
		monthchoice_1.add("2");
		monthchoice_1.add("3");
		monthchoice_1.add("4");
		monthchoice_1.add("5");
		monthchoice_1.add("6");
		monthchoice_1.add("7");
		monthchoice_1.add("8");
		monthchoice_1.add("9");
		monthchoice_1.add("10");
		monthchoice_1.add("11");
		monthchoice_1.add("12");
		frmAddExternalSupply.getContentPane().add(monthchoice_1);
		
		yearchoice_2 = new Choice();
		yearchoice_2.setBounds(344, 288, 80, 20);
		yearchoice_2.add("2019");
		yearchoice_2.add("2020");
		yearchoice_2.add("2021");
		yearchoice_2.add("2022");
		yearchoice_2.add("2023");
		yearchoice_2.add("2024");
		yearchoice_2.add("2025");
		yearchoice_2.add("2026");
		yearchoice_2.add("2027");
		yearchoice_2.add("2028");
		yearchoice_2.add("2029");
		yearchoice_2.add("2030");
		frmAddExternalSupply.getContentPane().add(yearchoice_2);
		
		Label label = new Label("Date");
		label.setFont(new Font("Dialog", Font.PLAIN, 12));
		label.setBounds(113, 286, 62, 22);
		frmAddExternalSupply.getContentPane().add(label);
		
		Label label_1 = new Label("Day");
		label_1.setBounds(196, 260, 62, 22);
		frmAddExternalSupply.getContentPane().add(label_1);
		
		Label label_2 = new Label("Month");
		label_2.setBounds(274, 260, 62, 22);
		frmAddExternalSupply.getContentPane().add(label_2);
		
		Label label_3 = new Label("Year");
		label_3.setBounds(362, 260, 62, 22);
		frmAddExternalSupply.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ESfirstnametextField.getText().isEmpty()||ESlastnametextField.getText().isEmpty()
						||EggsupplytextField.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "One or More  Empty Feilds Detected ", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					
				}else{
					try{
						Integer.parseInt(EggsupplytextField.getText());
						String date=daychoice.getSelectedItem()+"/"+monthchoice_1.getSelectedItem()+"/"+yearchoice_2.getSelectedItem();
						//ESlastnametextField.setText(date);
						
						 Database Db =new Database();
						 if(Db.verifyExternaleggsupplier(ESfirstnametextField.getText(), ESlastnametextField.getText())){
							 						 
							new EXTERNALEGGSUPPLY(EggsupplytextField.getText(), date);
							 						 
						 }else{
							 
								JOptionPane.showMessageDialog(null, "External Egg supplier not Recognized ", "UNKNOWN RECORDS",
										JOptionPane.INFORMATION_MESSAGE);
						 }
						
					}catch(NumberFormatException e){
						
						JOptionPane.showMessageDialog(null, " Incorrect Data Type Detected ", "ERROR",
								JOptionPane.ERROR_MESSAGE);
						
									
					}
					
				}
				
				
				
			}
		});
		btnNewButton.setBounds(412, 328, 127, 34);
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
		btnNewButton_1.setBounds(27, 328, 127, 34);
		frmAddExternalSupply.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 240, 514, 20);
		frmAddExternalSupply.getContentPane().add(separator);
		
	}
}
