package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SUBORDINATEDATA {

	JFrame frmSubordinateData;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUBORDINATEDATA window = new SUBORDINATEDATA();
					window.frmSubordinateData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SUBORDINATEDATA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubordinateData = new JFrame();
		frmSubordinateData.setTitle("SUBORDINATE DATA");
		frmSubordinateData.setBounds(100, 100, 889, 458);
		frmSubordinateData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubordinateData.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(30, 36, 815, 332);
		frmSubordinateData.getContentPane().add(scrollPane);
		Database DB =new Database();
		table = new JTable();
		table.setEnabled(false);
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(DB.readsubordinatedata(),
			new String[] {
				"Title", "FirstName", "LastName", "Position", "Email Address", "Contact", "Username", "Password", "EmployeeID"
			}
		));
		
		JLabel lblNewLabel = new JLabel("SUBORDINATE DATA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(340, 11, 273, 22);
		frmSubordinateData.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUPERVISORMENU window = new SUPERVISORMENU();
					window.frmSupervisorMenu.setVisible(true);
					frmSubordinateData.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(74, 379, 143, 29);
		frmSubordinateData.getContentPane().add(btnNewButton);
	}
}
