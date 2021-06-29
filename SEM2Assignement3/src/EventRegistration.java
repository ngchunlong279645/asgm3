import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class EventRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField quantity;
	private static JTable table;
	private double price=0;
	private String discount;
	private static double total;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventRegistration frame = new EventRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static double getTotal() {					// using looping to count the total sales of event
		if(table!=null) {
		for(int i=0;i<table.getRowCount();i++) {
			String t = String.valueOf(table.getValueAt(i, 7));
			total+=Double.parseDouble(t);
		}
		}
		return total;		// return in double
	}
	

	/**
	 * Create the frame.
	 */
	EventRegistration(){};
	public EventRegistration(String q,String d) {	// constructor with 2 argm
		JTable tt = ManageEvent.getTable();			// get the table from Manage Event Frame
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 842, 508);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(21, 27, 791, 73);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Event Registration System");
		label.setFont(new Font("Tahoma", Font.BOLD, 45));
		label.setBounds(90, 11, 616, 51);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(21, 111, 252, 276);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(20, 30, 62, 14);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Age");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(20, 63, 62, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Gender");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(20, 100, 62, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Event");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(20, 136, 62, 14);
		panel_2.add(label_4);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 11));
		name.setColumns(10);
		name.setBounds(100, 27, 127, 20);
		panel_2.add(name);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 11));
		age.setColumns(10);
		age.setBounds(100, 60, 127, 20);
		panel_2.add(age);
		
		JComboBox gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Male", "Female"}));
		gender.setFont(new Font("Tahoma", Font.BOLD, 11));
		gender.setBounds(98, 97, 129, 20);
		panel_2.add(gender);
		
		JComboBox event = new JComboBox();
		event.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", String.valueOf( tt.getValueAt(0, 0)), String.valueOf( tt.getValueAt(1, 0)), String.valueOf( tt.getValueAt(2, 0))}));
		event.setFont(new Font("Tahoma", Font.BOLD, 11));
		event.setBounds(98, 133, 129, 20);
		panel_2.add(event);
		
		JLabel label_5 = new JLabel("Quantity");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(20, 183, 62, 14);
		panel_2.add(label_5);
		
		quantity = new JTextField();
		quantity.setFont(new Font("Tahoma", Font.BOLD, 11));
		quantity.setColumns(10);
		quantity.setBounds(100, 180, 127, 20);
		panel_2.add(quantity);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(21, 398, 791, 87);
		panel.add(panel_3);
		
		JButton button = new JButton("ADD RECORD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				if(event.getSelectedItem().equals(String.valueOf( tt.getValueAt(0, 0)))) {  // event name
					String p =String.valueOf( tt.getValueAt(0, 4));							//set price
					price=Integer.parseInt(p);
				}
				else if(event.getSelectedItem().equals(String.valueOf( tt.getValueAt(1, 0)))) {
					String p =String.valueOf( tt.getValueAt(1, 4));
					price=Integer.parseInt(p);
				}
				else if(event.getSelectedItem().equals(String.valueOf( tt.getValueAt(2, 0)))) {
					String p =String.valueOf( tt.getValueAt(2, 4));
					price=Integer.parseInt(p);
				}
				
				
				CAL cal = new Calculation();	// use calculation class to count total price 
				cal.setDiscount(Integer.parseInt(d));	//set discount 
				cal.setQuantity(Integer.parseInt(q));	//set quantity
				double totalPrice=cal.totalPrice(price, Integer.parseInt( quantity.getText()));
				if(Integer.parseInt( quantity.getText())>Integer.parseInt(q)) {
					discount=d+"%";
				}
				else {
					discount="0%";
				}
				
				
				model.addRow(new Object[]{
						name.getText(),
						age.getText(),
						gender.getSelectedItem(),
						event.getSelectedItem(),
						price,
						quantity.getText(),	
						discount,
						totalPrice,
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Event Update confirmed", "Event Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(10, 23, 135, 38);
		panel_3.add(button);
		
		JButton button_1 = new JButton("RESET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				age.setText("");
				gender.setSelectedItem("Make a selection");
				event.setSelectedItem("Make a selection");
				quantity.setText("");		
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(155, 23, 94, 38);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("DELETE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
			if(table.getSelectedRow()==-1) {
				if(table.getRowCount()==0) {
					JOptionPane.showMessageDialog(null,"No data to delete",
							"Event Management System", JOptionPane.OK_OPTION);
				}else {
					JOptionPane.showMessageDialog(null,"Select a row to delete",
							"Event Management System", JOptionPane.OK_OPTION);
				}
			}else {
				model.removeRow(table.getSelectedRow());
			}
		}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(468, 23, 94, 38);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("EXIT");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(687, 23, 94, 38);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("PRINT");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(364, 23, 94, 38);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("UPLOAD");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Ivy Ng\\Desktop\\java tutorials\\SEM2Assignement3\\src\\eventRegisterList.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBounds(572, 23, 105, 38);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("UPDATE");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(event.getSelectedItem().equals(String.valueOf( tt.getValueAt(0, 0)))) {
					String p =String.valueOf( tt.getValueAt(0, 4));
					price=Integer.parseInt(p);
				}
				else if(event.getSelectedItem().equals(String.valueOf( tt.getValueAt(1, 0)))) {
					String p =String.valueOf( tt.getValueAt(1, 4));
					price=Integer.parseInt(p);
				}
				else if(event.getSelectedItem().equals(String.valueOf( tt.getValueAt(2, 0)))) {
					String p =String.valueOf( tt.getValueAt(2, 4));
					price=Integer.parseInt(p);
				}
				
				CAL cal = new Calculation();
				cal.setDiscount(Integer.parseInt(d));
				cal.setQuantity(Integer.parseInt(q));
				double totalPrice=cal.totalPrice(price, Integer.parseInt( quantity.getText()));
				if(Integer.parseInt( quantity.getText())>Integer.parseInt(q)) {
					discount=d+"%";
				}
				else {
					discount="0%";
				}
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(name.getText(),i,0);
			    	model.setValueAt(age.getText(),i,1);
			    	model.setValueAt(gender.getSelectedItem(),i,2);
			    	model.setValueAt(event.getSelectedItem(),i,3);
			    	model.setValueAt(price,i,4);
			    	model.setValueAt(quantity.getText(),i,5);
			    	model.setValueAt(discount, i, 6);
			    	model.setValueAt(totalPrice, i, 7);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(260, 23, 94, 38);
		panel_3.add(button_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(283, 111, 529, 276);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 509, 254);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Age", "Gender", "Event", "Price", "Quantity", "Discount", "Total Price"
				}
			));
			scrollPane.setViewportView(table);
	}
	
}