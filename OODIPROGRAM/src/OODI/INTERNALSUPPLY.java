package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INTERNALSUPPLY {

    JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INTERNALSUPPLY window = new INTERNALSUPPLY();
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
	public INTERNALSUPPLY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 60, 574, 278);
		frame.getContentPane().add(scrollPane);
		Database DB =new Database();
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setEnabled(false);
		table_1.setFillsViewportHeight(true);
		table_1.setModel(new DefaultTableModel(
				DB.readFromInternalsupply(),
			new String[] {
				"Full Name", "Work Station", "Employee ID", "Collected ", "Spoilt", "Broken "
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
		btnNewButton.setBounds(33, 349, 143, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("INTERNAL SUPPLY ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(205, 11, 224, 38);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
