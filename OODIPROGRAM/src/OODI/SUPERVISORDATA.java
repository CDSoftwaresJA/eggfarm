package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SUPERVISORDATA {

	JFrame frmSupervisorData;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUPERVISORDATA window = new SUPERVISORDATA();
					window.frmSupervisorData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SUPERVISORDATA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSupervisorData = new JFrame();
		frmSupervisorData.setTitle("SUPERVISOR DATA");
		frmSupervisorData.setBounds(100, 100, 882, 477);
		frmSupervisorData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSupervisorData.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 806, 339);
		frmSupervisorData.getContentPane().add(scrollPane);
		
		Database DB =new Database();
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(DB.readsupervisordata(),
			new String[] {
				"Title", "FirstName", "LastName", "Position", "Email Address", "Contact", "Username", "Password", "EmployeeID"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(37);
		table.getColumnModel().getColumn(1).setPreferredWidth(72);
		table.getColumnModel().getColumn(2).setPreferredWidth(63);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		
		JLabel lblNewLabel = new JLabel("SUPERVISOR DATA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(320, 11, 272, 29);
		frmSupervisorData.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(50, 349, 141, 29);
		frmSupervisorData.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUPERVISORMENU window = new SUPERVISORMENU();
					window.frmSupervisorMenu.setVisible(true);
					frmSupervisorData.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(91, 398, 155, 29);
		frmSupervisorData.getContentPane().add(btnNewButton_1);
	}
}
