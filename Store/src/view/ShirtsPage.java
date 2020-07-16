package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import model.Size;
import model.DressType;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShirtsPage extends Screen {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ShirtsPage() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shirt Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(133, 11, 119, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblType = new JLabel("Sleeves");
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
		textField.setEnabled(false);
		textField.setBounds(133, 219, 124, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add to shoping cart");
		btnNewButton.setBounds(161, 266, 197, 23);
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
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox_1_1.setSelectedIndex(0);
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBounds(133, 59, 119, 22);
		getContentPane().add(comboBox_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Doli1991\\eclipse-workspace\\Store\\img\\Home.png")); //TODO NO FAKELOCAL
		btnNewButton_1.setBounds(363, 11, 87, 29);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swap(3);
			}
		});
		btnNewButton_2.setBounds(24, 261, 115, 29);
		getContentPane().add(btnNewButton_2);

	}
}
