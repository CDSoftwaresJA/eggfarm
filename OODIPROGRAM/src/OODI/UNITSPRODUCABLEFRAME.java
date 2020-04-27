package OODI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.JSeparator;

import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UNITSPRODUCABLEFRAME {

	JFrame frmUnitsProducable;
	private JTextArea maxeggtextarea;
	private TextArea textArea;
	private JRadioButton liquideggsRadioButton;
	private JRadioButton boiledRadioButton;
	private JRadioButton smallRadioButton;
	private JRadioButton mediumRadioButton;
	private JRadioButton largeRadioButton;
	private JRadioButton eggwhitsRadioButton;
	private int TotalEggs=-999999;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UNITSPRODUCABLEFRAME window = new UNITSPRODUCABLEFRAME();
					window.frmUnitsProducable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UNITSPRODUCABLEFRAME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnitsProducable = new JFrame();
		frmUnitsProducable.setTitle("UNITS PRODUCABLE \r\n");
		frmUnitsProducable.getContentPane().setBackground(new Color(176, 224, 230));
		frmUnitsProducable.setBounds(100, 100, 633, 471);
		frmUnitsProducable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnitsProducable.getContentPane().setLayout(null);
		
		ButtonGroup type =new ButtonGroup();
		eggwhitsRadioButton = new JRadioButton("EGG WHITES");
		eggwhitsRadioButton.setBackground(new Color(176, 224, 230));
		eggwhitsRadioButton.setBounds(65, 135, 138, 23);
		frmUnitsProducable.getContentPane().add(eggwhitsRadioButton);
		
		liquideggsRadioButton = new JRadioButton("LIQUID EGGS");
		liquideggsRadioButton.setBackground(new Color(176, 224, 230));
		liquideggsRadioButton.setBounds(272, 135, 138, 23);
		frmUnitsProducable.getContentPane().add(liquideggsRadioButton);
		
		boiledRadioButton = new JRadioButton("BOILLED ");
		boiledRadioButton.setBackground(new Color(176, 224, 230));
		boiledRadioButton.setBounds(452, 135, 109, 23);
		frmUnitsProducable.getContentPane().add(boiledRadioButton);
		type.add(boiledRadioButton);
		type.add(liquideggsRadioButton);
		type.add(eggwhitsRadioButton);
		
		JLabel lblNewLabel = new JLabel("SELECT THE TYPE AND SIZE  YOU WISH TO SEUDO PRODUCE ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(55, 110, 472, 18);
		frmUnitsProducable.getContentPane().add(lblNewLabel);
		
		ButtonGroup size =new ButtonGroup();
		smallRadioButton = new JRadioButton("SMALL ");
		smallRadioButton.setBackground(new Color(176, 224, 230));
		smallRadioButton.setBounds(68, 174, 109, 23);
		frmUnitsProducable.getContentPane().add(smallRadioButton);
		
		mediumRadioButton = new JRadioButton("MEDIUM");
		mediumRadioButton.setBackground(new Color(176, 224, 230));
		mediumRadioButton.setBounds(272, 174, 109, 23);
		frmUnitsProducable.getContentPane().add(mediumRadioButton);
		
		largeRadioButton = new JRadioButton("LARGE");
		largeRadioButton.setBackground(new Color(176, 224, 230));
		largeRadioButton.setBounds(452, 174, 109, 23);
		frmUnitsProducable.getContentPane().add(largeRadioButton);
		size.add(smallRadioButton);
		size.add(mediumRadioButton);
		size.add(largeRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("5 EGGS PER PACK");
		lblNewLabel_1.setBounds(71, 206, 132, 18);
		frmUnitsProducable.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("10 EGGS PER PACK");
		lblNewLabel_2.setBounds(243, 204, 124, 23);
		frmUnitsProducable.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("20 EGGS PER PACK");
		lblNewLabel_3.setBounds(415, 204, 127, 23);
		frmUnitsProducable.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//---------------------------------------------------------------------------------------------	
			if (TotalEggs>0){
				if (eggwhitsRadioButton.isSelected()==true&&smallRadioButton.isSelected()==true ){
					
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /5)+" packs of Egg whites  Are producable");
					
				}if (eggwhitsRadioButton.isSelected()==true&&mediumRadioButton.isSelected()==true ){
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /10)+" packs of Egg whites  Are producable");
					
				}if (eggwhitsRadioButton.isSelected()==true&&largeRadioButton.isSelected()==true ){
					
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /20)+" packs of Egg whites  Are producable");
				}
				//------------------------------------------------------end off egg whites -------------------------
				
                 if (liquideggsRadioButton.isSelected()==true&&smallRadioButton.isSelected()==true ){
					
                		textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /5)+" packs of Liquid Eggs are producable");
    					
				}if (liquideggsRadioButton.isSelected()==true&&mediumRadioButton.isSelected()==true ){
					
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /10)+" packs of Liquid Eggs are producable");
					
				}if (liquideggsRadioButton.isSelected()==true&&largeRadioButton.isSelected()==true ){
					
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /20)+" packs of Liquid Eggs are producable");
					
				}
				//---------------------------end off liquid eggs---------------------------------------
				

                if (boiledRadioButton.isSelected()==true&&smallRadioButton.isSelected()==true ){
                	textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /5)+" packs of boiled Eggs  are producable");
					
				}if (boiledRadioButton.isSelected()==true&&mediumRadioButton.isSelected()==true ){
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /10)+" packs of boiled Eggs  are producable");
					
					
				}if (boiledRadioButton.isSelected()==true&&largeRadioButton.isSelected()==true ){
					textArea.setText("\n\n\tWith the current egg supply "+(TotalEggs /20)+" packs of boiled Eggs  are producable");
					
					
				}
				
				}else{
					
					
					textArea.setText("\n\n\n\n\t\t\t\t No Eggs Found ");
					
					
				}
				
				
				
				
				
		//-------------------------------------------------------------------------------------------------------		
			}
		});
		btnNewButton.setBounds(454, 387, 133, 23);
		frmUnitsProducable.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SUBORDINATEMENUFRAME window = new SUBORDINATEMENUFRAME();
					window.frmSupplyProvisionsUnits.setVisible(true);
					frmUnitsProducable.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(44, 387, 133, 23);
		frmUnitsProducable.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FETCH\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Database DB =new Database();
				TotalEggs=DB.getTotlalCollectedeggs();
				maxeggtextarea.setText("\tThere are "+TotalEggs+" eggs available  at the moment.");
				
				
			}
		});
		btnNewButton_2.setBounds(490, 36, 115, 47);
		frmUnitsProducable.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(106, 90, 205));
		separator.setBackground(new Color(0, 0, 128));
		separator.setBounds(11, 94, 594, 11);
		frmUnitsProducable.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 35, 451, 47);
		frmUnitsProducable.getContentPane().add(scrollPane);
		
		maxeggtextarea = new JTextArea();
		maxeggtextarea.setFont(new Font("Monospaced", Font.BOLD, 14));
		maxeggtextarea.setEditable(false);
		scrollPane.setViewportView(maxeggtextarea);
		maxeggtextarea.setText("\t Select Fetch to View the Total Usable Eggs ");
		
		textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(69, 239, 492, 142);
		frmUnitsProducable.getContentPane().add(textArea);
		textArea.setText(" \r\n\r\n\r\n\tSelect a Type and Size then  Click Calculate");
		
		
	}
}
