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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageAdvertisement extends JFrame {

	private JPanel contentPane;
	private JTextField qticket;
	private JTextField discountR;
	private static String q;
	private static String disc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageAdvertisement frame = new ManageAdvertisement();
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
	public ManageAdvertisement() {
		setBounds(100, 100, 633, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 614, 86);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Above");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(25, 31, 67, 22);
		panel.add(lblNewLabel);
		
		qticket = new JTextField();
		qticket.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		qticket.setBounds(87, 31, 47, 25);
		panel.add(qticket);
		qticket.setColumns(10);
		
		JLabel lblTicketsPriceWill = new JLabel("tickets will get ");
		lblTicketsPriceWill.setForeground(Color.WHITE);
		lblTicketsPriceWill.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblTicketsPriceWill.setBounds(144, 30, 127, 25);
		panel.add(lblTicketsPriceWill);
		
		discountR = new JTextField();
		discountR.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		discountR.setColumns(10);
		discountR.setBounds(280, 31, 47, 25);
		panel.add(discountR);
		
		JLabel lblDiscount = new JLabel("% discount     ");
		lblDiscount.setForeground(Color.WHITE);
		lblDiscount.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblDiscount.setBounds(337, 31, 114, 22);
		panel.add(lblDiscount);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				q=qticket.getText();
				disc=discountR.getText();
				
				try {
					Calculation obj = new Calculation();
					Event frame = new Event(q,disc); //open event page using constructor with 4 arguments
					frame.setVisible(true);
					setVisible(false);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				
			}
			
		});
		btnSubmit.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		btnSubmit.setBackground(new Color(255, 105, 180));
		btnSubmit.setBounds(519, 6, 89, 23);
		panel.add(btnSubmit);
	}
	
	public static String getQ() {
		return q;
	}
	
	public static String getD() {
		return disc;
	}

}
