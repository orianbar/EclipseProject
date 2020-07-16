package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class UserDetails extends Screen {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public UserDetails() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Client Details");
		lblNewLabel.setBounds(216, 5, 235, 48);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 39));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(65, 111, 133, 25);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(228, 114, 213, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(65, 181, 133, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 154, 213, 25);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(65, 148, 133, 25);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 187, 213, 25);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Credit-card");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(65, 217, 133, 25);
		getContentPane().add(lblNewLabel_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 223, 213, 25);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("CVV");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1.setBounds(65, 251, 133, 25);
		getContentPane().add(lblNewLabel_1_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(228, 259, 213, 25);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Date-exp");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1_1.setBounds(65, 285, 133, 25);
		getContentPane().add(lblNewLabel_1_1_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(228, 295, 213, 25);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_2_1_1_1.setBounds(65, 321, 133, 25);
		getContentPane().add(lblNewLabel_1_1_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(228, 329, 213, 25);
		getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(336, 381, 105, 33);
		getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(228, 381, 98, 33);

		getContentPane().add(btnCancel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Doli1991\\eclipse-workspace\\Store\\img\\Home.png"));
		btnNewButton_1.setBounds(550, 11, 60, 42);
		getContentPane().add(btnNewButton_1);

	}

}
