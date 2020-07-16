package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import controller.LoginController;

import javax.swing.JButton;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JFrame;
import java.lang.Object;
import java.sql.SQLException;

import javax.swing.SwingUtilities;

public class Login extends Screen {
	
	
	
	private LoginController lc=new LoginController();
	private JTextField textField;
	private JPasswordField passwordField;
	//private Screen mainframe;
	
	
	/**
	 * Create the panel.
	 */
	public Login() {//Screen mainframe
		getContentPane().setLayout(null);
		//this.mainframe=mainframe;
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 40));
		lblNewLabel.setBounds(134, 24, 192, 54);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(48, 124, 102, 35);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(155, 135, 171, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(48, 170, 102, 35);
		getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 181, 171, 20);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				try {
					if(Supervisor.login(username, password))
					{
						Swap(3);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong credentials!");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		btnNewButton.setBounds(192, 229, 89, 23);
		//btnNewButton.addActionListener(new ActionListener() {
			//@Override
			//public void actionPerformed(ActionEvent e) {
				//mainframe.setVisibility();
				
			//}});
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Please enter User name and Password");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(99, 76, 253, 24);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("New user");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Swap(2);
			}
		});
		btnNewButton_1.setBounds(380, 24, 115, 29);
		getContentPane().add(btnNewButton_1);

	}
	//Magic
	
	
}
