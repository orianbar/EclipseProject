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
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class CreateNewUser extends Screen {
	
	
	
	private LoginController lc=new LoginController();
	private JTextField nameField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private boolean member=false;
	private boolean worker=false;
	//private Screen mainframe;
	
	
	/**
	 * Create the panel.
	 */
	public CreateNewUser() {//(Screen mainframe)
		getContentPane().setLayout(null);
		//this.mainframe=mainframe;
		JLabel lblNewLabel = new JLabel("New Customer");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 40));
		lblNewLabel.setBounds(134, 16, 276, 54);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 86, 102, 35);
		getContentPane().add(lblNewLabel_1);
		
		nameField = new JTextField();
		nameField.setBounds(197, 91, 171, 24);
		getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(31, 129, 102, 29);
		getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(197, 131, 171, 29);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals("")||nameField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Username and password can't be null");
					return;
				}
				if(!passwordField.getText().equals(passwordField_1.getText()))
				{
					JOptionPane.showMessageDialog(null, "Passwords don't match");
					return;
				}
				if(worker==true&&member==true)
				{
					JOptionPane.showMessageDialog(null, "You can't be member and worker not double discounts!");
					return;
				}
				if(worker==true)
				{
					if(!(passwordField_3.getText().equals("11111")))
					{
						JOptionPane.showMessageDialog(null, "Wrong worker number");
						return;
					}
					
				}
				else if(member==true)
				{
					if(!(passwordField_2.getText().equals("12345")))
					{
						JOptionPane.showMessageDialog(null, "Wrong member number");
						return;
					}
				}
				
				
				try {
					String use1=nameField.getText();
					String Pass1=passwordField.getText();
					String reply=Supervisor.RegisterPretest(use1, Pass1, member, worker);
					if(!reply.equals("GOOD"))
					{
						JOptionPane.showMessageDialog(null, reply);
						return;
					}
					else
						reply=Supervisor.Register(use1, Pass1, member, worker);
					JOptionPane.showMessageDialog(null, reply);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnNewButton.setBounds(132, 359, 106, 35);
		//btnNewButton.addActionListener(new ActionListener() {
			//@Override
			//public void actionPerformed(ActionEvent e) {
				//mainframe.setVisibility();
				
			//}});
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password confirm");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(31, 174, 171, 35);
		getContentPane().add(lblNewLabel_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(197, 181, 171, 24);
		getContentPane().add(passwordField_1);
		
		JCheckBox CheckMember = new JCheckBox("Member");
		CheckMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(CheckMember.isSelected())
				{
					member=true;
					passwordField_2.setEnabled(true);
				}
				else
				{	member=false;
				passwordField_2.setEnabled(false);
				}
			}
		});
		CheckMember.setBounds(31, 221, 139, 29);
		getContentPane().add(CheckMember);
		
		JCheckBox CheckWorker = new JCheckBox("Worker");
		CheckWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CheckWorker.isSelected())
				{
					worker=true;
					passwordField_3.setEnabled(true);
				}
				else {
					worker=false;
					passwordField_3.setEnabled(false);
				}
			}
		});
		CheckWorker.setBounds(31, 258, 139, 29);
		getContentPane().add(CheckWorker);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(1);
			}
		});
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnCancel.setBounds(273, 359, 106, 35);
		getContentPane().add(btnCancel);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setEnabled(false);
		passwordField_2.setBounds(302, 230, 70, 20);
		getContentPane().add(passwordField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("member NO");
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(197, 224, 90, 20);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("worker NO");
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_2_1_1.setBounds(197, 261, 83, 20);
		getContentPane().add(lblNewLabel_1_2_1_1);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setEnabled(false);
		passwordField_3.setBounds(298, 267, 70, 20);
		getContentPane().add(passwordField_3);
		
		

	}

}
