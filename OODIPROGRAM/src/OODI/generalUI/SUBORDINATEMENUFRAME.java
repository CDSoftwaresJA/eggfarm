package OODI.generalUI;


import java.awt.EventQueue;
import OOD.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JSeparator;

public class SUBORDINATEMENUFRAME {

	JFrame frmSupplyProvisionsUnits;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUBORDINATEMENUFRAME window = new SUBORDINATEMENUFRAME();
					window.frmSupplyProvisionsUnits.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SUBORDINATEMENUFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSupplyProvisionsUnits = new JFrame();
		frmSupplyProvisionsUnits.setTitle("SUPPLY PROVISIONS/UNITS PRODUCABLE");
		frmSupplyProvisionsUnits.getContentPane().setBackground(new Color(0, 255, 255));
		frmSupplyProvisionsUnits.setBounds(100, 100, 597, 373);
		frmSupplyProvisionsUnits.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupplyProvisionsUnits.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SUPPLY PROVISIONS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUPPLYPROVISIONSFRAME window = new SUPPLYPROVISIONSFRAME();
					window.frmSupplyProvissioned.setVisible(true);
					frmSupplyProvisionsUnits.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(340, 93, 183, 73);
		frmSupplyProvisionsUnits.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("SELCET OPERATION ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(190, 11, 204, 43);
		frmSupplyProvisionsUnits.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("MAIN MENU");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FRAME1 window = new FRAME1();
					window.frmTheEggFarm.setVisible(true);
					frmSupplyProvisionsUnits.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(58, 206, 158, 23);
		frmSupplyProvisionsUnits.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					LOGINFRAME2 window = new LOGINFRAME2();
					window.frmSubordinateLogin.setVisible(true);
					frmSupplyProvisionsUnits.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(371, 206, 152, 23);
		frmSupplyProvisionsUnits.getContentPane().add(btnNewButton_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 77, 414, -20);
		frmSupplyProvisionsUnits.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 52, 551, 11);
		frmSupplyProvisionsUnits.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("UNITS PRODUCABLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UNITSPRODUCABLEFRAME window = new UNITSPRODUCABLEFRAME();
					window.frmUnitsProducable.setVisible(true);
					frmSupplyProvisionsUnits.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(58, 93, 191, 73);
		frmSupplyProvisionsUnits.getContentPane().add(btnNewButton_1);
	}
}
