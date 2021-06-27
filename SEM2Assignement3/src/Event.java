import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Event extends JFrame {

	private JPanel contentPane;
	private  JTable table;
	private static String p1,p2,p3,p4,eventName4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event frame = new Event();
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
	public Event() {
		setTitle("Home");
		setBounds(100, 100, 844, 473);
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
		lblEvent.setForeground(Color.WHITE);
		lblEvent.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblEvent.setBounds(10, 134, 93, 48);
		panel_1.add(lblEvent);
		
		JLabel lblDonation = new JLabel("DONATION");
		lblDonation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Donation frame = new Donation();
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(221, 23, 479, 119);
		panel.add(panel_2);
		
		JLabel label = new JLabel("Advertisement");
		label.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		label.setBounds(10, 11, 139, 26);
		panel_2.add(label);
		
		JTextArea txtrAbove = new JTextArea();
		
		String q =ManageAdvertisement.getQ();		// get the quantity of discount from Manage Advertisment frame
		String d =ManageAdvertisement.getD();		//get the discount rate from manage advertisement frame
		if(q!=null&&d!=null) {
		txtrAbove.setText("----------------------------------------------------------\r\n*  Above " +q+ " tickets will get "+d+" % discount                                            \r\n----------------------------------------------------------");
		}
		txtrAbove.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 15));
		txtrAbove.setBackground(new Color(240, 230, 140));
		txtrAbove.setBounds(10, 35, 405, 73);
		panel_2.add(txtrAbove);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(220, 220, 220));
		panel_4.setBounds(221, 169, 577, 194);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 557, 172);
		panel_4.add(scrollPane);
		
		table = new JTable();
		JTable t = ManageEvent.getTable(); 		// pass the table from manage event to this event frame
		if(t!=null) {
		table=t;
		table.getColumnModel().getColumn(0).setPreferredWidth(162);
		scrollPane.setViewportView(table);
		}
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(q!=null&&d!=null) {
				EventRegistration frame = new EventRegistration(q, d); // pass the quantity of discount and discount rate to event registration
				frame.setVisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(697, 385, 89, 23);
		panel.add(btnNewButton_1);
	}
	

}
