package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

import controller.LoginController;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import model.Size;
import model.DressType;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class DressPage extends Screen {
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public DressPage() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(279, 13, 203, 240);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Dress Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(150, 11, 119, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType.setBounds(24, 50, 61, 36);
		getContentPane().add(lblType);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSize.setBounds(24, 86, 61, 36);
		getContentPane().add(lblSize);
		
		JLabel lblType_1_1 = new JLabel("Color");
		lblType_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_1.setBounds(24, 126, 61, 36);
		getContentPane().add(lblType_1_1);
		
		JLabel lblType_1_1_1 = new JLabel("Price");
		lblType_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_1_1.setBounds(24, 209, 61, 36);
		getContentPane().add(lblType_1_1_1);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setForeground(Color.BLACK);
		textField.setBounds(133, 219, 124, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add to shoping cart");

		btnNewButton.setBounds(132, 266, 173, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(24, 171, 76, 36);
		getContentPane().add(lblQuantity);
		
		JSpinner spinner = new JSpinner();

		spinner.setBounds(132, 181, 43, 20);
		getContentPane().add(spinner);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yellow", "Black", "Blue", "White", "Pink", "Red", "Gray"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(133, 135, 119, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Size.values()));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(133, 95, 119, 22);
		getContentPane().add(comboBox_1);
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(DressType.values()));
		comboBox_1_1.setSelectedIndex(0);
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBounds(133, 59, 119, 22);
		getContentPane().add(comboBox_1_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { //P.S this code is copied instead of function creation because Eclipse derieve access to local public function claiming they doesn't exist and need to be created but when you auto generate them it tells you it have the same name as the other function and YES this doesn't happened with the same syntax at InteliJ the god given gift.
					double p=Supervisor.Pricer("dress", comboBox_1_1.getSelectedItem().toString().toLowerCase(), comboBox.getSelectedItem().toString().toLowerCase(), comboBox_1.getSelectedItem().toString().toLowerCase());
					double p2=p*Integer.parseInt(spinner.getValue().toString());
					textField.setText(String.valueOf(p2));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	
		
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try { //P.S this code is copied instead of function creation because Eclipse derieve access to local public function claiming they doesn't exist and need to be created but when you auto generate them it tells you it have the same name as the other function and YES this doesn't happened with the same syntax at InteliJ the god given gift.
					double p=Supervisor.Pricer("dress", comboBox_1_1.getSelectedItem().toString().toLowerCase(), comboBox.getSelectedItem().toString().toLowerCase(), comboBox_1.getSelectedItem().toString().toLowerCase());
					double p2=p*Integer.parseInt(spinner.getValue().toString());
					textField.setText(String.valueOf(p2));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(3);
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String col=comboBox.getSelectedItem().toString();
				String pth=null;
				boolean flag=false;
				if(col=="Black")
				{
					pth="img\\Items\\BlackDress.jpg";
					flag=true;
				}
				else if(col=="Green")
				{
					pth="img\\Items\\GreenDress.jpg";
					flag=true;
				}
				else if(col=="Red")
				{
					pth="img\\Items\\RedDress.jpg";
					flag=true;
				}
				else if(col=="White")
				{
					pth="img\\Items\\WhiteDress.jpg";
					flag=true;
				}
				else if(col=="Yellow")
				{
					pth="img\\Items\\YellowDress.jpg";
					flag=true;
				}
				
				if(flag) 
				{	
					
						Image image = new ImageIcon(pth).getImage();
						Image scaledImage = image.getScaledInstance(btnNewButton_1.getWidth(),btnNewButton_1.getHeight(),Image.SCALE_SMOOTH);
						btnNewButton_1.setIcon(new ImageIcon(scaledImage));
				}
				try { //P.S this code is copied instead of function creation because Eclipse derieve access to local public function claiming they doesn't exist and need to be created but when you auto generate them it tells you it have the same name as the other function and YES this doesn't happened with the same syntax at InteliJ the god given gift.
					double p=Supervisor.Pricer("dress", comboBox_1_1.getSelectedItem().toString().toLowerCase(), comboBox.getSelectedItem().toString().toLowerCase(), comboBox_1.getSelectedItem().toString().toLowerCase());
					double p2=p*Integer.parseInt(spinner.getValue().toString());
					textField.setText(String.valueOf(p2));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				try { //P.S this code is copied instead of function creation because Eclipse derieve access to local public function claiming they doesn't exist and need to be created but when you auto generate them it tells you it have the same name as the other function and YES this doesn't happened with the same syntax at InteliJ the god given gift.
					double p=Supervisor.Pricer("dress", comboBox_1_1.getSelectedItem().toString().toLowerCase(), comboBox.getSelectedItem().toString().toLowerCase(), comboBox_1.getSelectedItem().toString().toLowerCase());
					double p2=p*Integer.parseInt(spinner.getValue().toString());
					textField.setText(String.valueOf(p2));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnCancel.setBounds(15, 254, 106, 35);
		getContentPane().add(btnCancel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id=100;
				try {
					id = Supervisor.getproductid("dress", comboBox_1_1.getSelectedItem().toString().toLowerCase(), comboBox.getSelectedItem().toString().toLowerCase(), comboBox_1.getSelectedItem().toString().toLowerCase());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				double price= Double.parseDouble(textField.getText().toString());
				int count = Integer.parseInt(spinner.getValue().toString());
				Supervisor.addtocart(id, count, price);
				JOptionPane.showMessageDialog(null, "Added to cart!"); //Combining matching lines isn't implanted because it is black work and not course related
		
			}
		});
		
	}
}
