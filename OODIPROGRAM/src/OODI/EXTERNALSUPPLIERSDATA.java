package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EXTERNALSUPPLIERSDATA {

	JFrame frmExternalSuppliersData;
	private JTable table;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EXTERNALSUPPLIERSDATA window = new EXTERNALSUPPLIERSDATA();
					window.frmExternalSuppliersData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EXTERNALSUPPLIERSDATA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExternalSuppliersData = new JFrame();
		frmExternalSuppliersData.setTitle("EXTERNAL SUPPLIERS DATA");
		frmExternalSuppliersData.setBounds(100, 100, 734, 434);
		frmExternalSuppliersData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExternalSuppliersData.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 42, 594, 278);
		frmExternalSuppliersData.getContentPane().add(scrollPane);
		Database DB =new Database();
		table = new JTable();
		table.setEnabled(false);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			DB.readFromexternalsuppliers(),
			new String[] {
				"First Name", "Last Name", "Farm Address", "Contact"
			}
		));
		
		lblNewLabel = new JLabel("EXTERNAL SUPPLIERS ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(256, 11, 271, 34);
		frmExternalSuppliersData.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUPERVISORMENU window = new SUPERVISORMENU();
					window.frmSupervisorMenu.setVisible(true);
					frmExternalSuppliersData.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(72, 338, 147, 29);
		frmExternalSuppliersData.getContentPane().add(btnNewButton);
	}

}
