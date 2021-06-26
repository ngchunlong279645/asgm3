import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Donation extends JFrame {
	private JPanel contentPane;
	private JTextField donateName;
	private JTextField donateAmount;
	private JTextArea textReceipt;
	private static double total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donation frame = new Donation();
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
	public Donation() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 165, 0)));
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(0, 0, 828, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		label_1.setBounds(254, 207, 70, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Amount");
		label_2.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		label_2.setBounds(254, 237, 70, 17);
		panel.add(label_2);
		
		donateName = new JTextField();
		donateName.setFont(new Font("Tekton Pro", Font.BOLD, 14));
		donateName.setColumns(10);
		donateName.setBounds(335, 203, 86, 20);
		panel.add(donateName);
		
		donateAmount = new JTextField();
		donateAmount.setFont(new Font("Tekton Pro", Font.BOLD, 14));
		donateAmount.setColumns(10);
		donateAmount.setBounds(334, 234, 86, 20);
		panel.add(donateAmount);
		
		JButton button = new JButton("Clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donateName.setText("");
				donateAmount.setText("");
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tekton Pro", Font.BOLD, 13));
		button.setBackground(Color.GRAY);
		button.setBounds(254, 285, 70, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Donate");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String donation = donateAmount.getText();
				total =Integer.parseInt(donation)+total;
				
				Finance frame = new Finance();
				frame.setDonation(total);
				textReceipt.append("===============\n");
				textReceipt.append("____RECEIPT____\n");
				textReceipt.append("===============\n");
				textReceipt.append("Name  :   "+donateName.getText()+"\n");
				textReceipt.append("Amount:   RM"+donateAmount.getText()+"\n");
				JOptionPane.showMessageDialog(null, "Thank You For Your Donation");
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tekton Pro Ext", Font.BOLD, 11));
		button_1.setBackground(new Color(152, 251, 152));
		button_1.setBounds(335, 284, 76, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Print Receipt");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textReceipt.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		button_2.setFont(new Font("Tekton Pro", Font.BOLD, 13));
		button_2.setBackground(new Color(135, 206, 250));
		button_2.setBounds(478, 322, 111, 23);
		panel.add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(468, 205, 139, 103);
		panel.add(scrollPane);
		
		textReceipt = new JTextArea();
		textReceipt.setFont(new Font("Tekton Pro", Font.PLAIN, 13));
		textReceipt.setBackground(SystemColor.scrollbar);
		scrollPane.setViewportView(textReceipt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 165, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(0, 0, 193, 434);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserHome frame = new UserHome() ;
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 40, 93, 48);
		panel_1.add(lblNewLabel);
		
		JLabel lblEvent = new JLabel("EVENT");
		lblEvent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Event frame = new Event() ;
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblEvent.setForeground(Color.BLACK);
		lblEvent.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblEvent.setBounds(10, 134, 93, 48);
		panel_1.add(lblEvent);
		
		JLabel lblDonation = new JLabel("DONATION");
		lblDonation.setForeground(Color.WHITE);
		lblDonation.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblDonation.setBounds(10, 232, 132, 48);
		panel_1.add(lblDonation);
		
		JLabel lblVolunteer = new JLabel("VOLUNTEER");
		lblVolunteer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VolunteerTeacher frame = new VolunteerTeacher ();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		lblVolunteer.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblVolunteer.setBounds(10, 345, 174, 48);
		panel_1.add(lblVolunteer);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setBounds(729, 11, 89, 23);
		panel.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Donation.class.getResource("/IMAGE/header_NGOhub-Campaign-Header.jpg")));
		label.setBounds(188, 0, 640, 434);
		panel.add(label);
	}
}
