import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField totalD;
	private JTextField totalS;
	private JTextField totalU;
	private JTextField totalA;
	private JTextField totalE;
	private static double totalDonation;
	private JTextField totalIncome;
	private JTextField totalExpenses;
	private JTextField netIncome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public Finance() {
		setBounds(100, 100, 647, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 631, 446);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(26, 25, 253, 158);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 0, 253, 45);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		
		JLabel lblNewLabel = new JLabel("Total Income");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 220, 34);
		panel_2.add(lblNewLabel);
		
		JLabel lblTotalDonation = new JLabel("Total Donation");
		lblTotalDonation.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblTotalDonation.setBounds(10, 65, 134, 25);
		panel_1.add(lblTotalDonation);
		
		JLabel lblEventSales = new JLabel("Event Sales");
		lblEventSales.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblEventSales.setBounds(10, 114, 134, 25);
		panel_1.add(lblEventSales);
		
		totalD = new JTextField();
		totalD.setText(Double.toString(Donation.getTotal()));
		totalD.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalD.setBounds(157, 67, 86, 20);
		panel_1.add(totalD);
		totalD.setColumns(10);
		
		totalS = new JTextField();
		totalS.setText(Double.toString(EventRegistration.getTotal())); 
		totalS.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalS.setColumns(10);
		totalS.setBounds(157, 116, 86, 20);
		panel_1.add(totalS);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(26, 209, 253, 209);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(0, 0, 253, 45);
		panel_3.add(panel_4);
		
		JLabel lblTotalExpenses = new JLabel("Total Expenses");
		lblTotalExpenses.setForeground(Color.WHITE);
		lblTotalExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblTotalExpenses.setBounds(10, 11, 233, 34);
		panel_4.add(lblTotalExpenses);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblAdvertisement.setBounds(10, 117, 134, 25);
		panel_3.add(lblAdvertisement);
		
		JLabel lblUtility = new JLabel("Utility");
		lblUtility.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblUtility.setBounds(10, 68, 134, 25);
		panel_3.add(lblUtility);
		
		totalU = new JTextField();
		totalU.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalU.setColumns(10);
		totalU.setBounds(154, 70, 86, 20);
		panel_3.add(totalU);
		
		totalA = new JTextField();
		totalA.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalA.setColumns(10);
		totalA.setBounds(154, 119, 86, 20);
		panel_3.add(totalA);
		
		JLabel lblEventExpenses = new JLabel("Event Expenses");
		lblEventExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblEventExpenses.setBounds(10, 173, 148, 25);
		panel_3.add(lblEventExpenses);
		
		totalE = new JTextField();
		totalE.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalE.setColumns(10);
		totalE.setBounds(154, 175, 86, 20);
		panel_3.add(totalE);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(347, 25, 253, 316);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(0, 0, 253, 45);
		panel_5.add(panel_6);
		
		JLabel lblReport = new JLabel("Report");
		lblReport.setForeground(Color.WHITE);
		lblReport.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblReport.setBounds(10, 11, 233, 34);
		panel_6.add(lblReport);
		
		JLabel lblTotalExpenses_1 = new JLabel("Total Expenses");
		lblTotalExpenses_1.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblTotalExpenses_1.setBounds(10, 117, 134, 25);
		panel_5.add(lblTotalExpenses_1);
		
		JLabel lblTotalIncome = new JLabel("Total Income\r\n");
		lblTotalIncome.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblTotalIncome.setBounds(10, 68, 134, 25);
		panel_5.add(lblTotalIncome);
		
		totalIncome = new JTextField();
		totalIncome.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalIncome.setColumns(10);
		totalIncome.setBounds(154, 70, 86, 20);
		panel_5.add(totalIncome);
		
		totalExpenses = new JTextField();
		totalExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalExpenses.setColumns(10);
		totalExpenses.setBounds(154, 119, 86, 20);
		panel_5.add(totalExpenses);
		
		JLabel lblNetIncome = new JLabel("Net Income");
		lblNetIncome.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNetIncome.setBounds(10, 203, 148, 25);
		panel_5.add(lblNetIncome);
		
		netIncome = new JTextField();
		netIncome.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		netIncome.setColumns(10);
		netIncome.setBounds(154, 205, 86, 20);
		panel_5.add(netIncome);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalU.setText("");
				totalA.setText("");
				totalE.setText("");
				totalIncome.setText("");
				totalExpenses.setText("");
				netIncome.setText("");
			}
		});
		btnNewButton.setBounds(22, 272, 89, 33);
		panel_5.add(btnNewButton);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ttlD = Double.parseDouble(totalD.getText());
				double ttlS = Double.parseDouble(totalS.getText());
				double ttlU = Double.parseDouble(totalU.getText());
				double ttlA = Double.parseDouble(totalA.getText());
				double ttlE = Double.parseDouble(totalE.getText());
				
				double ttlI=ttlD+ttlS;
				double ttlX=ttlU+ttlA+ttlE;
				double net=ttlI-ttlX;
				
				totalIncome.setText(Double.toString(ttlI));
				totalExpenses.setText(Double.toString(ttlX));
				netIncome.setText(Double.toString(net));	
				
			}
		});
		btnNewButton_1.setBounds(121, 272, 113, 33);
		panel_5.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(127, 255, 212));
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 190, 230, 2);
		panel_5.add(separator);
	}
}
