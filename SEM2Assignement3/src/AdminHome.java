import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class AdminHome extends JFrame {


	private JPanel contentPane;
	protected static String eventA;
	protected static String eventB;
	protected static String eventC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 105, 180)));
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 778, 486);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel_1.setBackground(new Color(255, 105, 180));
		panel_1.setBounds(0, 0, 248, 486);
		panel.add(panel_1);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setBounds(10, 53, 232, 54);
		panel_1.add(lblWelcome);
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		
		JLabel lblTo = new JLabel("TO\r\n");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		lblTo.setBounds(76, 151, 90, 54);
		panel_1.add(lblTo);
		
		JLabel lblAdmin = new JLabel("ADMIN");
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		lblAdmin.setBounds(33, 258, 159, 54);
		panel_1.add(lblAdmin);
		
		JLabel lblPortal = new JLabel("PORTAL");
		lblPortal.setForeground(Color.WHITE);
		lblPortal.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		lblPortal.setBounds(33, 369, 185, 54);
		panel_1.add(lblPortal);
		
		JLabel date = new JLabel("");
		date.setForeground(new Color(255, 255, 255));
		date.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		 Format dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");	
		date.setText(dateFormat.format(new Date()));
		date.setBounds(261, 21, 161, 14);
		panel.add(date);
		
		JLabel time = new JLabel("");
		time.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		time.setForeground(new Color(255, 255, 255));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.now();
		time.setText("Login in time: "+dtf.format(localTime));
		time.setBounds(463, 21, 161, 14);
		panel.add(time);
		
		JButton button = new JButton("Log Out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		button.setBackground(new Color(255, 105, 180));
		button.setBounds(680, 10, 89, 23);
		panel.add(button);
		
		JButton financeBtn = new JButton("");
		financeBtn.setIcon(new ImageIcon(AdminHome.class.getResource("/IMAGE/coin-us-dollar-icon.png")));
		financeBtn.setBounds(337, 86, 96, 96);
		panel.add(financeBtn);
		
		JLabel lblFinance = new JLabel("Finance");
		lblFinance.setForeground(Color.WHITE);
		lblFinance.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblFinance.setBounds(337, 213, 113, 37);
		panel.add(lblFinance);
		
		JButton button_1 = new JButton("");	// ManageAdvertisement button
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageAdvertisement frame = new ManageAdvertisement();
				frame.setVisible(true);
				
				
			}
		});
		button_1.setIcon(new ImageIcon(AdminHome.class.getResource("/IMAGE/megaphone-2-icon.png")));
		button_1.setBounds(571, 86, 96, 96);
		panel.add(button_1);
		
		JLabel lblManageAdvertisement = new JLabel("Manage\r\n");
		lblManageAdvertisement.setForeground(Color.WHITE);
		lblManageAdvertisement.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblManageAdvertisement.setBounds(571, 185, 113, 37);
		panel.add(lblManageAdvertisement);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setForeground(Color.WHITE);
		lblAdvertisement.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblAdvertisement.setBounds(519, 213, 190, 37);
		panel.add(lblAdvertisement);
		
		JButton button_2 = new JButton("");	//manage event
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageEvent frame = new ManageEvent();
				frame.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon(AdminHome.class.getResource("/IMAGE/calendar-icon.png")));
		button_2.setBounds(337, 300, 96, 96);
		panel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageUserPage frame = new ManageUserPage();
				frame.setVisible(true);
			}
		});
		button_3.setIcon(new ImageIcon(AdminHome.class.getResource("/IMAGE/solicon.PNG")));
		button_3.setBounds(571, 300, 96, 96);
		panel.add(button_3);
		
		JLabel lblEvent = new JLabel("Event\r\n");
		lblEvent.setForeground(Color.WHITE);
		lblEvent.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblEvent.setBounds(347, 425, 113, 37);
		panel.add(lblEvent);
		
		JLabel label = new JLabel("Manage\r\n");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		label.setBounds(337, 396, 113, 37);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Manage\r\n");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		label_1.setBounds(571, 396, 113, 37);
		panel.add(label_1);
		
		JLabel lblOrganisation = new JLabel("User Page");
		lblOrganisation.setForeground(Color.WHITE);
		lblOrganisation.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblOrganisation.setBounds(558, 425, 175, 37);
		panel.add(lblOrganisation);
	}
}
