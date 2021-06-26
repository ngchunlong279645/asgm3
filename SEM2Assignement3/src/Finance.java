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

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private static double totalDonation;

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
	
	public void setDonation(double d) {
		this.totalDonation=d;
	}

	/**
	 * Create the frame.
	 */
	public Finance() {
		setBounds(100, 100, 800, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 784, 410);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 3, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(335, 29, 253, 217);
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
		
		textField = new JTextField();
		textField.setText(Double.toString(totalDonation));
		textField.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField.setBounds(157, 67, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(157, 116, 86, 20);
		panel_1.add(textField_1);
		
		JLabel lblOtherIncome = new JLabel("Other Income");
		lblOtherIncome.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblOtherIncome.setBounds(10, 167, 134, 25);
		panel_1.add(lblOtherIncome);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(157, 167, 86, 20);
		panel_1.add(textField_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 3, 5, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(31, 29, 253, 313);
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
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(154, 70, 86, 20);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(154, 119, 86, 20);
		panel_3.add(textField_4);
		
		JLabel lblEventExpenses = new JLabel("Event Expenses");
		lblEventExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblEventExpenses.setBounds(10, 173, 148, 25);
		panel_3.add(lblEventExpenses);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(154, 175, 86, 20);
		panel_3.add(textField_5);
		
		JLabel lblOtherExpenses = new JLabel("Other Expenses");
		lblOtherExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblOtherExpenses.setBounds(10, 227, 148, 25);
		panel_3.add(lblOtherExpenses);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(154, 229, 86, 20);
		panel_3.add(textField_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(3, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_5.setBackground(SystemColor.menu);
		panel_5.setBounds(335, 249, 253, 45);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(3, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(SystemColor.menu);
		panel_6.setBounds(32, 347, 253, 45);
		panel.add(panel_6);
	}
}
