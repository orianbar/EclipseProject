package view;

import java.awt.Font;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;


public class HomePage extends Screen {
	

	/**
	 * Create the panel.
	 */
	public HomePage() {
		setBackground(new Color(245, 245, 220));
		getContentPane().setLayout(null);
		JButton btnNewButton;
		
		JLabel lblNewLabel = new JLabel("LIOX");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 26));
		lblNewLabel.setBounds(208, 11, 78, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose your outfit");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(181, 36, 138, 27);
		getContentPane().add(lblNewLabel_1);
		
		 btnNewButton = new JButton("Shirt");
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.setBackground(new Color(0, 0, 0));
		 btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		 btnNewButton.setIcon(new ImageIcon("img\\shirts.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(5);
			}
		});
		btnNewButton.setBounds(259, 102, 209, 86);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dress");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Swap(8);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("img\\dress1.png"));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		btnNewButton_1.setBounds(20, 102, 198, 86);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Jeans");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("img\\jeans1.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(4);
			}
		});
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		btnNewButton_2.setBounds(259, 199, 209, 86);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Shorts");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(9);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("img\\shorts1.png"));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		btnNewButton_3.setBounds(20, 199, 198, 86);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Swap(1);
			}
		});
		btnNewButton_4.setBackground(new Color(25, 25, 112));
		btnNewButton_4.setBounds(380, 295, 88, 27);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CheckOut");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(10);
			}
		});
		
		
		
		btnNewButton_5.setBounds(337, 17, 97, 25);
		getContentPane().add(btnNewButton_5);
		//Image img = new ImageIcon(this.getClass().getResource("/12177-t-shirt-icon.png")).getImage();

	}
}
