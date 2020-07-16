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

public class Stock extends Screen {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Stock() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Managment Stock Inventory");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(133, 0, 302, 36);
		getContentPane().add(lblNewLabel);
		
		JLabel lblType = new JLabel("Product name");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType.setBounds(24, 50, 111, 36);
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
		lblType_1_1_1.setBounds(24, 349, 61, 36);
		getContentPane().add(lblType_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(150, 357, 186, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblQuantity = new JLabel("amount");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(24, 175, 76, 29);
		getContentPane().add(lblQuantity);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(150, 179, 43, 20);
		getContentPane().add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yellow", "Black", "Blue", "White", "Pink", "Red", "Gray"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(150, 133, 186, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Size.values()));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(150, 93, 186, 22);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(DressType.values()));
		comboBox_1_1.setSelectedIndex(0);
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBounds(150, 215, 186, 22);
		getContentPane().add(comboBox_1_1);
		
		JLabel lblType_1 = new JLabel("dress type");
		lblType_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1.setBounds(24, 213, 78, 36);
		getContentPane().add(lblType_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"dress", "pants", "shirt", "short"}));
		comboBox_1_1_1.setSelectedIndex(0);
		comboBox_1_1_1.setEditable(true);
		comboBox_1_1_1.setBounds(150, 64, 186, 22);
		getContentPane().add(comboBox_1_1_1);
		
		JLabel lblType_1_2 = new JLabel("pants type");
		lblType_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_2.setBounds(24, 246, 78, 36);
		getContentPane().add(lblType_1_2);
		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setSelectedIndex(0);
		comboBox_1_1_2.setEditable(true);
		comboBox_1_1_2.setBounds(150, 251, 186, 22);
		getContentPane().add(comboBox_1_1_2);
		
		JLabel lblType_1_2_1 = new JLabel("sleeves");
		lblType_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_1_2_1.setBounds(24, 278, 78, 36);
		getContentPane().add(lblType_1_2_1);
		
		JComboBox comboBox_1_1_2_1 = new JComboBox();
		comboBox_1_1_2_1.setSelectedIndex(0);
		comboBox_1_1_2_1.setEditable(true);
		comboBox_1_1_2_1.setBounds(150, 283, 186, 22);
		getContentPane().add(comboBox_1_1_2_1);
		
		JLabel lblType_2 = new JLabel("Length");
		lblType_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblType_2.setBounds(24, 318, 61, 36);
		getContentPane().add(lblType_2);
		
		JComboBox comboBox_1_1_2_1_1 = new JComboBox();
		comboBox_1_1_2_1_1.setSelectedIndex(0);
		comboBox_1_1_2_1_1.setEditable(true);
		comboBox_1_1_2_1_1.setBounds(150, 323, 186, 22);
		getContentPane().add(comboBox_1_1_2_1_1);
		
		JButton btnNewButton = new JButton("delete");
		btnNewButton.setBounds(228, 398, 102, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(345, 398, 102, 29);
		getContentPane().add(btnCancel);
		
		JButton btnNewButton_1 = new JButton("stock\r\n inventory");
		btnNewButton_1.setBounds(425, 54, 154, 36);
		getContentPane().add(btnNewButton_1);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setBounds(111, 398, 102, 29);
		getContentPane().add(btnAdd);

	}
}
