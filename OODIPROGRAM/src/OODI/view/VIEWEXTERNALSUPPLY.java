package OODI.view;

import java.awt.EventQueue;
import OOD.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VIEWEXTERNALSUPPLY {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIEWEXTERNALSUPPLY window = new VIEWEXTERNALSUPPLY();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VIEWEXTERNALSUPPLY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 607, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Database DB =new Database();
		
		JLabel lblNewLabel = new JLabel("External Egg Supply ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(212, 11, 251, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(26, 47, 531, 268);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setFillsViewportHeight(true);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		table.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			DB.readFromexternaleggsupply(),
			new String[] {
				"Eggs Collected ", "Date Collected"
			}
		));
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					SUPERVISORMENU window = new SUPERVISORMENU();
					window.frmSupervisorMenu.setVisible(true);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(37, 343, 143, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
